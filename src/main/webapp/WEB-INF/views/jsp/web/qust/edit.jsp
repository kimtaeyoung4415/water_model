<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<form name="qust_updt_form">
	<div class="container" align="center">
		<div class="sub-container">
			<div class="application_modal">
				<h3>수정하기</h3>
				<div class="input_wrapper">
					<label for="Q_NAME">이름</label>
					<input type="text" id="Q_NAME" name="Q_NAME" placeholder="홍길동" required="required" value="${dtl.Q_NAME }">
				</div>
				<div class="input_wrapper">
					<label for="Q_MOBILE">연락처</label>
					<input type="text" id="Q_MOBILE" name="Q_MOBILE" placeholder="01012345678 '-' 없이 입력"  maxlength="11" required="required" value="${dtl.Q_MOBILE }">
				</div>
				<div class="input_wrapper">
					<label for="Q_EMAIL">이메일</label>
					<input type="text" id="Q_EMAIL" name="Q_EMAIL" placeholder="example@mail.com" required="required" value="${dtl.Q_EMAIL }">
				</div>
				<div class="input_wrapper">
					<label for="Q_TITLE">제목</label>
					<input type="text" id="Q_TITLE" name="Q_TITLE" placeholder="문의 제목" maxlength="50" required="required" value="${dtl.Q_TITLE }">
				</div>
				<div class="input_wrapper">
					<label for="Q_CONT">문의내용</label>
					<textarea id="Q_CONT" name="Q_CONT" rows="5" placeholder="문의 내용" required="required">${dtl.Q_CONT }</textarea>
				</div>
				<div class="input_wrapper">
					<label for="Q_PWD">비밀번호</label>
					<input type="password" id="Q_PWD" name="Q_PWD" placeholder="비밀번호" required="required"">
				</div>
				<input type="hidden" id="Q_NUM" name="Q_NUM" value="${dtl.Q_NUM }">
			</div>
		</div>
		
		<div class="btn_form_half">
			<input type="button" id="btn_qust_cancel" class="btn" value="취소" /> 
			<input type="button" id="btn_qust_update" class="btn" value="수정" />
		</div>
	</div>
</form>