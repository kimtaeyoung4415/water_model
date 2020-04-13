$(function () { 
	"use strict";
	
	/*
				
		공통 변수 영역	: _class 함수 내에서 사용되어지는 함수에서 공통적으로 사용할 수 있는 변수 사용 영역
		* 비동기 방식일 경우 사용가능
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
			
		// public 변수
		var pub = {
			Q_NUM : null,
			name : "워터 엔터테인먼트",
		};
					
		// parameter
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
			$("#a-qna-list tr").bind("mouseover", function(e){
				var $target = $(e.currentTarget); // 현제 마우스오버 된 타겟
				$target.addClass("mouseOutOverEvent");
			});
			
			$("#a-qna-list tr").bind("mouseout", function(e){
				var $target = $(e.currentTarget);
				$target.removeClass("mouseOutOverEvent");
			})						
			
			// 상세 (화면이동)
			$("#a-qna-list tr").click(function(){		
				var q_num = $(this).attr('Q_NUM');
				javascript:location.href = "/admin/qna/dtl.do?q="+q_num;	
			});
			
			// 등록
			$("#btn_a_qna_update").click(function(){
				if ($('#A_CONT').val() == "") {
					jAlert("답변을 입력해 주세요.","알림",function(){
						return;
					});
				};		

				pub.q_num = $('#Q_NUM').val();
				var A_CONT = $('#A_CONT').val();				
				
				// 답변등록
				putAdminQnaUpdt(A_CONT);
			});
			
			// 삭제
			$('#btn_a_qna_delete').click(function(){
				jConfirm("정말로 삭제하시겠습니까 ?","알림", function(r){
					if (r) { 
						// r == true > 확인 false 취소					
						param.Q_NUM = $('#Q_NUM').val();
						deleteAdminQna();
					}
				});
			});
						
		};
		
		
//////////////
// 페이지 호출 영역
//////////////		

		
		
//////////////
// 데이터 호출 영역
//////////////		
	
		// 답변 등록
		function putAdminQnaUpdt(A_CONT){
			
			param = {
				"Q_NUM"  : pub.q_num, 
				"A_CONT" : A_CONT,
				"A_NAME" : pub.name
			};
			
			$.ajax({
				url:"/admin/qna/putAdminQnaUpdt.do",
				data:param,
				type:'POST',
				success:function(result){
					if (result.SUCCESS) {
						jAlert("등록하였습니다.", "알림", function() {
							javascript:location.href="/admin/qna/dtl.do?q="+pub.q_num;
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
		
		// 삭제
		function deleteAdminQna(){
			
			$.ajax({
				url:"/admin/qna/deleteAdminQna.do",
				data:param,
				type:'POST',
				success:function(result){
					if (result.SUCCESS) {
						jAlert("삭제되었습니다.", "알림", function() {
							javascript:location.href="/admin/qna/list.do";
						});
					} else {
						jAlert("삭제에 실패하였습니다.", "알림", function() {
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
	
	_class();
});