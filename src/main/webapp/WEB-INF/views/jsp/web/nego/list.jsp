<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="list_container">
	<div class="list_nav">
		<ul>
			<li><a href="/ntce/list.do">NOTICE</a></li>
			<li>.</li>
			<li><a href="/qna/list.do">Q&amp;A</a></li>
			<li>.</li>
			<li><a href="/rit/list.do">MODEL REG</a></li>
		</ul>
	</div>
	<div class="list_title">
		<h2>NEGOTIATION</h2>
		<hr class="list_hr">
	</div>
	<div class="list_length">
		<span>전체 : <strong id="list-cnt">${list_count}</strong> 개
		</span>
	</div>
	<%
		
	%>
	<table class="list_table">
		<colgroup>
			<col width="8%">
			<col width="40%">
			<col width="10%">
			<col width="10%">
			<col width="10%">
			<col>
		</colgroup>
		<thead class="list_thead">
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>진행상황</th>
			</tr>
		</thead>
		<tbody class="list_tbody">
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
			<tr id="nego_page_test" value="1">
				<td>1</td>
				<td>test</td>
				<td>test</td>
				<td>test</td>
				<td>test</td>
			</tr>
		</tbody>
	</table>
	<div class="list_btn_box">
		<input type="button" class="list_btn" id="btn_w_nego_ins" value="등록" />
	</div>
	<div id="list-paging"></div>
</div>