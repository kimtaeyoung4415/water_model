<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container" align="center">		
	<div class="brd-container">
	
		<div class="nav">
			<ul>
				<li><a href="/admin/ntce/list.do">NOTICE</a></li>
				<li>.</li>
				<li><a href="/admin/qna/list.do">QA</a></li>
				<li>.</li>
				<li><a href="/admin/rit/list.do">MODEL REG</a></li>
			</ul>
		</div>
		
		<div class="brd-title">
			<span>Q & A</span>
			<hr>
		</div>
		
		<div align="right" class="brd-cnt">
			<span>전체 : <strong id="list-cnt">${list_count}</strong> 개</span>
		</div>	
		
		<table class="brd-table">
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
			
			<tbody id="a-qna-list" class="brd-tbody">
				<c:forEach var="list" items="${list}" varStatus="status">
					<tr Q_NUM="${list.Q_NUM}">
						<td>${list.Q_NUM}</td>
						<td class="td_title">${list.Q_TITLE}
							<c:if test="${list.Q_UPDT_DATE == null}">
								<c:if test="${list.Q_REG_DATE == now}">
									<img src="/resources/img/new.png" id="img" class="brd_new">
									<td>${list.Q_REG_TIME}</td>
								</c:if>
								<c:if test="${list.Q_REG_DATE != now}">
									<td>${list.Q_REG_DATE}</td>
								</c:if>	
							</c:if>
							
							<c:if test="${list.Q_UPDT_DATE != null}">
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
					<input type="hidden" id="Q_NUM" name="Q_NUM" value="${list.Q_NUM}"/>					
				</c:forEach>					
			</tbody>
		</table>

		<div id="list-paging">
			<nav class="pageing">
				<div class="pagination">
					${pagination }					
				</div>
			</nav>
		</div>
		
	</div>
</div>