<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- non tiles --%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"  %>  
<head>
	<meta charset="UTF-8">
	
	<%-- 반응형웹  --%>
	<meta name="viewport" content="width=device-width, initial-scale=1"> 
	
	<%-- css --%>
	<link rel="stylesheet" href="${ctxPath}/resources/css/utils/jquery.alerts.css" media="all" type="text/css" />	<%-- jAlert --%>
	<link rel="stylesheet" href="${ctxPath}/resources/css/extra.css" media="all" type="text/css" />
	
	<%-- script --%>
	<%-- script --%>	
	<script type="text/javascript" src="${ctxPath}/resources/utils/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="${ctxPath}/resources/utils/jquery.alerts.js"></script>	
	<script type="text/javascript" src="${ctxPath}/resources/js/admin/login/login.js"></script>				<%-- qust.js --%>
	
</head>      
<tiles:insertAttribute name="content" />



