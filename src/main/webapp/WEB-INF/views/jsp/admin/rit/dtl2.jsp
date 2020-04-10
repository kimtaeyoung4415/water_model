<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<section class="container">
	<div class="nav">
	<ul>
		<li><a href="/ntce/list.do">NOTICE</a></li>
		<li>.</li>
		<li><a href="/qna/list.do">QA</a></li>
		<li>.</li>
		<li><a href="/rit/list.do">MODEL REG</a></li>
	</ul>
	</div>
	<form id="r_button" name="r_button">
	<div class="container" align="center">
		<div class="sub-container">
			<div class="application_modal">
				<h3>채용등록</h3>
				<div class="input_wrapper">
					<label for="">구분</label>
					<select>
						<option>구분</option>
					</select>
				</div>
				<div class="input_wrapper">
					<label for="Q_NAME">이름</label>
					<input type="text" id="Q_NAME" name="Q_NAME" placeholder="홍길동" required="required">
				</div>
				<div class="input_wrapper">
					<label for="E_NAME">영문 이름</label>
					<input type="text" id="E_NAME" name="E_NAME" placeholder="영어이름" required="required">
				</div>
				<div class="input_wrapper">
					<label for="E_NAME">영문 성</label>
					<input type="text" id="E_NAME" name="E_NAME" placeholder="영어_성" required="required">
				</div>
				<div class="input_wrapper">
						<label for="YEAR_OF_BIRTH_YEAR">출생년도</label> <input type="text" id="YEAR_OF_BIRTH_YEAR" name="YEAR_OF_BIRTH_YEAR" placeholder="1991" required="required">
				</div>
				<div class="input_wrapper">
					<label for="Area">지역</label>
					<input type="text" id="AREA" name="AREA" placeholder="서울" required="required">
				</div>
				<div class="input_wrapper">
					<label for="GENDER">성별</label>
					<input type="checkbox" id="MAN" name="MAN" value="남자">남자
					<input type="checkbox" id="GIRL" name="GIRL" value="여자">여자
				</div>
				<div class="input_wrapper">
					<label for="KEY">키</label>
					<input type="text" id="KEY" name="KEY" placeholder="cm" required="required">
				</div>
				<div class="input_wrapper">
					<label for="WEIGHT">몸무게</label>
					<input type="text" id="WEIGHT" name="WEIGHT" placeholder="kg" required="required">
				</div>
				<div class="input_wrapper">
					<label for="FOOTSIZE">발 사이즈</label>
					<input type="text" id="FOOTSIZE" name="FOOTSIZE" placeholder="cm" required="required">
				</div>
				<div class="input_wrapper">
					<label for="BOODYSIZE">신체 사이즈</label>
					<input type="text" id="BOODYSIZE" name="BOODYSIZE" placeholder="cm" required="required">
				</div>
				<div class="input_wrapper">
					<label for="INSTAGRAM">인스타</label>
					<input type="text" id="INSTAGRAM" name="INSTAGRAM" placeholder="id" required="required">
				</div>
				<div class="input_wrapper">
					<label for="FACEBOOK">페이스북</label>
					<input type="text" id="FACEBOOK" name="FACEBOOK" placeholder="id" required="required">
				</div>
				<div class="input_wrapper">
					<label for="SHOW">쇼</label>
					<input type="text" id="SHOW" name="SHOW" required="required">
				</div>
				<div class="input_wrapper">
					<label for="MAGAZINE">메거진</label>
					<input type="text" id="MAGAZINE" name="MAGAZINE" placeholder="비밀번호" required="required">
				</div>
				<div class="input_wrapper">
					<label for="AN AWARD-WINNING CAREER">수상경력</label>
					<input type="text" id="AN AWARD-WINNING CAREER" name="AN AWARD-WINNING CAREER" placeholder="비밀번호" required="required">
				</div>
				<div class="input_wrapper">
					<label for="PROFILE">프로필</label>
					<input type="file" id="PROFILE" name="PROFILE">
					<div class="imgfile">
						<img id="LoadImg">
					</div>
				</div>
				<div class="input_wrapper">				
					<label for="PHOTO">사진</label>
					<input type="file" id="PHOTO" name="PHOTO" multiple/>
					<div class="imgfile">
						<img id="LoadImg">
					</div>
				</div>
			</div>
		</div>
		<div class="btn_form">
			<input type="button" id="btn_w_qna" class="btn" value="수정하기">
		</div>
	</div>
	<br>
</form>
</section>