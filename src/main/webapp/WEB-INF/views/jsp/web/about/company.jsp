<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

		<div id="about_company">
			<div id="about_logo_box">
				<img src="#"/>
			</div>
			<div id="ac_content">
			
			</div>
		</div>
		<div id="about_ceo">
			<div id ="ceo_photo">
				<img src="#"/>
			</div>
			<div id ="ceo_profile">
			
			</div>
		</div>
		<div id="about_map">
			<div id="map_box">
				<div id="map" style="width: 400px; height: 250px; float: left;">
				</div>
			</div>
			<div id="map_content">
			
			</div>
		</div>
	
<script>
	var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
	mapOption = {
		center : new kakao.maps.LatLng(37.536812, 127.122188), // 지도의 중심좌표
		level : 3
	// 지도의 확대 레벨
	};

	var map = new kakao.maps.Map(mapContainer, mapOption);

	//마커가 표시될 위치입니다 
	var markerPosition = new kakao.maps.LatLng(37.536812, 127.122188);

	//마커를 생성합니다
	var marker = new kakao.maps.Marker({
		position : markerPosition
	});

	//마커가 지도 위에 표시되도록 설정합니다
	marker.setMap(map);
</script>
