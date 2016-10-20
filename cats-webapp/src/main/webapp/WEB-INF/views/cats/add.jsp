<!DOCTYPE html>
<html>
    <head>
        <title>Add Cat</title>
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
		    width: 100%;
		}
		
		tr:nth-child(even) {
		    background-color: #dddddd;
		}
	</style>
    <body>
        <p>AddCats</p>
	    <br>
	    <form method="POST">
			<table border="1" style="width: 300px">
				<tr>
					<th>Qewstions</th>
					<th>Answer</th>
				</tr>
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name"/></td>
				</tr>
				<tr>
					<td>Born date:</td>
					<td><input type="text" name="birthDate"/></td>
				<tr>
					<td>Weight:</td>
					<td><input type="text" name="weight"/></td>
				</tr>
				<tr>
					<td>Guardian name:</td>
					<td><input type="text" name="guardianName"/></td>
				</tr>
			</table>
		</form>
		
		<button type="button"><a href="/cats-webapp/" class="cancel">Back!</a></button>
	</body>
</html>
