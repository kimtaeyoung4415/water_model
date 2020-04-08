$(function () { 
	"use strict";
	
	/*
		
		
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
		
		var pub = {};
		
		var param = {};
		
//////////////
// 초기화 함수 영역
//////////////
		
		initLoginFormEvent();	
		
//////////////
// 기능  함수  영역
//////////////
		
		function initLoginFormEvent(){
			
			$('#btn_login').click(function(){
				getAdminLogin();
			});
			
			$('#AD_PWD').on("keydown",function(e){
				if (e.keyCode === 13) {
					getAdminLogin();
				}
			});			
		};		

		
//////////////
// 페이지 호출 영역
//////////////		

		
//////////////
// 데이터 호출 영역
//////////////		
			
		// 등록
		function getAdminLogin(){
			
			param.AD_ID  = $('#AD_ID').val();
			param.AD_PWD = $('#AD_PWD').val();
			
			$.ajax({
				url:"/admin/getAdminLogin.do",
				data:param,
				type:'POST',
				dataType: "json",
				success:function(result){
					if (result.SUCCESS) {
						alert("얏호");
						//javascript:location.href="/admin/main.do";
					} else {
						if (result.ERR_CD == "ERR_ID") {
							jAlert("아이디가 존재하 않습니다.", "알림", function() {
								return false;
							});
						} else if(result.ERR_CD == "ERR_PWD") {
							jAlert("비밀번호가 일치하지 않습니다.", "알림", function() {
								return false;
							});	
						}
					}
				},
				error: function(request, status, error){
	                alert("code: "+request.status+"\n"+"message: "+request.responseText+"\n"+"error: "+error);
	            }
			});		
		};
		
	};
	
	// 함수 사용 선언 부분
	_class(); 
});