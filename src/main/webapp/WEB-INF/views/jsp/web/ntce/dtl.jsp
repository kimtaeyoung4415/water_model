<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="dtl_container">
	<div class="sub-container">
		<div class="application_modal">
			<div class="dtl_tit">
				<p>${dtl.N_TITLE}</p>
				<span class="dtl_date"> <c:if
						test="${dtl.N_UPDT_DATE == null}">
						<c:if test="${dtl.N_REG_DATE == now}">
						${dtl.N_REG_TIME}
					</c:if>
						<c:if test="${dtl.N_REG_DATE != now}">
						${dtl.N_REG_DATE}
					</c:if>
					</c:if> <c:if test="${dtl.N_UPDT_DATE != null}">
						<c:if test="${dtl.N_UPDT_DATE == now}">
						${dtl.N_UPDT_TIME}
					</c:if>
						<c:if test="${dtl.N_UPDT_DATE != now}">
						${dtl.N_UPDT_DATE}
					</c:if>
					</c:if>
				</span>
			</div>
			<div class="dtl_cont">
				<div class="dtl_length">
					<span class="list_length">조회수 : ${dtl.VIEW_CNT}</span>
				</div>
				<div class="dtl_name">
					<span id="N_NAME">${dtl.N_NAME}</span>
				</div>
				<div class="dtl_content">
					<textarea id="N_CONT" rows="15" >${dtl.N_CONT}</textarea>
				</div>
			</div>
			<input type="hidden" id="N_NUM" name="N_NUM" value="${dtl.N_NUM }" />
			<div class="dtl_list">
				<a href="/ntce/list.do">LIST ▶</a>
			</div>
		</div>

	</div>
</div>
