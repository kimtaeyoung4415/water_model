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
		

//////////////
// 초기화 함수 영역
//////////////
		
		initImgEvent();
		
//////////////
// 기능  함수  영역
//////////////
		function initImgEvent(){
			$('#PROFILE').on("change",function(){
				imgFileSelect(this);
			});
		};
		
		function imgFileSelect(e){		
			
			var files=e.files;
			var filesArr =Array.prototype.slice.call(files);
			
			filesArr.forEach(function(f){
				if(!f.type.match("image.*")){
					alert("확장자 이미지");
					return;
				}
				
				var reader=new FileReader();
				reader.onload=function(e){
					$("#LoadImg").attr("src",e.target.result);
				}
				reader.readAsDataURL(f);
			});
		};
		
		var sel_files=[];
		$(document).ready(function(){
			$("#PHOTO").on("change",handleImgsFilesSelect);
		});
		
		function handleImgsFileSelect(e){
			var files= e.target.files;
			var filesArr =Array.prototype.slice.call(files);
			
			filesArr.forEach(function(f){
				if(!f.type.match("image.*")){
					alert("확장자는 이미지 확장자만 가능합니다.");
					return;
				}
				sel_liles.push(f);

				var reader=new FileReader();
				reader.onload=function(e){
					var img_html ="<img src=\""+e.target.result+"\"/>";
					$(".imgfile").append(img_html);
				}
				reader.readAsDataURL(f);
			});
		}
		
//////////////
// 페이지 호출 영역
//////////////		

		
//////////////
// 데이터 호출 영역
//////////////		
		
		
	}; // end of _class
	
	// 함수 사용 선언 부분
	_class(); 
});




	
	
	



