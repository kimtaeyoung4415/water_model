<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
				<col>
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
					<tr>
						<td>${list.Q_NUM}</td>
						<td>${list.Q_TITLE}</td>
						<td>${list.Q_NAME}</td>
						<c:if test="${list.Q_UPDT_DATE == null}">
							<td>${list.Q_REG_DATE}</td>
						</c:if>
						<c:if test="${list.Q_UPDT_DATE != null}">
							<td>${list.Q_UPDT_DATE}</td>
						</c:if>
						<td>${list.VIEW_CNT}</td>
						<c:if test="${list.A_CONT == null}">
							<td>진행중</td>
						</c:if>
						<c:if test="${list.A_CONT != null}">
							<td>답변완료</td>
						</c:if>
						<td>	
							<input type="hidden" id="Q_NUM_${list.Q_NUM}" name="Q_NUM_${list.Q_NUM}" value="${list.Q_NUM}"/>
						</td>						
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