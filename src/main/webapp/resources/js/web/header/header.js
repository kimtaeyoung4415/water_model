$(function (){
	var $menu = $('nav > ul > li');
	//var	$header = $('#test_id');
	
	$menu.mouseover(function(){
		$('#test_id').animate({height:'300px'},300);
	})
	.mouseout(function(){
		$('#test_id').animate({height:'79px'},300);
	})
})