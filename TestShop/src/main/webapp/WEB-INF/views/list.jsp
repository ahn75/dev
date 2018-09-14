<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page session="false" %>

<%@ include file="/WEB-INF/common/header.jsp" %>

<h3>
	USER List
</h3>


<table class="table table-striped">
  <tr>
    <th> ID </th>
    <th> NAME </th>
    <th> AGE </th>
    <th> HOBBY </th>
  </tr>
  	<c:forEach items="${list}" var="user" >
  <tr>
    <td> ${user.id } </td>
    <td> ${user.name } </td>
    <td> ${user.age } </td>
    <td></td>
  </tr>
  	</c:forEach>
</table>



<script>
	var result = '${msg}';
	if (result == 'success') {
		alert("게시물 업로드 했습니다.")
	}
</script>

<%@ include file="/WEB-INF/common/footer.jsp" %>

