<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>    
<%
	// localhost:port/ or ip:port/
	String ctxPath = request.getContextPath();
%>    
<!DOCTYPE html>
<%-- 

	tiles 
	
	고정된 폼(header, content, footer)에 사용할 JSP 파일을 생성하여 해당 JSP 파일에 header, footer include 없이 
	해당 JSP를 고정된 tiles 폼의 content 영역에 부착하여 사용하는 폼형식  

	각 JSP에 사용되어지는 CSS 파일이나 JS 파일 또는 각 메타에 대한 정의들을 정의할 필요없이 tiles 폼에 모두 한번만 정의해 두면 
	각 JSP에 각각 정의하지않아도 extends 식으로 사용가능하다
	
--%>
<html>
<head>
	<title>Water Entertainment</title>
	
	<meta charset="UTF-8">
	
	<%-- 반응형웹  --%>
	<meta name="viewport" content="width=device-width, initial-scale=1"> 
	
	<%-- bootstrap css --%>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	
	<%-- css --%>
	<link rel="stylesheet" href="${ctxPath}/resources/css/extra.css" media="all" type="text/css" />
	<link rel="stylesheet" href="${ctxPath}/resources/css/model.css" media="all" type="text/css" />
	<link rel="stylesheet" href="${ctxPath}/resources/css/utils/jquery.alerts.css" media="all" type="text/css" />	<%-- jAlert --%>
	<link rel="stylesheet" href="${ctxPath}/resources/css/magazine.css" media="all" type="text/css" />
	<link rel="stylesheet" href="${ctxPath}/resources/css/viewdetails.css" media="all" type="text/css" />
	
	
	<%-- script --%>	
	<script type="text/javascript" src="${ctxPath}/resources/utils/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="${ctxPath}/resources/utils/jquery.alerts.js"></script>			<%-- jAlert --%>		
	<script type="text/javascript" src="${ctxPath}/resources/js/brd/qust/qust.js"></script>				<%-- QnA 게시판 --%>
	
	<%-- bootstrap --%>
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
	
</head>

<body>
	<div id="web_container">
		<div id="header">
			<tiles:insertAttribute name="header"/>
		</div>
		
		<div id="content">
			<tiles:insertAttribute name="content"/>
		</div>
		
		<div id="footer">
			<tiles:insertAttribute name="footer"/>
		</div>
	</div>
</body>

</html>