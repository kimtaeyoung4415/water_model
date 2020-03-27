<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>EXAMPLE</title>
<script type="text/javascript">

$(document).ready(function(){
	getUserList();
});

function getUserList(){
	$.ajax({
		url:"/getUserList.do",
		success:function(result){
			console.log(result)
		},
		error: function(request, status, error){
            alert("code: "+request.status+"\n"+"message: "+request.responseText+"\n"+"error: "+error);
        }
	});
}

</script>
</head>
<body>
	<h3>임시 JSP 파일입니다.</h3>
</body>
</html>