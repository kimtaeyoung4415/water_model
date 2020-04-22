<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="dtl_container">
	<div class="sub-container">
		<div class="application_modal">
		<div class="dtl_tit">
			<p>${dtl.C_TITLE}</p>
			<span class="dtl_date">
				<c:if test="${dtl.C_UPDT_DATE == null}">
					${dtl.C_REG_DATE}
				</c:if>
				<c:if test="${dtl.C_UPDT_DATE != null}">
					${dtl.C_UPDT_DATE}
				</c:if>
			</span>
			</div>
		</div>
		
		<div class="application_modal">
			<div class="dtl_cont">
				<div class="dtl_length">
				</div>
				<div class="dtl_name">
					<span id="C_NAME">${dtl.C_NAME}</span>
				</div>
				<div class="dtl_content">					
					<textarea id="C_CONT" rows="15" disabled>${dtl.C_CONTENT}</textarea>
				</div>
			</div>

			<c:if test="${dtl.A_CONT != null }">
				<div class="dtl_cont">
					<div class="dtl_name">
						<span id="C_NAME">${dtl.A_NAME }</span>
					</div>
					<div class="dtl_content">						
						<textarea id="A_CONT" name="A_CONT" rows="15" disabled>${dtl.A_CONT}</textarea>
					</div>
				</div>
			</c:if>
			
			<input type="hidden" id="C_NUM" name="C_NUM" value="${dtl.C_NUM }" />
			<div class="dtl_list">
				<a href="/nego/list.do">LIST</a>
			</div>

		</div>

		<c:if test="${dtl.C_CONT == null}">
			<div class="btn_form_half">
				<input type="button" id="btn_w_nego_delete" class="nego_pwd_check" value="삭제" /> 
				<input type="button" id="btn_w_nego_update" class="nego_pwd_check" value="수정" />
			</div>
		</c:if>

	</div>
</div>
