	
//////////////
// 공통  변수  영역
//////////////			

$(function () { 
	"use strict";
	
	/*
		게시판 스크립트 형식
		
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
			
		var pub = {
			q_num : null,
			name : "ADMIN",
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
				if ($('#A_CONT').val() == null) {
					jAlert("답변을 입력해 주세요.","알림",function(){
						return;
					});
				};		

				pub.q_num = $(this).attr('id').substr(10);
				var A_CONT = $('#A_CONT').val();
				
				
				// 답변등록
				putQnaUpdt(A_CONT);
			});
						
		};
		
	
		
//////////////
// 페이지 호출 영역
//////////////		

		
		
//////////////
// 데이터 호출 영역
//////////////		
	
		// 답변 등록
		function putQnaUpdt(A_CONT){
			
			console.log(pub)
			
			param = {
				"Q_NUM"  : pub.q_num, 
				"A_CONT" : A_CONT,
				"A_NAME" : pub.name
			};
			
			$.ajax({
				url:"/admin/qna/putQnaUpdt.do",
				data:param,
				type:'POST',
				success:function(result){
					if (result.SUCCESS) {
						jAlert("수정하였습니다.", "알림", function() {
							javascript:location.href="/admin/qna/dtl.do?q="+pub.q_num;
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
		
	}; // end of _class
	
	_class();
});