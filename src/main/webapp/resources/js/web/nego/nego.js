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
		
		
		
//////////////
// 기능  함수  영역
//////////////
		
		
//////////////
// 페이지 호출 영역
//////////////
		
//nego 등록화면 이동 버튼
		$("#btn_w_nego_ins").click(function(){			
			javascript:location.href="/nego/ins.do";				
		});
//nego 상세 화면 이동
		/*$("#w-nego-list tr").click(function(){		
			var q_num = $(this).attr('C_NUM');
			javascript:location.href = "/nego/dtl.do?c="+c_num;	
		});
*/		
		$("#w-nego-list tr").click(function(){		
			var q_num = $(this).attr('#nego_page_test');
			var test_num = $("#nego_page_test").children().first().text();
			javascript:location.href = "/nego/dtl.do?c="+test_num;	
		});
		
		$("#a-nego-list tr").click(function(){		
			var q_num = $(this).attr('#nego_page_test');
			var test_num = $("#admin_nego_page_test").children().first().text();
			javascript:location.href = "/admin/nego/dtl.do?c="+test_num;	
		});
		
//////////////
// 데이터 호출 영역
//////////////		
		
		
		
	}; // end of _class
	
	// 함수 사용 선언 부분
	_class(); 
});
