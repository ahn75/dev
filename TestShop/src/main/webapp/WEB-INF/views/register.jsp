<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page session="false" %>

<%@ include file="/WEB-INF/common/header.jsp" %>

<h3>
	USER 등록
</h3>

<form action="register" method="post" >
	<div class="box-body">
		<div class="form-group">
			<label> ID </label> <input type="text" name="id" class="form-control"
				placeholder="ID를 입력하세요" />
		</div>
		
		<div class="form-group">
			<label> NAME </label><input type="text" name='name' class='form-control' 
				placeholder="이름을 입력하세요">
		</div>
		
		<div class="form-group">
			<label> AGE </label><input type="number" name='age' class='form-control' 
				placeholder="나이를 입력하세요">
		</div>
		
		<div class="form-group">
			<label> HOBBY </label><input type="text" name='hoddy' class='form-control' 
				placeholder="취미를 입력하세요">
		</div>
		
	</div>
	
	<div class="box=footer">
		<button type="submit" class="btn btn-primary">Submit</button>
	</div>
</form>


<%@ include file="/WEB-INF/common/footer.jsp" %>