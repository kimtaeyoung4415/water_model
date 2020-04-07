<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style type="text/css">
/* body{ */
/*     margin: 0px; */
/* } */
#carousel_section{
	margin-top: 10px;
	margin-bottom: 10px;
    width: 100%;
    height: 580px;
}
#carousel_section > ul{
    margin: 0px;
    padding: 0px;
    width: 100%;
    height: 100%;
    position: relative;
    overflow: hidden;
}
#carousel_section > ul > li{
    list-style: none;
    width: 100%;
    height: 100%;
    position: absolute;
}
#carousel_section > ul > li >img{
    list-style: none;
    width: 350px;
    height: 580px;
    overflow: hidden;
    object-fit: cover;
}

</style>
<script type="text/javascript">
var time; // 슬라이드 넘어가는 시간
var $carouselLi;
var carouselCount; // 캐러셀 사진 갯수
var currentIndex; // 현재 보여지는 슬라이드 인덱스 값
var caInterval;
 
//사진 연결
var imgW; // 사진 한장의 너비    
$(document).ready(function(){
 
    carouselInit(580, 10000);
});
 
$(window).resize(function(){
    carousel_setImgPosition();
});
 
/* 초기 설정 */
function carouselInit( height, t ){
    /*
     * height : 캐러셀 높이
     * t : 사진 전환 간격 
    */
 
    time = t;
    $("#carousel_section").height(height); // 캐너셀 높이 설정
    $carouselLi = $("#carousel_section > ul >li");
    carouselCount = $carouselLi.length; // 캐러셀 사진 갯수
    currentIndex = 0; // 현재 보여지는 슬라이드 인덱스 값
    carousel_setImgPosition();
    carousel();
}
 
function carousel_setImgPosition(){
 
    imgW = $carouselLi.width(); // 사진 한장의 너비    
    // 이미지 위치 조정
    for(var i = 0; i < carouselCount; i++)
    {
        if( i == currentIndex)
        {
            $carouselLi.eq(i).css("left", 0);
        }
        else
        {
            $carouselLi.eq(i).css("left", imgW);
        }
    }
}
 
function carousel(){
 
    // 사진 넘기기
    // 사진 하나가 넘어간 후 다시 꼬리에 붙어야함
    // 화면에 보이는 슬라이드만 보이기
    caInterval = setInterval(function(){
        var left = "-" + imgW;
 
        //현재 슬라이드를 왼쪽으로 이동 ( 마이너스 지점 )
        $carouselLi.eq(currentIndex).animate( { left: left }, function(){
            // 다시 오른쪽 (제자리)로 이동
            $carouselLi.eq(currentIndex).css("left", imgW);
 
            if( currentIndex == ( carouselCount - 1 ) )
            {
                currentIndex = 0;
            }
            else
            {
                currentIndex ++;
            }
        } );
 
        // 다음 슬라이드 화면으로
        if( currentIndex == ( carouselCount - 1 ) )
        {
            // 마지막 슬라이드가 넘어갈땐 처음 슬라이드가 보이도록
            $carouselLi.eq(0).animate( { left: 0 } );
        }
        else
        {
            $carouselLi.eq(currentIndex + 1).animate( { left: 0 } );
        }
    }, time);
}

</script>
    <div class="model_kategorie_box">
<table class="model_kategorie">
	<tr>
		<th><a href="/mng/women/list.do">Women</a></th>
		<th><a href="/mng/men/list.do">Men</a></th>
		<th><a href="/mng/devel/list.do">Development</a></th>
		<th><a href="/mng/actors/list.do">Actors</a></th>
	</tr>
</table>
</div>
<div class="profile_view">
	<div class="profile_nav">
		<a href="" class="prev"><</a>
		<div class="profile_thumb">
			<img width="120" height="120" src="${ctxPath}/resources/img/mng/프로필49.PNG" />
		</div>
		<a href="" class="next">></a>
		<div class="profile_info">	
			<h5>NAME | 이름</h5>
			<ul>
				<li><span>Height</span></li>
				<li><span>Size</span></li>
				<li><span>Shoes</span></li>
				<li><span>Birth</span></li>
			</ul>
		</div>
		<div id="carousel_section">
        <ul>
            <li> <img src="${ctxPath}/resources/img/mng/프로필50.PNG"> </li>
            <li> <img src="${ctxPath}/resources/img/mng/프로필43.PNG"> </li>
            <li> <img src="${ctxPath}/resources/img/mng/프로필47.PNG"> </li>
            <li> <img src="${ctxPath}/resources/img/mng/프로필50.PNG"> </li>
        </ul>
    </div>
	</div>
</div> 
