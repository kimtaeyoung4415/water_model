<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container" align="center">
	<div class="sub-container">
	
		<div class="application_modal">
			<h3>공지 수정</h3>
			<div class="chk-area">					
				<label for="IMP_YN" class="chk">중요 여부
					<input type="checkbox" id="IMP_YN" name="IMP_YN"/>
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
	
	
	
	
	
	
	
	
		<div id="dtl_tit">
			<h5>${dtl.N_TITLE}</h5>
			<h6>
				<c:if test="${dtl.N_REG_DATE == now }">
					<c:if test="${dtl.N_UPDT_DATE == null}">
						${dtl.N_REG_TIME}
					</c:if>
					<c:if test="${dtl.N_UPDT_DATE != null}">
						${dtl.N_UPDT_TIME}
					</c:if>
				</c:if>
				<c:if test="${dtl.N_REG_DATE != now }">
					<c:if test="${dtl.N_UPDT_DATE == null}">
						${dtl.N_REG_DATE}
					</c:if>
					<c:if test="${dtl.N_UPDT_DATE != null}">
						${dtl.N_UPDT_DATE}
					</c:if>
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
				<a href="/admin/ntce/list.do">LIST</a>
			</div>
		</div>
		
		<div class="btn_form_half">
			<input type="button" id="btn_a_ntce_delete" class="btn" value="삭제" /> 
			<input type="button" id="btn_a_ntce_update" class="btn" value="수정" />
		</div>

	</div>
</div>
