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
	
	<%-- css --%>
	<link rel="stylesheet" href="${ctxPath}/resources/css/extra.css" media="all" type="text/css" />
	<link rel="stylesheet" href="${ctxPath}/resources/css/model.css" media="all" type="text/css" />		<%--model --%>
	<link rel="stylesheet" href="${ctxPath}/resources/css/utils/jquery.alerts.css" media="all" type="text/css" />	<%-- jAlert --%>
	<link rel="stylesheet" href="${ctxPath}/resources/css/magazine.css" media="all" type="text/css" />		<%--magazine --%>
	<link rel="stylesheet" href="${ctxPath}/resources/css/viewdetails.css" media="all" type="text/css" />
	<link rel="stylesheet" href="${ctxPath}/resources/css/header.css" media="all" type="text/css" />	<%--header --%>
	<link rel="stylesheet" href="${ctxPath}/resources/css/footer.css" media="all" type="text/css" />	<%--footer --%>
	<link rel="stylesheet" href="${ctxPath}/resources/css/pabout.css" media="all" type="text/css" />	<%--about --%>
	<link rel="stylesheet" href="${ctxPath}/resources/css/semantic.min.css" media="all" type="text/css" />	<%--magazine --%>
	<link rel="stylesheet" href="${ctxPath}/resources/css/mngview.css" media="all" type="text/css" />	<%--mngview --%>
	<link rel="stylesheet" href="${ctxPath}/resources/css/main.css" media="all" type="text/css" />	<%--main --%>
	<link rel="stylesheet" href="${ctxPath}/resources/css/jquery.bxslider.css" media="all" type="text/css" />	<%--slider --%>
	<link rel="stylesheet" href="${ctxPath}/resources/css/recruitment.css" media="all" type="text/css" />	<%--main --%>
	
	
	<link rel="shortcut icon" href="${ctxPath}/resources/img/favicon.ico" type="image/x-icon"><%--icon --%>
	<link href="https://fonts.googleapis.com/css?family=Sunflower:300,500,700&display=swap&subset=korean" rel="stylesheet"> <%--글꼴 --%>
	
	<%-- script --%>	
	<script type="text/javascript" src="${ctxPath}/resources/utils/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="${ctxPath}/resources/utils/jquery.alerts.js"></script>			<%-- jAlert --%>		
	<script type="text/javascript" src="${ctxPath}/resources/js/web/brd/qna/qna.js"></script>			<%-- QnA 게시판 --%>
	<script type="text/javascript" src="${ctxPath}/resources/js/web/brd/ntce/ntce.js"></script>			<%-- 공지 게시판 --%>
	<script type="text/javascript" src="${ctxPath}/resources/js/admin/brd/qna/qna.js"></script>			<%-- QnA 게시판 --%>
	<script type="text/javascript" src="${ctxPath}/resources/js/admin/brd/ntce/ntce.js"></script>		<%-- 공지 게시판 --%>
	<script type="text/javascript" src="${ctxPath}/resources/js/web/header/header.js"></script>			<%--HEADER --%> 
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=e8e7bfba2d35b071dc22784476bb6130"></script>	<%--카카오 지도 --%>
	<script type="text/javascript" src="${ctxPath}/resources/js/web/main/carousel.js"></script>	<%-- main 케러셀 --%>
	<script type="text/javascript" src="${ctxPath}/resources/js/web/mng/mng.js"></script>	<%-- mngview 케러셀 --%>
	<script type="text/javascript" src="${ctxPath}/resources/js/web/mng/jquery.bxslider.js"></script>	<%-- mngview 케러셀 --%>
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