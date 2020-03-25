<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
	String ctxPath = request.getContextPath();
%>

<div class="container" align="center">		
	<div class="qust-container">
		<div class="qust-title">
			<span>Q & A</span>
			<hr>
		</div>
		<div align="right">
			<span>전체 : <strong id="list-cnt">${list_count}</strong> 개</span>
		</div>	
		
		<table class="qust-table">
			<colgroup>
				<col width="8%">
				<col width="40%">
				<col width="10%">
				<col width="10%">
				<col width="10%">
				<col width="10%">
			</colgroup>
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
					<th>조회수</th>
					<th>진행상황</th>
				</tr>	
			</thead>
			<tbody id="qust-list">
				<c:forEach var="list" items="${list}" varStatus="status">
					<tr data="${list.no}">
						<td>${list.no}</td>
						<td>${list.q_title}</td>
						<td>${list.q_username}</td>
						<c:if test="${list.q_updtdate == null}">
							<td>${list.q_regdate}</td>
						</c:if>
						<c:if test="${list.q_updtdate != null}">
							<td>${list.q_updtdate}</td>
						</c:if>
						<td>${list.view_cnt}</td>
						<c:if test="${list.a_cont == null}">
							<td>진행중</td>
						</c:if>
						<c:if test="${list.a_cont != null}">
							<td>답변완료</td>
						</c:if>
					</tr>
				</c:forEach>					
			</tbody>
		</table>
		<div align="right">
			<input type="button" class="btn" id="btn_qust_ins" value="등록"/>
		</div>
		<div id="list-paging">
		</div>
	</div>
</div>