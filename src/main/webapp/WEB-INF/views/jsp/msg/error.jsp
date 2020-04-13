<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<meta charset="UTF-8">

<%--
	
	Controller 에서 넘겨준 Error 메세지 출력 jsp 
	
 --%>
<script type="text/javascript">	
	alert("${msg}");
	location.href="${loc}";
	// 메세지 출력 이후 location 이동
</script>