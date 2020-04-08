<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container" align="center">		
	<div class="w-ntce-container">
		<div class="w-ntce-title">
			<span>NOTICE</span>
			<hr>
		</div>
		<div align="right">
			<span>전체 : <strong id="list-cnt">${list_count}</strong> 개</span>
		</div>	
		
		<table class="w-ntce-table">
			<colgroup>
				<col width="4%">
				<col width="40%">
				<col width="8%">
				<col width="8%">
			</colgroup>
			<thead>
				<tr>
					<th></th>
					<th>제목</th>
					<th>작성일</th>
					<th>조회</th>
				</tr>	
			</thead>
			<tbody id="w-ntce-list">
				<c:forEach var="list" items="${list}" varStatus="status">
					<c:if test="${list.IMP_YN == 'Y' }">
						<tr N_NUM="${list.N_NUM}" class="ty_Y">
							<td>중요</td>
							<td  style="text-align: left">${list.N_TITLE}
								<c:if test="${list.N_UPDT_DATE == null}">
									<c:if test="${list.N_REG_DATE == now}">
										<img src="/resources/img/new.png" id="img" class="brd_new">
										<td>${list.N_REG_TIME}</td>
									</c:if>
									<c:if test="${list.N_REG_DATE != now}">
										<td>${list.N_REG_DATE}</td>
									</c:if>	
								</c:if>
								
								<c:if test="${list.N_UPDT_DATE != null}">
									<c:if test="${list.N_UPDT_DATE == now}">
										<img src="/resources/img/update.png" id="img" class="brd_new">
										<td>${list.N_UPDT_TIME}</td>
									</c:if>
									<c:if test="${list.N_UPDT_DATE != now}">
										<td>${list.N_UPDT_DATE}</td>
									</c:if>									
								</c:if>		
							</td>
							<td>${list.VIEW_CNT}</td>
						</tr>
					</c:if>		
				</c:forEach>	
				
				<c:forEach var="list" items="${list}" varStatus="status">
					<c:if test="${list.IMP_YN == 'N' }">
						<tr N_NUM="${list.N_NUM}">
							<td>공지</td>
							<td class="td_title">${list.N_TITLE}
								<c:if test="${list.N_UPDT_DATE == null}">
									<c:if test="${list.N_REG_DATE == now}">
										<img src="/resources/img/new.png" id="img" class="brd_new">
										<td>${list.N_REG_TIME}</td>
									</c:if>
									<c:if test="${list.N_REG_DATE != now}">
										<td>${list.N_REG_DATE}</td>
									</c:if>	
								</c:if>
								
								<c:if test="${list.N_UPDT_DATE != null}">
									<c:if test="${list.N_UPDT_DATE == now}">
										<img src="/resources/img/update.png" id="img" class="brd_new">
										<td>${list.N_UPDT_TIME}</td>
									</c:if>
									<c:if test="${list.N_UPDT_DATE != now}">
										<td>${list.N_UPDT_DATE}</td>
									</c:if>									
								</c:if>		
							</td>
							<td>${list.VIEW_CNT}</td>
						</tr>
					</c:if>					
				</c:forEach>					
			</tbody>
		</table>
		<div id="list-paging">
		</div>
	</div>
</div>