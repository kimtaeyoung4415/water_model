$(function () { 
	"use strict";
	
	var _class = function(){
//////////////
// 공통  변수  영역
//////////////		
		
		var pub = {
				type : null,
				q_num : null,
			};
		
		var param = {};
		
//////////////
// 초기화 함수 영역
//////////////
		initListEvent();		
		initDtlEvent();
//////////////
// 기능  함수  영역
//////////////
		
		// 목록 이벤트
		function initListEvent(){
			
			// 목록 - tr mouseover,out css 이벤트
			$("#qust-list tr").bind("mouseover", function(e){
				var $target = $(e.currentTarget); // 현제 마우스오버 된 타겟
				$target.addClass("mouseOutOverEvent");
			});
			
			$("#qust-list tr").bind("mouseout", function(e){
				var $target = $(e.currentTarget);
				$target.removeClass("mouseOutOverEvent");
			})			
							
			// 등록 (화면이동)
			$("#btn_qust_ins").click(function(){			
				javascript:location.href="/qust/ins.do";				
			});
			
			// 등록 이벤트
			$("#btn_qust").click(function(){		
				initInsEvent();
			});			
			
			// 상세 (화면이동)
			$("#qust-list tr").click(function(){		
				var q_num = $(this).attr('Q_NUM');
				javascript:location.href = "/qust/dtl.do?q="+q_num;	
			});
		};
		
		// 상세
		function initDtlEvent(){
			
			// 수정, 삭제시 비밀번호 검사
			$('.pwd_check').click(function(){	
				
				pub.q_num = $('#Q_NUM').val();			
				pub.type = $(this).attr('id').substr(9);
				
				// 비밀번호 검사
				initPwdCheckEvent();
			});
		};
		
		// 등록 세팅
		function initInsEvent(){
			
			// 데이터 확인용
			var frm = document.qust_ins_form;
			
			if (frm.Q_NAME.value.trim() == '') {
				alert("이름을 입력해주세요.");
				return;
			}
			
			if (frm.Q_MOBILE.value.trim() == '') {
				alert("연락처를 입력해주세요.");
				return;
			}
			
			if (frm.Q_EMAIL.value.trim() == '') {
				alert("이메일을 입력해주세요.");
				return;
			}
			
			if (frm.Q_TITLE.value.trim() == '') {
				alert("제목을 입력해주세요.");
				return;
			}
			
			if (frm.Q_CONT.value.trim() == '') {
				alert("문의내용을 입력해주세요.");
				return;
			}
			
			if (frm.Q_PWD.value.trim() == '') {
				alert("비밀번호를 입력해주세요.");
				return;
			}
			
			// 폼 데이터
			var form_data = $("form[name=qust_ins_form]").serialize();
			
			// 등록
			insertQust(form_data);
		};	
		
		// 수정, 삭제 시 비밀번호 검사
		function qustTypeCheckEvent(){
			
			// 비밀번호 확인
			$('#btn_pwd_check').click(function(){
				getQustPwdCheck();
			});
		};
		
		// 수정
		function initUpdateQust(){
			
			// 취소
			$("#btn_qust_cancel").click(function(){
				alert("cancel");
			});
			
			// 수정
			$("#btn_qust_update").click(function(){
				var form_data = $("form[name=qust_updt_form]").serialize();
				putQustUpdt(form_data);
			});
			
		}
		
//////////////
// 페이지 호출 영역
//////////////		

		// 비밀번호 검사
		function initPwdCheckEvent(){	
			
			$.ajax({
				url:"/qust/pwdCheck.do",
				data:{"Q_NUM" : pub.q_num},
				type:'POST',
				success:function(result){
					$('#content').children().remove();
					$('#content').html(result);
					
					// 수정, 삭제 시 비밀번호 검사
					qustTypeCheckEvent();			
				},
				error: function(request, status, error){
	                alert("code: "+request.status+"\n"+"message: "+request.responseText+"\n"+"error: "+error);
	            }
			});	
		};
		
		// 수정
		function updateQust(){
			
			$.ajax({
				url:"/qust/edit.do",
				data:{"Q_NUM":pub.q_num},
				type:'POST',
				success:function(result){
					$('#content').children().remove();
					$('#content').html(result);
					
					// 수정
					initUpdateQust();
				},
				error: function(request, status, error){
	                alert("code: "+request.status+"\n"+"message: "+request.responseText+"\n"+"error: "+error);
	            }
			});	
		};
		
//////////////
// 데이터 호출 영역
//////////////		
		
		// 등록
		function insertQust(form_data){
			$.ajax({
				url:"/qust/postQustIns.do",
				data:form_data,
				type:'POST',
				dataType: "json",
				success:function(result){
					if (result.SUCCESS) {
						jAlert("등록되었습니다.", "알림", function() {
							javascript:location.href="/qust/list.do";
						});
					} else {
						jAlert("등록에 실패하였습니다.", "알림", function() {
							return false;
						});
					}
				},
				error: function(request, status, error){
	                alert("code: "+request.status+"\n"+"message: "+request.responseText+"\n"+"error: "+error);
	            }
			});		
		};
		
		
		// 비밀번호 확인
		function getQustPwdCheck(){	
			
			param.Q_NUM = pub.q_num;
			param.Q_PWD = $('#Q_PWD').val();
			
			$.ajax({
				url:"/qust/getQustPwdCheck.do",
				data:param,
				type:'POST',
				success:function(result){
					if (result.SUCCESS) {
						if (pub.type == "delete") {
							deleteQust();
						} else {
							updateQust();
						}
					} else {
						jAlert("비밀번호가 일치하지 않습니다.", "알림", function() {
							return false;
						});
					}
				},
				error: function(request, status, error){
	                alert("code: "+request.status+"\n"+"message: "+request.responseText+"\n"+"error: "+error);
	            }
			});
		};
		
		// 수정
		function putQustUpdt(form_data){
			
			$.ajax({
				url:"/qust/putQustUpdt.do",
				data:form_data,
				type:'POST',
				success:function(result){
					if (result.SUCCESS) {
						jAlert("수정하였습니다.", "알림", function() {
							javascript:location.href="/qust/dtl.do?q="+pub.q_num;
						});
					} else {
						jAlert("수정에 실패하였습니다.", "알림", function() {
							return false;
						});
					}
				},
				error: function(request, status, error){
	                alert("code: "+request.status+"\n"+"message: "+request.responseText+"\n"+"error: "+error);
	            }
			});	
		};
		
		// 삭제
		function deleteQust(){
			
			$.ajax({
				url:"/qust/deleteQust.do",
				data:param,
				type:'POST',
				success:function(result){
					if (result.SUCCESS) {
						jAlert("삭제되었습니다.", "알림", function() {
							javascript:location.href="/qust/list.do";
						});
					} else {
						jAlert("비밀번호가 일치하지 않습니다.", "알림", function() {
							$('#Q_PWD').val("");
							$('#Q_PWD').focus();
							
							return false;
						});
					}
				},
				error: function(request, status, error){
	                alert("code: "+request.status+"\n"+"message: "+request.responseText+"\n"+"error: "+error);
	            }
			});	
		};
		
	}; // end of _class
	
	// 함수 사용 선언 부분
	_class(); 
});