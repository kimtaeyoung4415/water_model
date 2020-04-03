<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%-- tiles header form --%>

<div id="test_id" class="container-fluid">
	<div id=com_logo></div>
	<div id="nav-var">
		<nav>
			<ul class="clearfix">
				<li><a href="/about/company.do">about</a></li>
				<li>management
					<ul>
						<li><a href="/mng/women/list.do">women</a></li>
						<li><a href="/mng/men/list.do">men</a></li>
						<li><a href="/mng/devel/list.do">development</a></li>
						<li><a href="/mng/actors/list.do">actors</a></li>
					</ul>
				</li>
				<li>media
					<ul id=sub_menu>
						<li><a href="/media/magazine.do">magazine</a></li>
					</ul>
				</li>
				<li>Q&A
					<ul>
						<li><a href="/qna/dtl.do">DTL</a></li>
						<li><a href="/qna/edit.do">edit</a></li>
						<li><a href="/qna/ins.do">ins</a></li>
						<li><a href="/qna/list.do">list</a></li>
					</ul>
				</li>
			</ul>
		</nav>
	</div>
</div>