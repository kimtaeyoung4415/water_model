$(function () { 
	"use strict";
	
	/*
		
		
		공통 변수 영역	: _class 함수 내에서 사용되어지는 함수에서 공통적으로 사용할 수 있는 변수 사용 영역
		ex) pub.type = $('#example').val(); >> 한번의 설정으로 계속 사용가능 (session 과 비슷한 기능)
		
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
		negoListEvent();
		
//////////////
// 기능  함수  영역
//////////////
		//목록이벤트
		function negoListEvent(){
			//등록 이벤트
			$("#btn_w_nego").click(function(){		
				negoInsEvent();
			});
			$("#btn_w_nego_ins").click(function(){			
				javascript:location.href="/nego/ins.do";				
			});
			//상세(화면이동)
			$("#w-nego-list tr").click(function(){		
				var q_num = $(this).attr('C_NUM');
				javascript:location.href = "/nego/dtl.do?q="+q_num;	
			});
		};
		//상세
		/*function negoDtlEvnet(){
			$('.pwd_check').click(function(){
				
				pub.q_num = $('#C_NUM').val();
				pub.type = $(this).attr('id').substr(10);
				
				negoPwdCheckEvent();
			});
		};*/
		
		//등록 세팅
		function negoInsEvent(){
			var frm = document.w_nego_ins_form;
			
			if(frm.C_NAME.value.trim() == ''){
				jAlert("이름을 입력해 주십시오.","알림");
				return false;
			}
			if(frm.C_MOBILE.value.trim() == ''){
				jAlert("연락처을 입력해 주십시오.","알림");
				return false;
			}
			if(frm.C_EMAIL.value.trim() == ''){
				jAlert("이메일을 입력해 주십시오.","알림");
				return false;
			}
			if(frm.C_TITLE.value.trim() == ''){
				jAlert("제목을 입력해 주십시오.","알림");
				return false;
			}
			if(frm.C_CONT.value.trim() == ''){
				jAlert("문의내용을 입력해 주십시오.","알림");
				return false;
			}
			if(frm.C_PWD.value.trim() == ''){
				jAlert("비밀번호을 입력해 주십시오.","알림");
				return false;
			}
			
			var form_data = $("form[name=w_nego_ins_form]").serialize();
			insertNego(form_data);
		}
//////////////
// 페이지 호출 영역
//////////////
		//비밀번호 검사
		/*function negoPwdCheck(){
			$.ajax({
				url="/nago/pwdCheck.do",
				data={"C_NUM" : pub.q_num},
				type="POST",
				success:function(result){
					$('#content').children().remove();
					$('#content').html(result);
					
					//수정, 삭제 시 비밀번호 검사
					negoTypeCheckEvent();
				},
				error : function(request, status, error){
					alert("code: "+request.status+"\n"+"message: "+request.responseText+"\n"+"error: "+error);
				}
			});
		};*/
		

//////////////
// 데이터 호출 영역
//////////////		
		function insertNego(form_data){
			$.ajax({
				url:"/nego/postNegoIns.do",
				data:form_data,
				type:'POST',
				datatype : "json",
				success: function(result){
					if (result.SUCCESS){
						jAlert("등록되었습니다.", "알림", function(){
							javascript:location.href="/nego/list.do";
						});
					}else {
						jAlert("등록에 실패하였습니다.", "알림", function(){
							return false;
						});
					}
				},
				error : function(request, status, error){
					alert("code: " +request.status + "\n"+"message: " +request.responsText+ "\n"+"error: "+error);
				}
			});
		};
		
		//비밀번호 확인
		/*function getNegoPwdCheck(){
			param.C_NUM = pub.q_num;
			Param.C_PWD = $('#C_NUM').val();
			
			$.ajax({
				url:"/nego/getNegoPwdCheck.do",
				data:param,
				type: "POST",
				success : function(result){
					if(result.SUCCESS){
						if (pub.type == "delete") {
							deleteNego();
						} else{
							updateNego();
						}						
					} else{
						jAlert("비밀번호가 일치하지 않습니다.", "알림", function() {
							return false;
						});
					}
				},
				error: function(request, status, error){
	                alert("code: "+request.status+"\n"+"message: "+request.responseText+"\n"+"error: "+error);
	            }
			});
			
			
		}*/
	}; // end of _class
	
	// 함수 사용 선언 부분
	_class(); 
});
