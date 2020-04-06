$(function (){
//헤더 div 크가 변환 이벤트
	var $menu = $('nav'),
		$header = $('#test_id');
	
	$menu.mouseover(function(){
		$header.stop().animate({height:'300px'},300);
	})
	$menu.mouseout(function(){
		$header.stop().animate({height:'100px'},300);
	})

//header page move 이벤트
	//회사소개
	$("#w-about").click(function(){			
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
	
	//미디어
	$("#w-media-magazine").click(function(){			
		javascript:location.href="/media/magazine.do";				
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
		javascript:location.href="/recruitment/model_rt.do";				
	})
})