<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container" align="center">		
	<div class="ntce-container">
		<div class="ntce-title">
			<span>NOTICE</span>
			<hr>
		</div>
		<div align="right">
			<span>전체 : <strong id="list-cnt">${list_count}</strong> 개</span>
		</div>	
		
		<table class="ntce-table">
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
					<th>작성일</th>
					<th>공지</th>
				</tr>	
			</thead>
			<tbody id="ntce-list">
				<c:forEach var="list" items="${list}" varStatus="status">
					<tr N_DATA="${list.N_NUM}">
						<td>${list.N_REG_DATE}</td>
						<td>${list.N_TITLE}</td>				
					</tr>				
				</c:forEach>					
			</tbody>
		</table>
		<div align="right">
			<input type="button" class="btn" id="btn_ntce_ins" value="등록"/>
		</div>
		<div id="list-paging">
		</div>
	</div>
</div>