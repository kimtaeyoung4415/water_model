<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container" align="center">
	<div class="sub-container">
		<div id="dtl_tit">
			<h5>${dtl.Q_TITLE}</h5>
			<h6>
				<c:if test="${dtl.Q_REG_DATE == now }">
					<c:if test="${dtl.Q_UPDT_DATE == null}">
						${dtl.Q_REG_TIME}
					</c:if>
					<c:if test="${dtl.Q_UPDT_DATE != null}">
						${dtl.Q_UPDT_TIME}
					</c:if>
				</c:if>
				<c:if test="${dtl.Q_REG_DATE != now }">
					<c:if test="${dtl.Q_UPDT_DATE == null}">
						${dtl.Q_REG_DATE}
					</c:if>
					<c:if test="${dtl.Q_UPDT_DATE != null}">
						${dtl.Q_UPDT_DATE}
					</c:if>
				</c:if>
			</h6>
		</div>
		
		<div class="application_modal">
			<div id="dtl_cont">
				<div class="">
					<span id="VIEW_CNT">조회수 : ${dtl.VIEW_CNT}</span>
				</div>
				<div class="span_wrapper">
					<span id="Q_NAME">${dtl.Q_NAME}</span>
				</div>
				<div class="span_wrapper">					
					<textarea id="Q_CONT" rows="10" readonly="readonly" disabled>${dtl.Q_CONT}</textarea>
				</div>
			</div>

			<c:if test="${dtl.A_CONT != null }">
				<div>
					<div class="span_wrapper">
						<span id="Q_NAME">${dtl.A_NAME }</span>
					</div>
					<div class="span_wrapper">						
						<textarea id="A_CONT" name="A_CONT" rows="10" readonly="readonly" disabled>${dtl.A_CONT}</textarea>
					</div>
				</div>
			</c:if>
			
			<input type="hidden" id="Q_NUM" name="Q_NUM" value="${dtl.Q_NUM }" />
			<div id="dtl_list">
				<a href="/qna/list.do">LIST</a>
			</div>

		</div>

		<c:if test="${dtl.A_CONT == null}">
			<div class="btn_form_half">
				<input type="button" id="btn_w_qna_delete" class="btn pwd_check" value="삭제" /> 
				<input type="button" id="btn_w_qna_update" class="btn pwd_check" value="수정" />
			</div>
		</c:if>

	</div>
</div>
