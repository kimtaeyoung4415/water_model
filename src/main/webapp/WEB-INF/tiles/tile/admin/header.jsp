<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%-- tiles header form --%>

<div id="test_id" class="container-fluid">
	<div id=com_logo onclick="location.href='/admin/main.do'">
		<img src="${ctxPath}/resources/img/logo.png" style=" width: 100%;height: 100%;"/>
	</div>
	<div id="nav-var">
		<nav>
			<ul class="clearfix">
				<li>MANAGEMENTS
					<ul>
						<li id="a-mng-women">WOMEN</li>
						<li id="a-mng-men">MEN</li>
						<li id="a-mng-development">DEVELOPMENTS</li>
						<li id="a-mng-actors">ACTORS</li>
					</ul>
				</li>
				<li>MEDIA
					<ul id=sub_menu>
						<li id="a-media-magazine">MAGAZINE</li>
					</ul>
				</li>
				<li>Q&A
					<ul>
						<li id="a-brd-qna">Q & A</li>
						<li id="a-brd-notice">NOTICE</li>
						<li id="a-nego">NEGOTIATION</li>
						<li id="a-rec">RECRUITMENT</li>
					</ul>
				</li>
			</ul>
		</nav>
	</div>
</div>