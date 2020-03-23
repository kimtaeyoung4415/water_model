<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<link href="<c:url value="/resources/css/pcabout.css" />" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Sunflower:300,500,700&display=swap&subset=korean" rel="stylesheet">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=e8e7bfba2d35b071dc22784476bb6130"></script>
<style>
	body{
		font-family: 'Sunflower', sans-serif;
	}
</style>
<body>
<section id="about_company">
	<div class = "container-fulid">
		<div class="row">
			<div class ="img-side img-left about-fluid">
				<img src="http://placehold.it/370x390"  width="370" height="390">
			</div>
			<!-- 내용에 따라 css 수정해야함 -->
			<div id="text-box">
					<p>
					우리 Water Ent는 어쩌구 저쩌구 쏼라쏼라 불라불라 알라솰라 발라 빌라
					</p>
			</div>
		</div>
	</div>
</section>
<section id="about_ceo">
	<div class="container">
		<div class="row">
			<div id="photo">
				<img src="http://placehold.it/280x390"  width="280" height="390">
			</div>
			<!-- 내용에 따라 css 수정해야함 -->
			<div id="content">
				<p>내용<p>
			</div>
		</div>
	</div>
</section>
<section id="about_map">
	<div class ="container">
		<div id="map" style="width: 400px;height: 250px; float:left;">
		</div>
		<!-- 내용에 따라 css 수정해야함 -->
		<div id="map-content">
			<h5>주소</h5>
			<p>서울시 송파구 풍납동 바람드리길 60 2층</p>
			<h5>대중교통</h5>
			<p>5호선 천호역 9번출구에서 170미터 직진 파리바게뜨 있는 골목 안쪽의 GS25 편의점 2층</p>
			<h5>연락처</h5>
			<p>TEL : 02-2138-1885</p>
			<p>E-Mail : dica0000@naver.com</p>
		</div>
	</div>
</section>
<script>
var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
mapOption = { 
    center: new kakao.maps.LatLng(37.536812, 127.122188), // 지도의 중심좌표
    level: 3 // 지도의 확대 레벨
};

var map = new kakao.maps.Map(mapContainer, mapOption);

//마커가 표시될 위치입니다 
var markerPosition  = new kakao.maps.LatLng(37.536812, 127.122188); 

//마커를 생성합니다
var marker = new kakao.maps.Marker({
position: markerPosition
});

//마커가 지도 위에 표시되도록 설정합니다
marker.setMap(map);

</script>
</body>
</html>
