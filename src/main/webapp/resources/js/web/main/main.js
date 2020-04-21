$(document).ready(function() {

	var i = 0;
	var m = 0;

	// viewBox 광고

	var img = $('.imgBox li');
	var imgBox = $('.imgBox');

	imgBox.bxSlider({ // 클래스명 주의!

		auto : true, // 자동으로 애니메이션 시작

		speed : 500, // 애니메이션 속도

		pause : 5000, // 애니메이션 유지 시간 (1000은 1초)

		mode : 'horizontal', // 슬라이드 모드 ('fade', 'horizontal', 'vertical' 이
		// 있음)

		pager : true, // 페이지 표시 보여짐

	});


	// news

	var prev = $("#button-prev");
	var next = $("#button-next");
	
	//	news (prev button)
	
	prev.click(function(e) {
		i--;
		if (i == 1) {
			$('.wrapper').animate({
				marginLeft : '-1220px'
			}, 1000);

		} else if (i == 0) {
			$('.wrapper').animate({
				marginLeft : '0'
			}, 1000);
		} else if (i < 0) {
			i = 0
		}
		
	});
	
	
	//	news (next button)
	
	next.click(function(e) {
		i++;
		if (i == 1) {
			$('.wrapper').animate({
				marginLeft : '-1220px'
			}, 1000);

		} else if (i == 2) {
			$('.wrapper').animate({
				marginLeft : '-2440px'
			}, 1000);
		} else if (2 < i) {
			i = 2
		}
		
	});
	
	
	// media

	var prevM = $("#button-prev_M");
	var nextM = $("#button-next_M");

	prevM.click(function(e) {
		m--;
		if (m < 0) {
			m = 0
		}
	});

	nextM.click(function(e) {
		m++;
		if (2 < m) {
			m = 2
		}
	});


	$(".media>div").click(function(){

		if (m == 0) {
			$(".slideM").removeClass("activeM").css('display','none');
			$(".slideM").eq(0).addClass("activeM").css('display','block');
		}

		if (m == 1) {
			$(".slideM").removeClass("activeM").css('display','none');
			$(".slideM").eq(1).addClass("activeM").css('display','block');
		}

		if (m == 2) {
			$(".slideM").removeClass("activeM").css('display','none');
			$(".slideM").eq(2).addClass("activeM").css('display','block');
		}
	});
	

});