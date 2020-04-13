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
		var pub = {		
			N_NUM : null,
			N_REG_NAME : "워터 엔터테인먼트",
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
			$("#a-ntce-list tr").bind("mouseover", function(e){
				var $target = $(e.currentTarget); // 현제 마우스오버 된 타겟
				$target.addClass("mouseOutOverEvent");
			});
			
			$("#a-ntce-list tr").bind("mouseout", function(e){
				var $target = $(e.currentTarget);
				$target.removeClass("mouseOutOverEvent");
			})			
			
			// 상세 (화면이동)
			$("#a-ntce-list tr").click(function(){		
				var n_num = $(this).attr('N_NUM');
				javascript:location.href = "/admin/ntce/dtl.do?n="+n_num;	
			});
			
			// 등록 (화면이동)
			$("#btn_a_ntce_ins").click(function(){		
				javascript:location.href="/admin/ntce/ins.do";
			});
			
			// 등록 이벤트
			$("#btn_ntce_ins").click(function(){		
				initInsEvent();
			});
			
			// 삭제
			$("#btn_a_ntce_delete").click(function(){
				param.N_NUM = $('#N_NUM').val();
				deleteAdminNtce();
			});
			
			// 수정 화면
			$("#btn_a_ntce_update").click(function(){
				pub.N_NUM = $('#N_NUM').val();
				updateAdminNtce();
			});
			
			fileInputEvent();
		};
		
		// 수정 이벤트
		function initUpdtEvent()	{
			
			// 수정 이벤트
			$("#btn_update").click(function(){
				initNtceUpdtEvent();
			});

			// 취소
			$('#btn_cancel').click(function(){
				javascript:location.href="/admin/ntce/dtl.do?n="+pub.N_NUM;	
			});
				
		};
		
		// 등록 세팅
		function initInsEvent(){
			
			// 데이터 확인용
			var frm = document.a_ntce_ins_form;
			
			if (frm.N_TITLE.value.trim() == '') {
				jAlert("제목을 입력해주세요.", "알림");
					return false;
			}
			
			if (frm.N_CONT.value.trim() == '') {
				jAlert("내용을 입력해주세요.", "알림");
					return false;
			}
						
			// DATA
			var imp_yn = $("input[name=IMP_YN]:checked").val();			
			var abcd = $('input[name=a_ntce_ins_form]').serialize();		
			param.N_TITLE = frm.N_TITLE.value.trim();
			param.N_CONT = frm.N_CONT.value.trim();
			param.N_REG_NAME = pub.N_REG_NAME;
			param.IMP_YN = (imp_yn == "on") ? "Y" : "N";			
			
			// 첨부파일 등록 코드 작성 필요
			
			insertAdminNtce();
		};	
		
		// 수정 세팅
		function initNtceUpdtEvent(){
			
			// 데이터 확인용
			var frm = document.a_ntce_updt_form;
			
			if (frm.N_TITLE.value.trim() == '') {
				jAlert("제목을 입력해주세요.", "알림");
				return false;
			}
			
			if (frm.N_CONT.value.trim() == '') {
				jAlert("내용을 입력해주세요.", "알림");
				return false;
			}
						
			// DATA
			var imp_yn = $("input[name=IMP_YN]:checked").val();					
			param.N_NUM   = pub.N_NUM;
			param.N_TITLE = frm.N_TITLE.value.trim();
			param.N_CONT  = frm.N_CONT.value.trim();
			param.N_REG_NAME = pub.N_REG_NAME;
			param.IMP_YN  = (imp_yn == "Y") ? "Y" : "N";				
			
			// 첨부파일 등록 코드 작성 필요		
			
			putAdminNtceUpdt();
		};
		
		// file input event
		function fileInputEvent() {
			var fileTarget = $('.filebox .upload-hidden');
			
			fileTarget.on('change', function(){ 
				
				// 값이 변경되면 파일명 추출 
				if(window.FileReader){ 
					// modern browser 
					var filename = $(this)[0].files[0].name;
				} else { // old IE 
					var filename = $(this).val().split('/').pop().split('\\').pop();
				}
				
				// 추출한 파일명 삽입 
				$(this).siblings('.upload-name').val(filename); 
			});
		}
		

//////////////
// 페이지 호출 영역
//////////////		

		// 수정
		function updateAdminNtce(){
			
			$.ajax({
				url:"/admin/ntce/edit.do",
				data:{"N_NUM":pub.N_NUM},
				type:'POST',
				success:function(result){
					$('#content').children().remove();
					$('#content').html(result);
					
					// 수정 
					initUpdtEvent();
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
		function insertAdminNtce(){
	
			$.ajax({
				url:"/admin/ntce/postAdminNtceIns.do",
				data: param,
				type:'POST',
				dataType: "json",
				success:function(result){
					if (result.SUCCESS) {
						jAlert("등록되었습니다.", "알림", function() {
							javascript:location.href="/admin/ntce/list.do";
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
		
		// 수정
		function putAdminNtceUpdt(){

			$.ajax({
				url:"/admin/ntce/putAdminNtceUpdt.do",
				data:param,
				type:'POST',
				success:function(result){
					if (result.SUCCESS) {
						jAlert("수정하였습니다.", "알림", function() {
							javascript:location.href="/admin/ntce/dtl.do?n="+pub.N_NUM;
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
		function deleteAdminNtce(){			
			
			$.ajax({
				url:"/admin/ntce/deleteAdminNtce.do",
				data:param,
				type:'POST',
				success:function(result){
					if (result.SUCCESS) {
						jAlert("삭제되었습니다.", "알림", function() {
							javascript:location.href="/admin/ntce/list.do";
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
		
	}; // end of class
	
	// 함수 사용 선언 부분
	_class(); 
});