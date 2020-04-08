<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


		<div id="about_company">
			<div id="about_logo_box">
				<img src="../resources/img/about/about.PNG"/>
			</div>
			<div id="ac_content">
				<div id="ac_content_box">
					<pre>
					
					
					
YG KPLUS
YG KPLUS는 설립 이래 수 많은 브랜드의 프로젝트를 성공적으로 수행하며 성장해 온 패션,
모델 분야의 선도 기업입니다. 패션쇼 기획 제작에서 미디어 컨텐츠 제작, 브랜드 PR&
마케팅, 연기자와 패션모델 매니지먼트, 모델 아카데미 등 각 분야에서 풍부한 경험과
노하우를 지닌 전문가들로 구성되어 유기적인 협업을 통해 시너지를 창출하고 있습니다.
우리는 YG KPLUS만의 교육 철학과 체계적인 시스템을 바탕으로 국내는 물론 글로벌 
인재를 양성하기 위해 중국, 태국 등 아카데미의 해외 진출을 준비하며 활동 영역을 
세계로 넓혀가고 있습니다. 또한 YG엔터테인먼트와의 긴밀한 협업을 통해 모델들의 
끼와 재능을파악해 패션 뷰티 라이프스타일 분야뿐만 아니라 연예계, 예술계 등다양한 
범위에서 정상의 자리에 오를 수 있도록 아낌없이 지원하고 있습니다
					 </pre>
				</div>
			</div>
		</div>
		<div id="about_ceo">
			<div id ="ceo_photo">
				<img src="../resources/img/magazine/프로필25.PNG" width="100%"  height="100%"/>
			</div>
			<div id ="ceo_profile">
			<pre>
㈜YG케이플러스 대표 고은경
				
현 (주)YG케이플러스 대표2014 ~
				
(주)케이플러스미디어 설립2008
				
서울종합예술전문학교 패션모델과 전임교수 역임2007
				
동덕여자대학교 스포츠모델학과 겸임교수 역임2001 ~ 2004
				
DCM 대표2000 ~ 2008
				
비데오 꼬 셀렉트 원장1999 ~ 2000
			</pre>
			</div>
		</div>
		
		<div id="about_map">
			<div id="map_box">
				<div id="map" style="width: 400px; height: 250px; float: left;">
				</div>
			</div>
			<div id="map_content">
				<pre>
				


				
주소
서울 강남구 도산대로 332 (우)06055

대표번호
02-547-0561

지하철역
압구정로데오역 분당 5번 출구 도보 8분
강남구청역 7 분당 3번 출구 도보 10분
학동역 7 10번 출구 도보 19분
압구정역 3 3번 출구 도보 20분
				</pre>
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
