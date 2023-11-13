<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- cate_list.jsp // 카테고리 목록 페이지 -->

<!-- admin_top.jsp include -->
<%@include file="../admin_top.jsp" %>

<!-- 내용 -->
	<div align="left">
		<h1>카테고리 목록 <button type="button">카테고리 등록</button></h1>
		<c:if test="${empty listMainCate}">
			<h4>등록된 카테고리가 없습니다.</h4>
		</c:if>
		<c:if test="${not empty listMainCate}"> <!-- 대분류 카테고리의 번호를 기준으로 오름차순 정렬 -->
			<h3><b>대분류</b>&nbsp;&nbsp;</h3>
				<c:forEach var="mdto" items="${listMainCate}">
					<h4><b>${mdto.main_cate_name}</b></h4>
				</c:forEach>
		</c:if>
	
<!-- admin_bottom.jsp include -->
<%@include file="../admin_bottom.jsp" %>
