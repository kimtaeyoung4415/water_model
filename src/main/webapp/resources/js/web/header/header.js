$(function (){
	var $menu = $('nav'),
		$header = $('#test_id');
	
	$menu.mouseover(function(){
		$header.stop().animate({height:'300px'},300);
	})
	$menu.mouseout(function(){
		$header.stop().animate({height:'79px'},300);
	})
})