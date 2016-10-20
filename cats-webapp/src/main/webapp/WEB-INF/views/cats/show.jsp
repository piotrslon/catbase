<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Show Cats</title>
    </head>
    <style>
		table {
		    font-family: arial, sans-serif;
		    border-collapse: collapse;
		    width: 100%;
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
		<table border="1" style="width: 300px">
			<tr>
				<th>Cats name</th>
				<th>Details</th>
			</tr>
			<tr>
				<td>Name:</td>
				<td>${name}</td>
			</tr>
		</table>
		
		<button type="button"><a href="/cats-webapp/" class="cancel">Back!</a></button>
	</body>
</html>
