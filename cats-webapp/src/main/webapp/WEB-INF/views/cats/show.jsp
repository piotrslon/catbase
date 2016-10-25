<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
    	<script src="js/cats.js"></script>
        <title>Show Cats</title>
    </head>
    <style>
		table {
		    font-family: arial, sans-serif;
		    border-collapse: collapse;
		    width: 300px;
		    border="1";
		}
		
		td, th {
		    border: 1px solid #dddddd;
		    text-align: left;
		    width: 150px;
		}
		
		tr:nth-child(even) {
		    background-color: #dddddd;
		}
	</style>
    <body>
        <p>Show Cats</p>
	    <br>
		<table>
			<tr>
				<th>#</th>
				<th>Cats name</th>
			</tr>
			<tr>
				<td>0</td>
				<td>${name}</td>
			</tr>
		</table>

		<table>
			<c:forEach items="${cats}" var="cat" varStatus="loop">
				<tr>
					<td class="index"><a href="/cats-webapp/cats/show/${loop.index}">${loop.index}</a></td>
					<td><c:out value="${cat.name}" /></td>
				</tr>
			</c:forEach>
		</table>

	<button type="button"><a href="/cats-webapp/" class="cancel">Back!</a></button>
	</body>
</html>
