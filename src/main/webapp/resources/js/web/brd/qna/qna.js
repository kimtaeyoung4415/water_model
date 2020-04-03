$(function () { 
	"use strict";
	
	/*
		게시판 스크립트 형식
		
		공통 변수 영역	: _class 함수 내에서 사용되어지는 함수에서 공통적으로 사용할 수 있는 변수 사용 영역
		ex) pub.type = $('#type').val(); >> 한번의 설정으로 계속 사용가능 (session 과 비슷한 기능)
		
		초기화 함수 영역	: 페이지 로드후 script가 로딩되었을때 실행되어져야하는 함수 사용 영역
		
		기능 함수 영역	: 각 화면에 대한 버튼 이벤트 등이나 데이터 검사 같은 기능을 정의해둔 영역
		
		페이지 호출 영역	: 비동기 방식으로 화면 이동이 이루어져야 하는 부분을 정의해둔 페이지 호출 영역
	
		데이터 호출 영역	: ajax를 이용한 데이터 호출 영역
	
	*/
	
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
			$("#w-qna-list tr").bind("mouseover", function(e){
				var $target = $(e.currentTarget); // 현제 마우스오버 된 타겟
				$target.addClass("mouseOutOverEvent");
			});
			
			$("#w-qna-list tr").bind("mouseout", function(e){
				var $target = $(e.currentTarget);
				$target.removeClass("mouseOutOverEvent");
			})			
							
			// 등록 (화면이동)
			$("#btn_w_qna_ins").click(function(){			
				javascript:location.href="/qna/ins.do";				
			});
			
			// 등록 이벤트
			$("#btn_w_qna").click(function(){		
				initInsEvent();
			});			
			
			// 상세 (화면이동)
			$("#w-qna-list tr").click(function(){		
				var q_num = $(this).attr('Q_NUM');
				javascript:location.href = "/qna/dtl.do?q="+q_num;	
			});
		};
		
		// 상세
		function initDtlEvent(){
			
			// 수정, 삭제시 비밀번호 검사
			$('.pwd_check').click(function(){	
				
				pub.q_num = $('#Q_NUM').val();			
				pub.type = $(this).attr('id').substr(10);
				
				// 비밀번호 검사
				initPwdCheckEvent();
			});
		};
		
		// 등록 세팅
		function initInsEvent(){
			
			// 데이터 확인용
			var frm = document.w_qna_ins_form;
			
			if (frm.Q_NAME.value.trim() == '') {
				jAlert("이름을 입력해주세요.", "알림");
				return false;
			}
			
			if (frm.Q_MOBILE.value.trim() == '') {
				jAlert("연락처를 입력해주세요.", "알림");
				return false;
			}
			
			if (frm.Q_EMAIL.value.trim() == '') {
				jAlert("이메일을 입력해주세요.", "알림");
				return false;
			}
			
			if (frm.Q_TITLE.value.trim() == '') {
				jAlert("제목을 입력해주세요.", "알림");
				return false;
			}
			
			if (frm.Q_CONT.value.trim() == '') {
				jAlert("문의내용을 입력해주세요.", "알림");
				return false;
			}
			
			if (frm.Q_PWD.value.trim() == '') {
				jAlert("비밀번호를 입력해주세요.", "알림");
				return false;
			}
			
			var form_data = $("form[name=w_qna_ins_form]").serialize();			
			insertQna(form_data);
		};	

		// 수정, 삭제 시 비밀번호 검사
		function qnaTypeCheckEvent(){
			
			// 비밀번호 확인
			$('#btn_pwd_check').click(function(){
				getQnaPwdCheck();
			});
		};
		
		// 수정
		function initUpdateQna(){
			
			// 취소
			$("#btn_w_qna_cancel").click(function(){
				alert("cancel");
			});
			
			// 수정
			$("#btn_w_qna_update").click(function(){
				
				var frm = document.w_qna_updt_form;
				
				if (frm.Q_NAME.value.trim() == '') {
					jAlert("이름을 입력해주세요.", "알림");
					return false;
				}
				
				if (frm.Q_MOBILE.value.trim() == '') {
					jAlert("연락처를 입력해주세요.", "알림");
					return false;
				}
				
				if (frm.Q_EMAIL.value.trim() == '') {
					jAlert("이메일을 입력해주세요.", "알림");
					return false;
				}
				
				if (frm.Q_TITLE.value.trim() == '') {
					jAlert("제목을 입력해주세요.", "알림");
					return false;
				}
				
				if (frm.Q_CONT.value.trim() == '') {
					jAlert("문의내용을 입력해주세요.", "알림");
					return false;
				}
				
				if (frm.Q_PWD.value.trim() == '') {
					jAlert("비밀번호를 입력해주세요.", "알림");
					return false;
				}
				
				var form_data = $("form[name=w_qna_updt_form]").serialize();
				putQnaUpdt(form_data);
			});
			
		}
		
//////////////
// 페이지 호출 영역
//////////////		

		// 비밀번호 검사
		function initPwdCheckEvent(){	
			
			$.ajax({
				url:"/qna/pwdCheck.do",
				data:{"Q_NUM" : pub.q_num},
				type:'POST',
				success:function(result){
					$('#content').children().remove();
					$('#content').html(result);
					
					// 수정, 삭제 시 비밀번호 검사
					qnaTypeCheckEvent();			
				},
				error: function(request, status, error){
	                alert("code: "+request.status+"\n"+"message: "+request.responseText+"\n"+"error: "+error);
	            }
			});	
		};
		
		// 수정
		function updateQna(){
			
			$.ajax({
				url:"/qna/edit.do",
				data:{"Q_NUM":pub.q_num},
				type:'POST',
				success:function(result){
					$('#content').children().remove();
					$('#content').html(result);
					
					// 수정
					initUpdateQna();
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
		function insertQna(form_data){
			$.ajax({
				url:"/qna/postQnaIns.do",
				data:form_data,
				type:'POST',
				dataType: "json",
				success:function(result){
					if (result.SUCCESS) {
						jAlert("등록되었습니다.", "알림", function() {
							javascript:location.href="/qna/list.do";
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
		function getQnaPwdCheck(){	
			
			param.Q_NUM = pub.q_num;
			param.Q_PWD = $('#Q_PWD').val();
			
			$.ajax({
				url:"/qna/getQnaPwdCheck.do",
				data:param,
				type:'POST',
				success:function(result){
					if (result.SUCCESS) {
						if (pub.type == "delete") {
							deleteQna();
						} else {
							updateQna();
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
		function putQnaUpdt(form_data){
			
			$.ajax({
				url:"/qna/putQnaUpdt.do",
				data:form_data,
				type:'POST',
				success:function(result){
					if (result.SUCCESS) {
						jAlert("수정하였습니다.", "알림", function() {
							javascript:location.href="/qna/dtl.do?q="+pub.q_num;
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
		function deleteQna(){
			
			$.ajax({
				url:"/qna/deleteQna.do",
				data:param,
				type:'POST',
				success:function(result){
					if (result.SUCCESS) {
						jAlert("삭제되었습니다.", "알림", function() {
							javascript:location.href="/qna/list.do";
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