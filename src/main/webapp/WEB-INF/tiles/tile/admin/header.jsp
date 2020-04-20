<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%-- tiles header form --%>

<header>
	<h1 class="logo">
		<a href="/"> 
			<img alt="로고1" src="${ctxPath}/resources/img/main/logo.png">
		</a>
	</h1>
	<nav class="gnb">
		<ul>
			<li >ABOUT</li>
			<li>MANAGEMENT</li>
			<li>MEDIA</li>
			<li>Q&amp;A</li>
		</ul>
	</nav>
	<div class="gnb_slider">
		<ul>
			<li>
				<ul>
					<li id="a-mng-women">WOMEN</li>
					<li id="a-mng-men">MEN</li>
					<li id="a-mng-development">DEVELOPMENTS</li>
					<li id="a-mng-actors">ACTORS</li>
				</ul>
			</li>
			<li>
				<ul id=sub_menu>
					<li id="a-media-magazine">MAGAZINE</li>
				</ul>
			</li>
			<li>
				<ul>
					<li id="a-brd-qna">Q&amp;A</li>
					<li id="a-brd-notice">NOTICE</li>
					<li id="a-nego">NEGOTIATION</li>
					<li id="a-rec">RECRUITMENT</li>
				</ul>
			</li>
		</ul>
	</div>
</header>