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
			var data_num = $(this).attr("data");			
			dtlQust(data_num);
		});
						
		// 등록 (화면이동)
		$("#btn_qust_ins").click(function(){			
			javascript:location.href="/brd/qust/ins.do";				
		});
		
		// 문의 등록 (클릭)
		$("#btn_qust").click(function(){		
			initInsEvent();
		});
	
	};
	
	// 질문등록 init
	function initInsEvent(){

		var frm = document.qust_ins_form;
		
		if (frm.Q_NAME.value.trim() == '') {
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
		
		insertQust(form_data);
	};
	
	// 질문등록 이벤트
	function insertQust(form_data){
		
		$.ajax({
			url:"/brd/qust/postQustIns.do",
			data:form_data,
			type:'POST',
			success:function(result){
				if (result) {
					jAlert("등록되었습니다.", "알림", function() {
						javascript:location.href="/brd/qust/list.do";
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
	
	// 상세화면 이벤트
	function dtlQust(data_num){		
		
		$.ajax({
			url:"/brd/qust/dtl.do",
			data:{"Q_NUM":data_num},
			type:'POST',
			success:function(result){
				$('#content').children().remove();
				$('#content').html(result);							
			},
			error: function(request, status, error){
                alert("code: "+request.status+"\n"+"message: "+request.responseText+"\n"+"error: "+error);
            }
		});		
	};
	
	// 비밀번호 검사
	function initDtlEvent(Q_NUM, type)	{				
		
		$.ajax({
			url:"/brd/qust/pwdCheck.do",
			data:{"Q_NUM" : Q_NUM},
			type:'POST',
			success:function(result){
				$('#content').children().remove();
				$('#content').html(result);
				
				// 비밀번호 확인 버튼
				$("#btn_pwd_check").click(function(){
					if (type == "del") {
						var code = "del";
					} else if(type == "updt") {
						var code = "updt";
					}
					getQustPwdCheck(Q_NUM, type);	
				});				
			},
			error: function(request, status, error){
                alert("code: "+request.status+"\n"+"message: "+request.responseText+"\n"+"error: "+error);
            }
		});	
	};	
	
	// 비밀번호 확인
	function getQustPwdCheck(Q_NUM, type){		
		console.log(type)
		var param = {   
			"Q_NUM" : Q_NUM,
			"type" : type,
			"Q_PWD" : $('#Q_PWD').val()
		};			
		
		$.ajax({
			url:"/brd/qust/getQustPwdCheck.do",
			data:param,
			type:'POST',
			success:function(result){
				if (result) {
					if (result.type == "del") {
						jAlert("삭제되었습니다.", "알림", function() {
							javascript:location.href="/brd/qust/list.do";		
						});
					} else {
						javascript:location.href="/brd/qust/updt.do";
					
						// 비밀번호 확인 버튼
						$("#btn_pwd_check").click(function(){
							getQustPwdCheck(Q_NUM, type);	
						});	
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
	function updateQust(Q_NUM){
		
		var param = {   
			"Q_NUM" : Q_NUM
		};
		
		$.ajax({
			url:"/brd/qust/putQustUpdt.do",
			data:param,
			type:'POST',
			success:function(result){
				$('#content').children().remove();
				$('#content').html(result);
			},
			error: function(request, status, error){
                alert("code: "+request.status+"\n"+"message: "+request.responseText+"\n"+"error: "+error);
            }
		});	
	}
	

	