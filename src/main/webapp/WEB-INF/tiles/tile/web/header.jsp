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
			<li>ABOUT</li>
			<li>MANAGEMENT</li>
			<li>MEDIA</li>
			<li>Q&amp;A</li>
		</ul>
	</nav>
	<div class="gnb_slider">
		<ul>
			<li>
				<ul>
					<li id="w-mng-women">WOMEN</li>
					<li id="w-mng-men">MEN</li>
					<li id="w-mng-development">DEVELOPMENTS</li>
					<li id="w-mng-actors">ACTORS</li>
				</ul>
			</li>
			<li>
				<ul id=sub_menu>
					<li id="w-media-magazine">MAGAZINE</li>
				</ul>
			</li>
			<li>
				<ul>
					<li id="w-brd-qna">Q&amp;A</li>
					<li id="w-brd-notice">NOTICE</li>
					<li id="w-nego">NEGOTIATION</li>
					<li id="w-rec">RECRUITMENT</li>
				</ul>
			</li>
		</ul>
	</div>
</header>