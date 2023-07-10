<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
	<head>
		<title>GAMSO에 오신걸 환영합니다.</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="css/main.css" type="text/css"/>
	</head>
	<body class="homepage is-preload">
		<%@ include file="signMenu.jsp"%>
		<div id="page-wrapper">
			
			<!-- Header -->
				<section id="header">
					<!-- Logo -->
					<a href="/index"><img src="${path}/images/mainLogo.png" style="width: 100px; height: 110px;"></a>
					<!-- <h1><a href="index.jsp">GAMSO</a></h1> -->

					<!-- Nav -->
						<nav class="nav">
							<ul>
								<li class="current"><a href="/index">Home</a></li>
								<li><a href="/url/main">GoShorten</a></li>
							</ul>
						</nav>
					<!-- Banner
						<section id="banner">
							<header>
								<h2>NOTICE</h2>
								<p>공지사항 없음</p>
							</header>
						</section>
						<section id="banner">
							<header>
								<h2>EXAMPLE</h2>
								<p>음..</p>
							</header>
						</section> -->
					</section>
						<section id="main">
							<div class="container">
								<div class="row">
									<section>
										<header class="major">
											<h2>NOTICE & EXAMPLE</h2>
										</header>
										<div class="row">
											<div class="col-6 col-12-small">
												<h2>NOTICE</h2>
												<section class="box">
													<a href="#" class="image featured"><img src="images/pic08.jpg" alt="" /></a>
													<header>
														<h3>Magna tempus consequat</h3>
														<p>Posted 45 minutes ago</p>
													</header>
													<p>Lorem ipsum dolor sit amet sit veroeros sed et blandit consequat sed veroeros lorem et blandit adipiscing feugiat phasellus tempus hendrerit, tortor vitae mattis tempor, sapien sem feugiat sapien, id suscipit magna felis nec elit. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos lorem ipsum dolor sit amet.</p>
													<footer>
														<ul class="actions">
															<li><a href="#" class="button icon solid fa-file-alt">더보기</a></li>
														</ul>
													</footer>
												</section>
											</div>
											<div class="col-6 col-12-small">
												<h2>EXMAPLE</h2>
												<section class="box">
													<a href="#" class="image featured"><img src="images/pic09.jpg" alt="" /></a>
													<header>
														<h3>Aptent veroeros aliquam</h3>
														<p>Posted 45 minutes ago</p>
													</header>
													<p>Lorem ipsum dolor sit amet sit veroeros sed et blandit consequat sed veroeros lorem et blandit adipiscing feugiat phasellus tempus hendrerit, tortor vitae mattis tempor, sapien sem feugiat sapien, id suscipit magna felis nec elit. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos lorem ipsum dolor sit amet.</p>
													<footer>
														<ul class="actions">
															<li><a href="#" class="button icon solid fa-file-alt">더보기</a></li>
														</ul>
													</footer>
												</section>
											</div>
										</div>
									</section>
								</section>
							</div>
						</div>
					</div>
				</section>
					</div>
				</div>
			</div>

	<!-- Footer -->
		<section id="footer">
			<%@ include file="footer.jsp"%>
		</section>

	</div>

	<!-- Scripts -->
	<script src="js/jquery.min.js"></script>
	<script src="js/jquery.dropotron.min.js"></script>
	<script src="js/browser.min.js"></script>
	<script src="js/breakpoints.min.js"></script>
	<script src="js/util.js"></script>
	<script src="js/main.js"></script>

	</body>
</html>