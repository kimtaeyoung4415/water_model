<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container" align="center">
	<div class="sub-container">
		
		<div class="application_modal">
			
			<div class="input_wrapper">
				<label for="C_TITLE">패스워드</label>
				<input type="password" id="C_PWD" name="C_PWD"/>
				<input type="hidden" id="C_NUM" name="C_NUM" value="${dtl.C_NUM }"/>
			</div>
		</div>
		<div class="btn_form">
			<input type="button" id="btn_pwd_check" class="btn" value="확인" />
		</div>
		
	</div>		
</div>