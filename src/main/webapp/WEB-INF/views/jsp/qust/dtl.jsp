<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container" align="center">
	<div class="sub-container">
		<div>
			
		</div>
		
		<div class="application_modal">		
			<div>
				<div class="span_wrapper">
					<label for="Q_NAME">이름</label>
					<span id="Q_NAME">${dtl.Q_NAME}</span>
				</div>
				<div class="span_wrapper">
					<label for="Q_TITLE">제목</label>
					<span id="Q_TITLE">${dtl.Q_TITLE}</span>
				</div>
				<div class="span_wrapper">
					<label for="Q_CONT">문의</label>
					<textarea id="Q_CONT" rows="10" readonly="readonly">${dtl.Q_CONT}</textarea>
				</div>
			</div>
			
			<c:if test="${dtl.A_CONT != null }">
				<div>
					<div class="span_wrapper">
						<label for="A_CONT">답변</label>
						<textarea id="A_CONT" name="A_CONT" rows="10" readonly="readonly">${dtl.A_CONT}</textarea>
					</div>
				</div>
			</c:if>			
			
			<div>
				<a href="/brd/qust/list.do">LIST</a>
			</div>
						
		</div>
		
		<c:if test="${dtl.A_CONT == null}">
			<div class="btn_form_half">
				<input type="button" id="btn_qust_delete" class="btn pwd_check" value="삭제" />
				<input type="button" id="btn_qust_update" class="btn pwd_check" value="수정" />
			</div>
		</c:if>	
		
	</div>		
</div>	