<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jj9 - 재능구조대</title>
<link rel="stylesheet" href="/jj9/resources/css/mypage-category.css">
<body>
<%@ include file="../include/menu.jsp" %>
	<h1 class="mypage-name">${sessionScope.member_name }님의 마이페이지</h1>
	
	<div class="category__container">
		<ul class="cate-container__ul">
			<li><h2>마이 페이지</h2></li>
			<li><a href="./watchlist">관심재능리스트</a></li>
			<li><a href="./shopping-cart">장바구니</a></li>
			<li><a href="./purchase-history">구매내역</a></li>
			<li><a href="./note">쪽지관리</a></li>
			<li><a href="./add-coupon">쿠폰등록</a></li>
			<li><a href="./member-modify">회원정보수정</a></li>
			<li><a href="./secession">회원탈퇴</a></li>
		</ul>
	</div>
	
	<div class="mypage__main">
		<div class="main__container">
			<h2>마이 페이지</h2>
		</div>
	</div>
</body>
</html>