<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="list_container">
	<div class="list_nav">
		<ul>
			<li><a href="/qna/list.do">Q&amp;A</a></li>
			<li>.</li>
			<li><a href="/ntce/list.do">NOTICE</a></li>
			<li>.</li>
			<li><a href="/nego/list.do">NEGO</a></li>
			<li>.</li>
			<li><a href="/rit/list.do">MODEL REG</a></li>
		</ul>
	</div>

	<div class="list_title">
		<h2>Q&amp;A</h2>
		<hr class="list_hr">
	</div>
	
	<div class="list_length">
		<span>전체 : <strong>${list_count}</strong> 개
		</span>
	</div>

	<table class="list_table">
		<colgroup>
			<col width="8%">
			<col width="40%">
			<col width="10%">
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
				<th>조회수</th>
				<th>진행상황</th>
			</tr>
		</thead>

		<tbody class="list_tbody">
			<c:forEach var="list" items="${list}" varStatus="status">
				<tr Q_NUM="${list.Q_NUM}">
					<td>${list.Q_NUM}</td>
					<td class="td_title">${list.Q_TITLE}<c:if
							test="${list.Q_UPDT_DATE == null}">
							<c:if test="${list.Q_REG_DATE == now}">
								<img src="/resources/img/new.png" id="img" class="brd_new">
								<td>${list.Q_REG_TIME}</td>
							</c:if>
							<c:if test="${list.Q_REG_DATE != now}">
								<td>${list.Q_REG_DATE}</td>
							</c:if>
						</c:if> <c:if test="${list.Q_UPDT_DATE != null}">
							<c:if test="${list.Q_UPDT_DATE == now}">
								<img src="/resources/img/update.png" id="img" class="brd_new">
								<td>${list.Q_UPDT_TIME}</td>
							</c:if>
							<c:if test="${list.Q_UPDT_DATE != now}">
								<td>${list.Q_UPDT_DATE}</td>
							</c:if>
						</c:if>
					</td>
					<td>${list.Q_NAME}</td>
					<td>${list.VIEW_CNT}</td>
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

	<div class="list_paging">
		<nav class="list_pageing">
			<div class="list_pagination">${pagination }</div>
		</nav>
	</div>
</div>