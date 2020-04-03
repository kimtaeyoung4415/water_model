<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>main</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"> 
<style> .carousel-inner > .carousel-item > img{  width: 540px; height: 500px;  } </style>



</head>
<body>
<section>
<div class="container"><h2>Carousel practice</h2>
<br>
<br>
</div> 
	<div id="demo" class="carousel slide" data-ride="carousel"> 
		<div class="carousel-inner"> <!-- 슬라이드 쇼 --> 
			<div class="carousel-item active"> <!--가로--> 
				<img class="d-block w-100" 
				src="http://placehold.it/234x300" 
				alt="First slide"> 
					<div class="carousel-caption d-none d-md-block"> 
						<h5>TEST</h5> 
						<p>testtesttest</p> 
					</div> 
			</div> 
			<div class="carousel-item"> 
				<img class="d-block w-100" 
				src="http://placehold.it/234x300" 
				alt="Second slide"> 
			</div> 
			<div class="carousel-item"> 
				<img class="d-block w-100" 
				src="http://placehold.it/234x300" 
				alt="Third slide"> 
			</div> <!-- / 슬라이드 쇼 끝 --> 
			<!-- 왼쪽 오른쪽 화살표 버튼 --> 
		<a class="carousel-control-prev" href="#demo" data-slide="prev"> 
			<span class="carousel-control-prev-icon" aria-hidden="true"></span> 
			<!-- <span>Previous</span> --> 
		</a> 
		<a class="carousel-control-next" href="#demo" data-slide="next"> 
			<span class="carousel-control-next-icon" aria-hidden="true"></span> 
			<!-- <span>Next</span> --> 
		</a> <!-- / 화살표 버튼 끝 --> 
		<!-- 인디케이터 --> 
		<ul class="carousel-indicators"> 
			<li data-target="#demo" data-slide-to="0" class="active"></li> <!--0번부터시작--> 
			<li data-target="#demo" data-slide-to="1"></li> 
			<li data-target="#demo" data-slide-to="2"></li> 
		</ul> <!-- 인디케이터 끝 --> 
		</div>
	</div>
</section>
<br>
<br>
<br>
<section>
	<div class="container">
		<h2 lang="en">MAGAZINE</h2>
	<div>	
	<br>
	<br>
	<div class="ui link cards">
		  <div class="card">
		    <div class="image">
		      <img src="http://placehold.it/234x300">
		    </div>
		    <div class="content">
		      <div class="header">Matt Giampietro</div>
		      <div class="meta">
		        <a>Friends</a>
		      </div>
		      <div class="description">
		        Matthew is an interior designer living in New York.
		      </div>
		    </div>
		    <div class="extra content">
		      <span class="right floated">
		        Joined in 2013
		      </span>
		      <span class="left floated">
      			<i class="heart outline like icon"></i>
     			 17 likes
   			  </span>
		    </div>
		  </div>
		  <div class="card">
		    <div class="image">
		      <img src="http://placehold.it/234x300">
		    </div>
		    <div class="content">
		      <div class="header">Molly</div>
		      <div class="meta">
		        <span class="date">Coworker</span>
		      </div>
		      <div class="description">
		        Molly is a personal assistant living in Paris.
		      </div>
		    </div>
		    <div class="extra content">
		      <span class="right floated">
		        Joined in 2011
		      </span>
		       <span class="left floated">
      			<i class="heart outline like icon"></i>
     			 17 likes
   			  </span>
		    </div>
		  </div>
		  <div class="card">
		    <div class="image">
		      <img src="http://placehold.it/234x300">
		    </div>
		    <div class="content">
		      <div class="header">Elyse</div>
		      <div class="meta">
		        <a>Coworker</a>
		      </div>
		      <div class="description">
		        Elyse is a copywriter working in New York.
		      </div>
		    </div>
		    <div class="extra content">
		      <span class="right floated">
		        Joined in 2014
		      </span>
		       <span class="left floated">
      			<i class="heart outline like icon"></i>
     			 17 likes
   			  </span>
		    </div>
		  </div>
		</div>
		</div>
		</section>
		<br>
		<br>
		<br>
<section>
	<div class="container">
		<h2 lang="en">SOCIAL MEDIA</h2>
	<div>
	<br>
	<div class="ui link cards">
		<div>
			<a href="https://google.com">
				<img class="ui medium image" src="http://placehold.it/234x300">
			</a>
		</div>
		<br>
		<br>
		<div>
			<a href="https://google.com">
				<img class="ui medium image" src="http://placehold.it/234x300">
			</a>
		</div>
		<br>
		<br>
		<div>
			<a href="https://google.com">
				<img class="ui medium image" src="http://placehold.it/234x300">
			</a>
		</div>
		<br>
		<br>
		<div>
			<a href="https://google.com">
				<img class="ui medium image" src="http://placehold.it/234x300">
			</a>
		</div>
		<br>
		<br>
		<div>
			<a href="https://google.com">
				<img class="ui medium image" src="http://placehold.it/234x300">
			</a>
		</div>
		<br>
		<br>
		<div>
			<a href="https://google.com">
				<img class="ui medium image" src="http://placehold.it/234x300">
			</a>
		</div>
		<div>
			<a href="https://google.com">
				<img class="ui medium image" src="http://placehold.it/234x300">
			</a>
		</div>
		<br>
		<br>
		<div>
			<a href="https://google.com">
				<img class="ui medium image" src="http://placehold.it/234x300">
			</a>
		</div>
		<br>
		<br>
		<div>
			<a href="https://google.com">
				<img class="ui medium image" src="http://placehold.it/234x300">
			</a>
		</div>
		<br>
		<br>
	</div>
</section>
<br>
<br>
<br>


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" 
integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" 
crossorigin="anonymous"></script> 
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" 
integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" 
crossorigin="anonymous"></script> 
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" 
integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" 
crossorigin="anonymous"></script> 
<script> $('.carousel').carousel({ interval: 2000 }) </script>

</body>
</html>














