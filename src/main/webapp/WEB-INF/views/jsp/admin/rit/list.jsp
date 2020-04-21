<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<section class="a_recruitment_board">
	<div class="container">
		<div class="row">
			<div class="List_nav">
				<ul>
					<li><a href="/ntce/list.do">NOTICE</a></li>
					<li>.</li>
					<li><a href="/qna/list.do">QA</a></li>
					<li>.</li>
					<li><a href="/rit/list.do">MODEL REG</a></li>
				</ul>
			</div>
			<div class="list_title">
				<h2>MODEL REGIST</h2>
				<hr class="list_hr">
			</div>
			<div class="list_length">
				<span>
					전체:
					<strong class=""> </strong>
				</span>
			</div>
			<form action="dtl.do">
			<table class="list_table">
				<thead class="list_thead">
					<tr>
						<th>번호</th>
						<th>신청자</th>
						<th>작성일</th>
						<th>진행상황</th>
						<th>조회수</th>
					</tr>
				</thead>
				<tbody id="list_tbody">
					<tr>
						<td><a href="">0</a></td>
						<td><a href="">나요</a></td>
						<td><a href="">20200-03-14</a></td>
						<td><a href="">진행주</a></td>
						<td><a href="">3</a></td>
					</tr>		
					<tr>
						<td><a href="">게시판</a></td>
						<td><a href="">게시판</a></td>
						<td><a href="">게시판</a></td>
						<td><a href="">게시판</a></td>
						<td><a href="">게시판</a></td>
					</tr>		<tr>
						<td><a href="">게시판</a></td>
						<td><a href="">게시판</a></td>
						<td><a href="">게시판</a></td>
						<td><a href="">게시판</a></td>
						<td><a href="">게시판</a></td>
					</tr>		<tr>
						<td><a href="">게시판</a></td>
						<td><a href="">게시판</a></td>
						<td><a href="">게시판</a></td>
						<td><a href="">게시판</a></td>
						<td><a href="">게시판</a></td>
					</tr>		
				</tbody>
			</table>
			<br>
			<div align="right">
				<label for="r_button"></label>
				<input type="submit"  id="r_button" name="r_button" value="지원">
			</div>
			</form>
			<nav class="list_pageing">
						<div class="list_ pagination">
							<a href="#">&laquo;</a>
							<a href="#">1</a>
							<a href="#">2</a>
							<a href="#" class="active">3</a>
							<a href="#">4</a>
							<a href="#">5</a>
							<a href="#">&raquo;</a>
						</div>
			</nav>
			</div>
	</div>
</section>