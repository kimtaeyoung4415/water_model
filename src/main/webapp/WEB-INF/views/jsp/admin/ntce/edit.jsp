<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<form name="a_ntce_updt_form">
	<div class="container" align="center">
		<div class="sub-container">	
			<div class="application_modal">
				<h3>공지 수정</h3>
				<div class="chk-area">					
					<label for="IMP_YN" class="chk">중요 여부
						<c:if test="${dtl.IMP_YN == N }">
							<input type="checkbox" id="IMP_YN" name="IMP_YN" value="${dtl.IMP_YN}"/>
						</c:if>
						<c:if test="${dtl.IMP_YN != Y }">
							<input type="checkbox" id="IMP_YN" name="IMP_YN" value="${dtl.IMP_YN}" checked="true"/>
						</c:if>
						
						<span class="chkmark"></span>
					</label>
				</div>
				<div class="input_wrapper">
					<label for="N_TITLE">제목</label>
					<input type="text" id="N_TITLE" name="N_TITLE" placeholder="홍길동" required="required" value="${dtl.N_TITLE}">
				</div>
				<div class="input_wrapper">
					<label for="N_CONT">공지</label>
					<textarea id="N_CONT" name="N_CONT" rows="10" placeholder="문의 내용" required="required">${dtl.N_CONT}</textarea>
				</div>
				<div class="filebox preview-image">
					<input class="upload-name" value="${dtl.N_ORG_IMGNAME}" disabled="disabled"> 
					<label for="N_FILE">업로드</label> 
					<input type="file" id="N_FILE" class="upload-hidden"> 
				</div>
			</div>
			
			<div class="btn_form_half">
				<input type="button" id="btn_cancel" class="btn" value="취소" /> 
				<input type="button" id="btn_update" class="btn" value="저장" />
			</div>
	
		</div>
	</div>
</form>