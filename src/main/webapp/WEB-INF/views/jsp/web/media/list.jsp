<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<section class="list_container">
	<div class="list_magazine">
		<div class="mgz_row">
			<div class="list_title">
				<h2>MAGAZINE</h2>
				<hr class="list_hr">
			</div>
			<div class="mgz_btn">
				<div class="mgz_btnBox">
					<input type="button" value="한국어"> 
					<input type="button" value="English">
				</div>
			</div>
			<br>
			<div class="mgz_cardBox">
				<div class="mgz_card">
				<c:forEach var="card_list" items="list" begin="" end="3">
					<div class="mgz_img">
						<a href="/media/dtl.do"><img src="${ctxPath}/resources/img/magazine/프로필21.PNG"></a>
					</div>
					<div class="mgz_content">
						<div class="mgz_name"><a href="/media/dtl.do">정윤지</a></div>
						<div class="meta">
							<a href="/media/dtl.do">Actor</a>
						</div>
						<div class="description">
							<a href="/media/dtl.do">Matthew is an interior designer
							living in New York.</a>
						</div>
					</div>
					<div class="extra">
						<span class="right floated"> Joined in 2013 </span> <span>
							<i class="user icon"></i> 75 Friends
						</span>
					</div>
				</c:forEach>
				</div>
				<div class="mgz_card">
					<div class="mgz_img">
						<img src="${ctxPath}/resources/img/magazine/프로필21.PNG">
					</div>
					<div class="mgz_content">
						<div class="mgz_name">정윤지</div>
						<div class="meta">
							<span class="date">Actor</span>
						</div>
						<div class="description">Molly is a personal assistant
							living in Paris.</div>
					</div>
					<div class="extra">
						<span class="right floated"> Joined in 2011 </span> <span>
							<i class="user icon"></i> 35 Friends
						</span>
					</div>
				</div>

				<div class="mgz_card">
					<div class="mgz_img">
						<img src="${ctxPath}/resources/img/magazine/프로필23.PNG">
					</div>
					<div class="mgz_content">
						<div class="mgz_name">정윤지</div>
						<div class="meta">
							<a>Actor</a>
						</div>
						<div class="description">Elyse is a copywriter working in
							New York.</div>
					</div>
					<div class="extra">
						<span class="right floated"> Joined in 2014 </span> <span>
							<i class="user icon"></i> 151 Friends
						</span>
					</div>
				</div>
				<div class="mgz_card">
					<div class="mgz_img">
						<img src="${ctxPath}/resources/img/magazine/프로필24.PNG">
					</div>
					<div class="mgz_content">
						<div class="mgz_name">정윤지</div>
						<div class="meta">
							<a>Actor</a>
						</div>
						<div class="description">Matthew is an interior designer
							living in New York.</div>
					</div>
					<div class="extra">
						<span class="right floated"> Joined in 2013 </span> <span>
							<i class="user icon"></i> 75 Friends
						</span>
					</div>
				</div>
				<div class="mgz_card">
					<div class="mgz_img">
						<img src="${ctxPath}/resources/img/magazine/프로필11.PNG">
					</div>
					<div class="mgz_content">
						<div class="mgz_name">Molly</div>
						<div class="meta">
							<span class="date">Coworker</span>
						</div>
						<div class="description">Molly is a personal assistant
							living in Paris.</div>
					</div>
					<div class="extra">
						<span class="right floated"> Joined in 2011 </span> <span>
							<i class="user icon"></i> 35 Friends
						</span>
					</div>
				</div>
				<div class="mgz_card">
					<div class="mgz_img">
						<img src="${ctxPath}/resources/img/magazine/프로필12.PNG">
					</div>
					<div class="mgz_content">
						<div class="mgz_name">Elyse</div>
						<div class="meta">
							<a>Coworker</a>
						</div>
						<div class="description">Elyse is a copywriter working in
							New York.</div>
					</div>
					<div class="extra">
						<span class="right floated"> Joined in 2014 </span> <span>
							<i class="user icon"></i> 151 Friends
						</span>
					</div>
				</div>
				<div class="mgz_card">
					<div class="mgz_img">
						<a href=""><img src="${ctxPath}/resources/img/magazine/프로필13.PNG"></a>
					</div>
					<div class="mgz_content">
						<div class="mgz_name">Matt Giampietro</div>
						<div class="meta">
							<a href="">Friends</a>
						</div>
						<div class="description">Matthew is an interior designer
							living in New York.</div>
					</div>
					<div class="extra">
						<span class="right floated"> Joined in 2013 </span> <span>
							<i class="user icon"></i> 75 Friends
						</span>
					</div>
				</div>
				<div class="mgz_card">
					<div class="mgz_img">
						<img src="${ctxPath}/resources/img/magazine/프로필22.PNG">
					</div>
					<div class="mgz_content">
						<div class="mgz_name">Molly</div>
						<div class="meta">
							<span class="date">Coworker</span>
						</div>
						<div class="description">Molly is a personal assistant
							living in Paris.</div>
					</div>
					<div class="extra">
						<span class="right floated"> Joined in 2011 </span> <span>
							<i class="user icon"></i> 35 Friends
						</span>
					</div>
				</div>
				<div class="mgz_card">
					<div class="mgz_img">
						<img src="${ctxPath}/resources/img/magazine/프로필14.PNG">
					</div>
					<div class="mgz_content">
						<div class="mgz_name">Elyse</div>
						<div class="meta">
							<a>Coworker</a>
						</div>
						<div class="description">Elyse is a copywriter working in
							New York.</div>
					</div>
					<div class="extra">
						<span class="right floated"> Joined in 2014 </span> <span>
							<i class="user icon"></i> 151 Friends
						</span>
					</div>
				</div>
				<div class="mgz_card">
					<div class="mgz_img">
						<img src="${ctxPath}/resources/img/magazine/프로필6.PNG">
					</div>
					<div class="mgz_content">
						<div class="mgz_name">Matt Giampietro</div>
						<div class="meta">
							<a>Friends</a>
						</div>
						<div class="description">Matthew is an interior designer
							living in New York.</div>
					</div>
					<div class="extra">
						<span class="right floated"> Joined in 2013 </span> <span>
							<i class="user icon"></i> 75 Friends
						</span>
					</div>
				</div>
				<div class="mgz_card">
					<div class="mgz_img">
						<img src="${ctxPath}/resources/img/magazine/프로필7.PNG">
					</div>
					<div class="mgz_content">
						<div class="mgz_name">Molly</div>
						<div class="meta">
							<span class="date">Coworker</span>
						</div>
						<div class="description">Molly is a personal assistant
							living in Paris.</div>
					</div>
					<div class="extra">
						<span class="right floated"> Joined in 2011 </span> <span>
							<i class="user icon"></i> 35 Friends
						</span>
					</div>
				</div>
				<div class="mgz_card">
					<div class="mgz_img">
						<img src="${ctxPath}/resources/img/magazine/프로필8.PNG">
					</div>
					<div class="mgz_content">
						<div class="mgz_name">Elyse</div>
						<div class="meta">
							<a>Coworker</a>
						</div>
						<div class="description">Elyse is a copywriter working in
							New York.</div>
					</div>
					<div class="extra">
						<span class="right floated"> Joined in 2014 </span> <span>
							<i class="user icon"></i> 151 Friends
						</span>
					</div>
				</div>
			</div>
			<br /> <br /> <br /> <br />
			<nav class="list_pageing list_pageingM">
				<div class="list_pagination">
					<a href="#">&laquo;</a> <a href="#">1</a> <a href="#">2</a> <a
						href="#" class="active">3</a> <a href="#">4</a> <a href="#">5</a>
					<a href="#">&raquo;</a>
				</div>

			</nav>
			<br />
		</div>
	</div>
=======
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<section class="list_container">
	<div class="list_magazine">
		<div class="mgz_row">
			<div class="list_title">
				<h2>MAGAZINE</h2>
				<hr class="list_hr">
			</div>
			<div class="mgz_btn">
				<div class="mgz_btnBox">
					<input type="button" value="한국어"> 
					<input type="button" value="English">
				</div>
			</div>
			<br>
			<div class="mgz_cardBox">
				<div class="mgz_card">
				<c:forEach var="card_list" items="list" begin="index" end="3">
					<div class="mgz_img">
						<a href="/media/dtl.do"><img src="${card_list }"></a>
					</div>
					<div class="mgz_content">
						<div class="mgz_name"><a href="/media/dtl.do">정윤지</a></div>
						<div class="meta">
							<a href="/media/dtl.do">Actor</a>
						</div>
						<div class="description">
							<a href="/media/dtl.do">Matthew is an interior designer
							living in New York.</a>
						</div>
					</div>
					<div class="extra">
						<span class="right floated"> Joined in 2013 </span> <span>
							<i class="user icon"></i> 75 Friends
						</span>
					</div>
				</c:forEach>
				</div>
				<div class="mgz_card">
					<div class="mgz_img">
						<img src="${ctxPath}/resources/img/magazine/프로필21.PNG">
					</div>
					<div class="mgz_content">
						<div class="mgz_name">정윤지</div>
						<div class="meta">
							<span class="date">Actor</span>
						</div>
						<div class="description">Molly is a personal assistant
							living in Paris.</div>
					</div>
					<div class="extra">
						<span class="right floated"> Joined in 2011 </span> <span>
							<i class="user icon"></i> 35 Friends
						</span>
					</div>
				</div>

				<div class="mgz_card">
					<div class="mgz_img">
						<img src="${ctxPath}/resources/img/magazine/프로필23.PNG">
					</div>
					<div class="mgz_content">
						<div class="mgz_name">정윤지</div>
						<div class="meta">
							<a>Actor</a>
						</div>
						<div class="description">Elyse is a copywriter working in
							New York.</div>
					</div>
					<div class="extra">
						<span class="right floated"> Joined in 2014 </span> <span>
							<i class="user icon"></i> 151 Friends
						</span>
					</div>
				</div>
				<div class="mgz_card">
					<div class="mgz_img">
						<img src="${ctxPath}/resources/img/magazine/프로필24.PNG">
					</div>
					<div class="mgz_content">
						<div class="mgz_name">정윤지</div>
						<div class="meta">
							<a>Actor</a>
						</div>
						<div class="description">Matthew is an interior designer
							living in New York.</div>
					</div>
					<div class="extra">
						<span class="right floated"> Joined in 2013 </span> <span>
							<i class="user icon"></i> 75 Friends
						</span>
					</div>
				</div>
				<div class="mgz_card">
					<div class="mgz_img">
						<img src="${ctxPath}/resources/img/magazine/프로필11.PNG">
					</div>
					<div class="mgz_content">
						<div class="mgz_name">Molly</div>
						<div class="meta">
							<span class="date">Coworker</span>
						</div>
						<div class="description">Molly is a personal assistant
							living in Paris.</div>
					</div>
					<div class="extra">
						<span class="right floated"> Joined in 2011 </span> <span>
							<i class="user icon"></i> 35 Friends
						</span>
					</div>
				</div>
				<div class="mgz_card">
					<div class="mgz_img">
						<img src="${ctxPath}/resources/img/magazine/프로필12.PNG">
					</div>
					<div class="mgz_content">
						<div class="mgz_name">Elyse</div>
						<div class="meta">
							<a>Coworker</a>
						</div>
						<div class="description">Elyse is a copywriter working in
							New York.</div>
					</div>
					<div class="extra">
						<span class="right floated"> Joined in 2014 </span> <span>
							<i class="user icon"></i> 151 Friends
						</span>
					</div>
				</div>
				<div class="mgz_card">
					<div class="mgz_img">
						<a href=""><img src="${ctxPath}/resources/img/magazine/프로필13.PNG"></a>
					</div>
					<div class="mgz_content">
						<div class="mgz_name">Matt Giampietro</div>
						<div class="meta">
							<a href="">Friends</a>
						</div>
						<div class="description">Matthew is an interior designer
							living in New York.</div>
					</div>
					<div class="extra">
						<span class="right floated"> Joined in 2013 </span> <span>
							<i class="user icon"></i> 75 Friends
						</span>
					</div>
				</div>
				<div class="mgz_card">
					<div class="mgz_img">
						<img src="${ctxPath}/resources/img/magazine/프로필22.PNG">
					</div>
					<div class="mgz_content">
						<div class="mgz_name">Molly</div>
						<div class="meta">
							<span class="date">Coworker</span>
						</div>
						<div class="description">Molly is a personal assistant
							living in Paris.</div>
					</div>
					<div class="extra">
						<span class="right floated"> Joined in 2011 </span> <span>
							<i class="user icon"></i> 35 Friends
						</span>
					</div>
				</div>
				<div class="mgz_card">
					<div class="mgz_img">
						<img src="${ctxPath}/resources/img/magazine/프로필14.PNG">
					</div>
					<div class="mgz_content">
						<div class="mgz_name">Elyse</div>
						<div class="meta">
							<a>Coworker</a>
						</div>
						<div class="description">Elyse is a copywriter working in
							New York.</div>
					</div>
					<div class="extra">
						<span class="right floated"> Joined in 2014 </span> <span>
							<i class="user icon"></i> 151 Friends
						</span>
					</div>
				</div>
				<div class="mgz_card">
					<div class="mgz_img">
						<img src="${ctxPath}/resources/img/magazine/프로필6.PNG">
					</div>
					<div class="mgz_content">
						<div class="mgz_name">Matt Giampietro</div>
						<div class="meta">
							<a>Friends</a>
						</div>
						<div class="description">Matthew is an interior designer
							living in New York.</div>
					</div>
					<div class="extra">
						<span class="right floated"> Joined in 2013 </span> <span>
							<i class="user icon"></i> 75 Friends
						</span>
					</div>
				</div>
				<div class="mgz_card">
					<div class="mgz_img">
						<img src="${ctxPath}/resources/img/magazine/프로필7.PNG">
					</div>
					<div class="mgz_content">
						<div class="mgz_name">Molly</div>
						<div class="meta">
							<span class="date">Coworker</span>
						</div>
						<div class="description">Molly is a personal assistant
							living in Paris.</div>
					</div>
					<div class="extra">
						<span class="right floated"> Joined in 2011 </span> <span>
							<i class="user icon"></i> 35 Friends
						</span>
					</div>
				</div>
				<div class="mgz_card">
					<div class="mgz_img">
						<img src="${ctxPath}/resources/img/magazine/프로필8.PNG">
					</div>
					<div class="mgz_content">
						<div class="mgz_name">Elyse</div>
						<div class="meta">
							<a>Coworker</a>
						</div>
						<div class="description">Elyse is a copywriter working in
							New York.</div>
					</div>
					<div class="extra">
						<span class="right floated"> Joined in 2014 </span> <span>
							<i class="user icon"></i> 151 Friends
						</span>
					</div>
				</div>
			</div>
			<br /> <br /> <br /> <br />
			<nav class="list_pageing list_pageingM">
				<div class="list_pagination">
					<a href="#">&laquo;</a> <a href="#">1</a> <a href="#">2</a> <a
						href="#" class="active">3</a> <a href="#">4</a> <a href="#">5</a>
					<a href="#">&raquo;</a>
				</div>

			</nav>
			<br />
		</div>
	</div>
>>>>>>> branch 'master' of https://github.com/kimtaeyoung4415/water_model.git
</section>