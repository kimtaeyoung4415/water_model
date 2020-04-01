(function () { 
	"use strict";
	
	$(document).ready(function(){_class()});
	
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
				pub.q_num = $('#Q_NUM').val();	
				dtlQust(pub.q_num);
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
		
		// 상세
		function initDtlEvent(){
			
			// 수정, 삭제시 비밀번호 검사
			$('.pwd_check').click(function(){		
				
				pub.type = $(this).attr('id').substr(9);
				
				// 비밀번호 검사
				initPwdCheckEvent();
			});
		};
		
		// 수정, 삭제 시 비밀번호 검사
		function qustTypeCheckEvent(){
			
			// 비밀번호 확인
			$('#btn_pwd_check').click(function(){
				getQustPwdCheck();
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
					console.log(result)
					if (result) {
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
		
		// 상세
		function dtlQust(data_num){
			
			$.ajax({
				url:"/qust/dtl.do",
				data:{"Q_NUM":data_num},
				type:'POST',
				success:function(result){
					$('#content').children().remove();
					$('#content').html(result);	
					
					initDtlEvent();
				},
				error: function(request, status, error){
	                alert("code: "+request.status+"\n"+"message: "+request.responseText+"\n"+"error: "+error);
	            }
			});	
		};
		
		// 비밀번호 검사
		function initPwdCheckEvent(){			
			
			$.ajax({
				url:"/qust/pwdCheck.do",
				data:{"Q_NUM" : pub.q_num},
				type:'POST',
				success:function(result){
					$('#content').children().remove();
					$('#content').html(result);
					
					qustTypeCheckEvent();			
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
					if (result) {
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
		function updateQust(){
			
			param.Q_NUM = pub.q_num;
			
			$.ajax({
				url:"/qust/putQustUpdt.do",
				data:param,
				type:'POST',
				success:function(result){
					$('#content').children().remove();
					$('#content').html(result);
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
					console.log(result)
					if (result) {
						jAlert("삭제되었습니다.", "알림", function() {
							javascript:location.href="/qust/list.do";
						});
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
		
	}; // end of _class
	
})();