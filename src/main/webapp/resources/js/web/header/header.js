$(function (){
	// Header nav slider
	var gnb = $('.gnb').find('li');
	
	gnb.mouseover(function() {
		$('.gnb_slider').stop().slideDown()
		$('header').css('border','none')
	});

	$('header').mouseleave(function() {
		$('.gnb_slider').stop().slideUp(function(){
			$('header').css('border-bottom','2px solid #72c1fe')
		});
	});

//header page move 이벤트
	//회사소개
	$("#w-about").click(function(){			
		javascript:location.href="/about/company.do";				
	})
	
	//관리자 회사 소개
	$("#a-about").click(function(){			
		javascript:location.href="/about/company.do";				
	})
	
	//모델 매니지 먼트
	$("#w-mng-women").click(function(){			
		javascript:location.href="/mng/women/list.do";				
	})
	$("#w-mng-men").click(function(){			
		javascript:location.href="/mng/men/list.do";				
	})
	$("#w-mng-development").click(function(){			
		javascript:location.href="/mng/devel/list.do";				
	})
	$("#w-mng-actors").click(function(){			
		javascript:location.href="/mng/actors/list.do";				
	})
	
	//관리자 모델 매니지먼트
	$("#a-mng-women").click(function(){			
		javascript:location.href="/admin/mng/list.do";				
	})
	$("#a-mng-men").click(function(){			
		javascript:location.href="/admin/mng/list.do";				
	})
	$("#a-mng-development").click(function(){			
		javascript:location.href="/admin/mng/list.do";				
	})
	$("#a-mng-actors").click(function(){			
		javascript:location.href="/admin/mng/list.do";				
	})
	
	//미디어
	$("#w-media-magazine").click(function(){			
		javascript:location.href="/media/list.do";				
	})
	
	//관리자 미디어
	$("#a-media-magazine").click(function(){			
		javascript:location.href="/admin/media/list.do";				
	})
	
	//qna
	$("#w-brd-qna").click(function(){			
		javascript:location.href="/qna/list.do";				
	})	
	$("#w-brd-notice").click(function(){			
		javascript:location.href="/ntce/list.do";				
	})	
	$("#w-nego").click(function(){			
		javascript:location.href="/nego/list.do";				
	})	
	$("#w-rec").click(function(){			
		javascript:location.href="/rit/list.do";				
	})
	
	//관리자 qna
	$("#a-brd-qna").click(function(){			
		javascript:location.href="/admin/qna/list.do";				
	})	
	$("#a-brd-notice").click(function(){			
		javascript:location.href="/admin/ntce/list.do";				
	})	
	$("#a-nego").click(function(){			
		javascript:location.href="/admin/nego/list.do";				
	})	
	$("#a-rec").click(function(){			
		javascript:location.href="/admin/rit/list.do";				
	})
})