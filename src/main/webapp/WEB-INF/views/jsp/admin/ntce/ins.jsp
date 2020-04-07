<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<form name="a_ntce_ins_form">
	<div class="container" align="center">
		<div class="sub-container">
			<div class="application_modal">
				<h3>공지 작성</h3>
				<div class="chk-area">					
					<label for="IMP_YN" class="chk">중요 여부
						<input type="checkbox" id="IMP_YN" name="IMP_YN"/>
						<span class="chkmark"></span>
					</label>
				</div>
				<div class="input_wrapper">
					<label for="N_TITLE">제목</label>
					<input type="text" id="N_TITLE" name="N_TITLE" placeholder="홍길동" required="required">
				</div>
				<div class="input_wrapper">
					<label for="N_CONT">문의내용</label>
					<textarea id="N_CONT" name="N_CONT" rows="10" placeholder="문의 내용" required="required"></textarea>
				</div>
				<div class="filebox preview-image">
					<input class="upload-name" value="파일선택" disabled="disabled"> 
					<label for="N_FILE">업로드</label> 
					<input type="file" id="N_FILE" class="upload-hidden"> 
				</div>
			</div>
		</div>
		 
		<div class="btn_form">
			<input type="button" id="btn_ntce_ins" class="btn" value="등록"/>
		</div>
	</div>
</form>