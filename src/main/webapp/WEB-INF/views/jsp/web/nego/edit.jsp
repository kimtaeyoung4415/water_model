<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<form name="w_nego_updt_form">
	<div class="container" align="center">
		<div class="sub-container">
			<div class="application_modal">
				<h3>수정하기</h3>
				<div class="input_wrapper">
					<label for="C_NAME">이름</label>
					<input type="text" id="C_NAME" name="C_NAME" placeholder="홍길동" required="required" value="${dtl.C_NAME }">
				</div>
				<div class="input_wrapper">
					<label for="MOBILE">연락처</label>
					<input type="text" id="MOBILE" name="MOBILE" placeholder="01012345678 '-' 없이 입력"  maxlength="11" required="required" value="${dtl.C_MOBILE }">
				</div>
				<div class="input_wrapper">
					<label for="EMAIL">이메일</label>
					<input type="text" id="EMAIL" name="EMAIL" placeholder="example@mail.com" required="required" value="${dtl.C_EMAIL }">
				</div>
				<div class="input_wrapper">
					<label for="C_TITLE">제목</label>
					<input type="text" id="C_TITLE" name="C_TITLE" placeholder="문의 제목" maxlength="50" required="required" value="${dtl.C_TITLE }">
				</div>
				<div class="input_wrapper">
					<label for="C_CONT">문의내용</label>
					<textarea id="C_CONT" name="C_CONT" rows="5" placeholder="문의 내용" required="required">${dtl.C_CONT }</textarea>
				</div>
				<div class="input_wrapper">
					<label for="C_PWD">비밀번호</label>
					<input type="password" id="C_PWD" name="C_PWD" placeholder="비밀번호" required="required">
				</div>
				<input type="hidden" id="C_NUM" name="C_NUM" value="${dtl.C_NUM }">
			</div>
		</div>
		
		<div class="btn_form_half">
			<input type="button" id="btn_w_nego_cancel" class="btn" value="취소" /> 
			<input type="button" id="btn_w_nego_update" class="btn" value="수정" />
		</div>
	</div>
</form>