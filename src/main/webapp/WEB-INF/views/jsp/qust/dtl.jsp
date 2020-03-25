<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
	String ctxPath = request.getContextPath();
%>

<div class="container" align="center">
	<div class="sub-container">
		<div>
			
		</div>
		
		<div class="application_modal">
		
			<input type="hidden" id="no" name="no" value="${dtl.no}"/>	
		
			<div>
				<div class="span_wrapper">
					<label for="Q_USERNAME">이름</label>
					<span id="Q_USERNAME">${dtl.q_username}</span>
				</div>
				<div class="span_wrapper">
					<label for="Q_TITLE">제목</label>
					<span id="Q_TITLE">${dtl.q_title}</span>
				</div>
				<div class="span_wrapper">
					<label for="Q_CONT">문의</label>
					<textarea id="Q_CONT" rows="10" readonly="readonly">${dtl.q_cont}</textarea>
				</div>
			</div>
			
			<c:if test="${dtl.a_cont != null }">
				<div>
					<div class="span_wrapper">
						<label for="Q_CONT">답변</label>
						<textarea id="Q_CONT" name="Q_CONT" rows="10" readonly="readonly">${dtl.a_cont}</textarea>
					</div>
				</div>
			</c:if>			
			
			<div>
				<a href="/brd/qust/list.do">LIST</a>
			</div>
						
		</div>
		
		<c:if test="${dtl.a_cont == null}">
			<div class="btn_form_half">
				<input type="button" id="btn_qust_delete" class="btn pwd_check" value="삭제"/>
				<input type="button" id="btn_qust_update" class="btn pwd_check" value="수정"/>
			</div>
		</c:if>	
	</div>		
</div>	