$(document).ready(function() {
		$('.dtl_carousel_list').bxSlider();
	});

	$(function() {
		var mng_Slider = $('.dtl_carousel_list').bxSlider({
			/* 슬라이드 타입 설정 */
			mode : 'horizontal',
			// option : 'horizontal', 'vertical', 'fade'

			/* 슬라이드 타입 설정 */
			speed : 500,
			// option : 정수

			/* 슬라이드가 자동으로 전환됩니다. */
			auto : false,
			// option : true / false

			/* 로드시 자동 표시가 시작됩니다. false이면 "시작"컨트롤을 클릭하면 슬라이드 쇼가 시작됩니다. */
			autoStart : true,
			// option : true / false

			/* 마우스가 슬라이더 위로 움직이면 자동쇼가 멈춥니다. */
			autoHover : false,
			// option : true / false

			/* 슬라이드가 전환 시간 */
			pause : 4000,
			// option : 정수

			/* true이면 "다음"/ "이전"컨트롤이 추가됩니다. */
			controls : true,
			// option : true / false

			/* true 이면 하단 pager 버튼이 추가 됩니다. */
			pager : true,
			// option : true / false

			/* true 인 경우 마지막 슬라이에서 "다음"을 클릭하면 첫 번째 슬라이드로 전환 */
			infiniteLoop : true,
			// option : true / false

			/* true이면 마지막 슬라이드에서 다음버튼을 숨긴다. 첫번째 슬라이드 일 경우 동일 */
			hideControlOnEnd : false,
			// option : true / false

			/* 슬라이더 위로 마우스를 가져가면 슬러이더 일시 중지(css 전환을 사용하는 경우 기능이 작동하지 않음.) */
			tickerHover : false,
			// option : true / false

			slideWidth : 1000
			
		});
	})