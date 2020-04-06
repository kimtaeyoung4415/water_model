<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style type="text/css">
.btn{
    position: absolute;
    color: #C32a92;
    font-size: 60px;
    z-index: 2;
}
.btn2{
    position: absolute;
    z-index: 2;
}
.bottom1,
.bottom2{position: relative;}
.btn-left{
    width: 30px;
    position: relative;
    cursor: pointer;
    left: 10px;
    top: 200px;
}
.btn-right{
    width: 30px;
    position: relative;
    cursor: pointer;
    left: 390px;
    top: 200px;
}
.wrap{position: relative;}
.carousel-box{
    z-index: 0;
    opacity: 0;
    transition: all .5s ease-in-out;
    transform: scale(0.95);
    position:  absolute;
}
.main{
    display: block;
    width: 100%;
}   
.contents-box{
    display: block;
    width: 490px;
    margin: 30px auto 0 auto;
}
.contents-img{
    width: 450px;
}
.btn{
    width: 4550px;
    font-size: 2em;
}
.active{
    opacity: 1;
    z-index: 1;
    transform: none;
    border: 10px solid rgba(127,47,214,.2);
}
.bottom1{
    width: 60px;
    cursor: pointer;
    top: 25px;
    left: 380px;
}
.bottom2{
    width: 60px;
    cursor: pointer;
    top: 320px;
    left: -45px;
}
.generic-wrap{
    position: absolute;
    width: 350px;
    text-align: center;
    z-index: 999;
}
.generic{
    position: relative;
    margin: 0 auto;
    top:350px;
}
.box{
    display: inline-block;
    margin: 0 1px;
    width: 5px;
    height: 5px;
    border: 1px solid white;
    border-radius: 100%;
}
.now{background: white;}
@media(min-width: 576px){
    .main{
        display: block;
        width: 100%;
    }   
    .contents-box{
        display: block;
        width: 576px;
        margin: 30px auto 0 auto;
    }
    .generic-wrap{width: 350px;}
    .generic{top:405px;}
    .box{
        width: 7px;
        height: 7px;
    }
    .contents-img{
        width: 520px;
    }
    .btn{
        width: 580px;
        font-size: 2em;
    }
    .btn-left{
        width: 35px;
        left: 10px;
        top: 220px;
    }
    .btn-right{
        width: 35px;
        left: 450px;
        top: 220px;
    }
    .active{
        opacity: 1;
        z-index: 1;
        transform: none;
        border: 10px solid rgba(127,47,214,.2);
    }
    .bottom1{
        width: 70px;
        cursor: pointer;
        top: 30px;
        left: 430px;
    }
    .bottom2{
        width: 70px;
        cursor: pointer;
        top: 360px;
        left: -50px;
    }
}
@media(min-width: 768px){
    .main{
        display: block;
        width: 100%;
    }   
    .contents-box{
        display: block;
        width: 768px;
        margin: 30px auto 0 auto;
    }
    .generic-wrap{width: 350px;}
    .generic{top:560px;}
    .box{
        width: 7px;
        height: 7px;
    }
    .contents-img{width: 720px;}
    .btn{
        width: 788px;
        font-size: 3em;
    }
    .btn-left{
        width: 40px;
        left: 10px;
        top: 290px;
    }
    .btn-right{
        width: 40px;
        left: 640px;
        top: 290px;
    }
    .active{
        opacity: 1;
        z-index: 1;
        transform: none;
        border: 10px solid rgba(127,47,214,.2);
    }
    .bottom1{
        width: 90px;
        cursor: pointer;
        top: 35px;
        left: 600px;
    }
    .bottom2{
        width: 90px;
        cursor: pointer;
        top: 490px;
        left: -65px;
    }
}
@media(min-width: 1024px){
    .main{
        display: block;
        width: 100%;
    }   
    .contents-box{
        display: block;
        width: 1024px;
        margin: 30px auto 0 auto;
    }
    .generic-wrap{width: 350px;}
    .generic{top:775px;}
    .box{
        width: 10px;
        height: 10px;
    }
    .contents-img{
        width: 980px;
    }
    .btn{
        width: 1050px;
        font-size: 4em;
    }
    .btn-left{
        width: 50px;
        left: 10px;
        top: 400px;
    }
    .btn-right{
        width: 50px;
        left: 870px;
        top: 400px;
    }
    .active{
        opacity: 1;
        z-index: 1;
        transform: none;
        border: 10px solid rgba(127,47,214,.2);
    }
    .bottom1{
        width: 130px;
        cursor: pointer;
        top: 45px;
        left: 830px;
    }
    .bottom2{
        width: 130px;
        cursor: pointer;
        top: 670px;
        left: -90px;
    }
}
@media(min-width: 350px){
    .main{
        display: block;
        width: 100%;
    }   
    .contents-box{
        display: block;
        width: 350;
        margin: 20px auto 0 auto;
    }
    .generic-wrap{width: 350px;}
    .generic{top:980px;}
    .box{
        width: 12px;
        height: 12px;
    }
    .contents-img{
        width: 350px;
        height: 580px;
    }
    .btn{
        width: 1280px;
        font-size: 4em;
    }
    .btn2{width: 1280px;}
    .btn-left{
        width: 55px;
        left: 15px;
        top: 530px;
    }
    .btn-right{
        width: 55px;
        left: 1120px;
        top: 530px;
    }
    .active{
        opacity: 1;
        z-index: 1;
        transform: none;
        border: 10px solid rgba(127,47,214,.2);
    }
    .bottom1{
        width: 150px;
        cursor: pointer;
        top: 55px;
        left: 1070px;
    }
    .bottom2{
        width: 150px;
        cursor: pointer;
        top: 850px;
        left: -100px;
    }
}
</style>
<script type="text/javascript">
window.onload = function () {
	var menuBtn1 = document.querySelector(".bottom1");
	var menuBtn2 = document.querySelector(".bottom2");

	menuBtn1.addEventListener('mouseover', startHover);
	menuBtn1.addEventListener('mouseout', endHover);
	function startHover(){
	    menuBtn1.src = 'assets/images/btn2.png';
	}
	function endHover(){
	    menuBtn1.src = 'assets/images/btn1.png';
	} 
	menuBtn2.addEventListener('mouseover', startHover2);
	menuBtn2.addEventListener('mouseout', endHover2);
	function startHover2(){
	    menuBtn2.src = 'assets/images/btn4.png';
	}
	function endHover2(){
	    menuBtn2.src = 'assets/images/btn3.png';
	}   
	var active = "active";
	var now = "now";
	var firstBtn = document.querySelector(".box:first-child");
	var firstBox = document.querySelector(".carousel-box:first-child");
	var lastBtn = document.querySelector(".box:last-child");
	var lastBox = document.querySelector(".carousel-box:last-child");
	var leftBtn = document.querySelector(".btn-left");
	var rightBtn = document.querySelector(".btn-right");

	var moveLeft = function(){
	    var current = document.querySelector(`.${active}`);
	    var currentBtn = document.querySelector(`.${now}`);
	    if(current){
	        current.classList.remove(active);
	        var prev = current.previousElementSibling;
	        if(prev){
	            prev.classList.add(active);
	        }else{
	            lastBox.classList.add(active);
	        }
	    }else{
	        firstBox.classList.add(active);
	    }
	    if(currentBtn){
	        currentBtn.classList.remove(now);
	        var prevBtn = currentBtn.previousElementSibling;
	        if(prevBtn){
	            prevBtn.classList.add(now);
	        }else{
	            lastBtn.classList.add(now);
	        }
	    }else{
	        firstBtn.classList.add(now);
	    }
	};
	var moveRight = function(){
	    var current = document.querySelector(`.${active}`);
	    var currentBtn = document.querySelector(`.${now}`);
	    if(current){
	        current.classList.remove(active);
	        var next = current.nextElementSibling;
	        if(next){
	            next.classList.add(active);
	        }else{
	            firstBox.classList.add(active);
	        }
	    }else{
	        firstBox.classList.add(active);
	    }
	    if(currentBtn){
	        currentBtn.classList.remove(now);
	        var nextBtn = currentBtn.nextElementSibling;
	        if(nextBtn){
	            nextBtn.classList.add(now);
	        }else{
	            firstBtn.classList.add(now);
	        }
	    }else{
	        firstBtn.classList.add(now);
	    }
	}

	leftBtn.addEventListener("click", moveLeft);
	rightBtn.addEventListener("click", moveRight);

	function init(){
	    firstBox.classList.add(active);
	}
	init();
	
	var firstslide = document.querySelector(".carousel_box:first-child");
	var firstgen = document.querySelector(".box:first-child");

	function slide() {
	    var currentslide = document.querySelector(`.${active}`);
	    if(currentslide) {
	        currentslide.classList.remove(active);
	        var nextslide = currentslide.nextElementSibling;
	        if(nextslide) {
	            nextslide.classList.add(active);
	        } else {
	            firstslide.classList.add(active);
	        }
	    } else {
	        firstslide.classList.add(active);
	    }
	}
	function slidebtn() {
	    var currentgen = document.querySelector(`.${now}`);
	    if(currentgen) {
	        currentgen.classList.remove(now);
	        var nextgen = currentgen.nextElementSibling;
	        if(nextgen) {
	            nextgen.classList.add(now);
	        } else {
	            firstgen.classList.add(now);
	        }
	    } else {
	        firstgen.classList.add(now);
	    }
	}
	setInterval(slide, 2000);
	setInterval(slidebtn, 2000);
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
	</div>
</div> 
<div class="main">
        <div class="contents-box">
            <div class="btn">
                <a><div class="btn-left"><</div></a>
                <a><div class="btn-right">></div></a>
            </div>
<!--             <div class="btn2"> -->
<!--                 <a href="https://www.imdb.com/title/tt4154796/"> -->
<!--                     <img class="bottom1" src="assets/images/btn1.png"></a> -->
<!--                 <a href="https://www.youtube.com/watch?v=TcMBFSGVi1c"> -->
<!--                     <img class="bottom2" src="assets/images/btn3.png"></a> -->
<!--             </div> -->
            <div class="wrap">
                <div class="carousel-box active">
                    <img class="contents-img" src="${ctxPath}/resources/img/mng/프로필50.PNG" alt="1">
                </div>
                <div class="carousel-box">
                    <img class="contents-img" src="${ctxPath}/resources/img/mng/프로필43.PNG" alt="1">
                </div>
                <div class="carousel-box">
                    <img class="contents-img" src="${ctxPath}/resources/img/mng/프로필40.PNG" alt="1">
                </div>
                <div class="carousel-box">
                    <img class="contents-img" src="${ctxPath}/resources/img/mng/프로필47.PNG" alt="1">
                </div>
                <div class="carousel-box">
                    <img class="contents-img" src="${ctxPath}/resources/img/mng/프로필48.PNG" alt="1">
                </div>
            </div>
            <div class="generic-wrap">
                <div class="generic">
                    <div class="box now"></div>
                    <div class="box"></div>
                    <div class="box"></div>
                    <div class="box"></div>
                    <div class="box"></div>
                </div>
            </div>
        </div>
    </div>