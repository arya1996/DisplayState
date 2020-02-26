<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table class="table table-bordered">
				<thead>
		<form action="<%=request.getContextPath()%>/ServletTwo">
				<button class="btn btn-outline-success btn-rounded btn-sm my-0"
							type="submit">Display</button>		
						
					</form>
					<tr>
						<th>S.No.</th>
						<th>State</th>
						
						

					</tr>
				</thead>

				<tbody>

					<c:forEach var="state" items="${list}">

						<tr>
							<td><c:out value="${state.no}" /></td>
							<td><c:out value="${state.stateName}" /></td>
							
							
							

						</tr>
					</c:forEach>
					
					</tbody>

			</table>

				</tbody>


</body>
</html>