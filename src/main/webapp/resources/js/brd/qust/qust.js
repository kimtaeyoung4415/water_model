"use strict";
	/*
		Q & A 게시판 스크립트
		목록 이벤트
	*/
	
	$(document).ready(function(){
		initListEvent();
	});
	
	
	// list 이벤트
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
				
		// 상세 (화면이동)
		$("#qust-list tr").click(function(){							
			var dtl_data = $(this).attr("data");			
			javascript:location.href="/brd/qust/dtl.do?no="+dtl_data;		
		});
		
		// 삭제, 수정
		$(".pwd_check").click(function(){			
			var no = $("#no").val();
			javascript:location.href="/brd/qust/pwdCheck.do?no="+no;				
		});
		
		
		
		// 비밀번호 확인
		$("#btn_pwd_check").click(function(){	
			var no = $("#no").val();
			getPwdCheck(no);			
		});
		
		// 등록 (화면이동)
		$("#btn_qust_ins").click(function(){			
			javascript:location.href="/brd/qust/ins.do";				
		});
		
		// 문의 등록 (클릭)
		$("#btn_qust_question").click(function(){		
			initInsEvent();
		});
	
	};
	
	// 질문등록 init
	function initInsEvent(){

		var frm = document.qust_ins_form;
		
		if (frm.Q_USERNAME.value.trim() == '') {
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
		
		var form_data = $("form[name=qust_ins_form]").serialize();
		
		insertqust(form_data);
		
	};
	
	// 질문등록 이벤트
	function insertqust(form_data){
		
		$.ajax({
			url:"/brd/qust/insqust.do",
			data:form_data,
			type:'POST',
			success:function(result){
				if (result) {
					alert("true");
				} else {
					alert("false");
				}
			},
			error: function(request, status, error){
                alert("code: "+request.status+"\n"+"message: "+request.responseText+"\n"+"error: "+error);
            }
		});
		
	};
	
	// 비밀번호 확인
	function getPwdCheck(no){
		
		var param = { 
						"no" : no,
						"Q_PWD" : $("#pwd_check").val() 
					};			
		
		$.ajax({
			url:"/brd/qust/getQustPwdCheck.do",
			data:param,
			type:'POST',
			success:function(result){
				if (result) {
					alert("true");
				} else {
					alert("false");
				}
			},
			error: function(request, status, error){
                alert("code: "+request.status+"\n"+"message: "+request.responseText+"\n"+"error: "+error);
            }
		});
		
	};