<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
	String ctxPath = request.getContextPath();
%>

<form name="qust_ins_form">
	<div class="container" align="center">
		<div class="sub-container">
			<div class="application_modal">
				<h3>문의하기</h3>
				<div class="input_wrapper">
					<label for="Q_NAME">이름</label>
					<input type="text" id="Q_NAME" name="Q_NAME" placeholder="홍길동" required="required">
				</div>
				<div class="input_wrapper">
					<label for="Q_MOBILE">연락처</label>
					<input type="text" id="Q_MOBILE" name="Q_MOBILE" placeholder="01012345678 '-' 없이 입력" required="required">
				</div>
				<div class="input_wrapper">
					<label for="Q_EMAIL">이메일</label>
					<input type="text" id="Q_EMAIL" name="Q_EMAIL" placeholder="example@mail.com" required="required">
				</div>
				<div class="input_wrapper">
					<label for="Q_TITLE">제목</label>
					<input type="text" id="Q_TITLE" name="Q_TITLE" placeholder="문의 제목" required="required">
				</div>
				<div class="input_wrapper">
					<label for="Q_CONT">문의내용</label>
					<textarea id="Q_CONT" name="Q_CONT" rows="5" placeholder="문의 내용" required="required"></textarea>
				</div>
				<div class="input_wrapper">
					<label for="Q_PWD">비밀번호</label>
					<input type="password" id="Q_PWD" name="Q_PWD" placeholder="비밀번호" required="required">
				</div>
			</div>
		</div>
		
		<div class="btn_form">
			<input type="button" id="btn_qust" class="btn" value="문의하기"/>
		</div>
	</div>
	
</form>