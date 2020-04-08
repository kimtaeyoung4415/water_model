<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container" align="center">		
	<div class="w-qna-container">
		<div class="w-qna-title">
			<span>NEGOTIATION</span>
			<hr>
		</div>
		<div align="right">
			<span>전체 : <strong id="list-cnt">${list_count}</strong> 개</span>
		</div>	
		<%
		
		%>
		<table class="w-qna-table">
			<colgroup>
				<col width="8%">
				<col width="40%">
				<col width="10%">
				<col width="10%">
				<col width="10%">
				<col>
			</colgroup>
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
					<th>진행상황</th>
				</tr>	
			</thead>
			<tbody id="w-nego-list">
				<c:forEach var="list" items="${list}" varStatus="status">
					<tr C_NUM="${list.C_NUM}">
						<td>${list.C_NUM}</td>
						<td>${list.C_TITLE}</td>
						<td>${list.C_NAME}</td>
						<c:if test="${list.C_UPDT_DATE == null}">
							<td>${list.C_REG_DATE}</td>
						</c:if>
						<c:if test="${list.C_UPDT_DATE != null}">
							<td>${list.C_UPDT_DATE}</td>
						</c:if>
						<c:if test="${list.A_CONT == null}">
							<td>진행중</td>
						</c:if>
						<c:if test="${list.A_CONT != null}">
							<td>답변완료</td>
						</c:if>					
					</tr>
				</c:forEach>					
			</tbody>
		</table>
		<div align="right">
		</div>
		<div id="list-paging">
		</div>
	</div>
</div>