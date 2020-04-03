<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container" align="center">
	<div class="sub-container">
		<div id="dtl_tit">
			<h5>${dtl.N_TITLE}</h5>
			<h6>
				<c:if test="${dtl.N_UPDT_DATE == null}">
					${dtl.N_REG_DATE}
				</c:if>
				<c:if test="${dtl.N_UPDT_DATE != null}">
					${dtl.N_UPDT_DATE}
				</c:if>
			</h6>
		</div>
		
		<div class="application_modal">
			<div id="dtl_cont">
				<div>
					<span id="VIEW_CNT">조회수 : ${dtl.VIEW_CNT}</span>
				</div>
				<div class="span_wrapper">
					<span id="N_NAME">${dtl.N_NAME}</span>
				</div>
				<div class="span_wrapper">					
					<textarea id="N_CONT"  style="border: none; background: whitesmoke;" rows="10" readonly="readonly" disabled>${dtl.N_CONT}</textarea>
				</div>
			</div>
			
			<input type="hidden" id="N_NUM" name="N_NUM" value="${dtl.N_NUM }" />
			<div id="dtl_list">
				<a href="/ntce/list.do">LIST</a>
			</div>
		</div>

	</div>
</div>