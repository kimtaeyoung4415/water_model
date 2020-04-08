<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<form name="w_qna_ins_form">
	<div class="container" align="center">
		<div class="sub-container">
			<div class="application_modal">
				<h3>문의하기</h3>
				<div class="input_wrapper">
					<label for="Q_NAME">이름</label>
					<input type="text" id="C_NAME" name="C_NAME" placeholder="홍길동" required="required">
				</div>
				<div class="input_wrapper">
					<label for="Q_MOBILE">연락처</label>
					<input type="text" id="C_MOBILE" name="C_MOBILE" placeholder="01012345678 '-' 없이 입력"  maxlength="11" required="required">
				</div>
				<div class="input_wrapper">
					<label for="Q_EMAIL">이메일</label>
					<input type="text" id="C_EMAIL" name="C_EMAIL" placeholder="example@mail.com" required="required">
				</div>
				<div class="input_wrapper">
					<label for="Q_TITLE">제목</label>
					<input type="text" id="C_TITLE" name="C_TITLE" placeholder="문의 제목" maxlength="50" required="required">
				</div>
				<div class="input_wrapper">
					<label for="Q_CONT">문의내용</label>
					<textarea id="Q_CONT" name="C_CONT" rows="5" placeholder="문의 내용" required="required"></textarea>
				</div>
				<div class="input_wrapper">
					<label for="Q_PWD">비밀번호</label>
					<input type="password" id="C_PWD" name="C_PWD" placeholder="비밀번호" required="required">
				</div>
			</div>
		</div>
		
		<div class="btn_form">
			<input type="button" id="btn_w_nego" class="btn" value="문의하기"/>
		</div>
	</div>
</form>