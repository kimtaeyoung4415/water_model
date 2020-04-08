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
		
		// public 변수
		var pub = {};
		
		// parameter
		var param = {};
		
//////////////
// 초기화 함수 영역
//////////////
	
		initListEvent();
		
//////////////
// 기능  함수  영역
//////////////
		
		function initListEvent(){
			// 목록 - tr mouseover,out css 이벤트
			$("#w-ntce-list tr").bind("mouseover", function(e){
				var $target = $(e.currentTarget); // 현제 마우스오버 된 타겟
				$target.addClass("mouseOutOverEvent");
			});
			
			$("#w-ntce-list tr").bind("mouseout", function(e){
				var $target = $(e.currentTarget);
				$target.removeClass("mouseOutOverEvent");
			})			
			
			// 상세 (화면이동)
			$("#w-ntce-list tr").click(function(){		
				var n_num = $(this).attr('N_NUM');
				javascript:location.href = "/ntce/dtl.do?n="+n_num;	
			});
				
		};
		
		
//////////////
// 페이지 호출 영역
//////////////		

		
		
//////////////
// 데이터 호출 영역
//////////////		
		
		
	};
	
	// 함수 사용 선언 부분
	_class(); 
});