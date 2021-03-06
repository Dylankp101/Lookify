<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
 
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">ADD NEW</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a href="/dash">Dashboard</a>
        </li>

      </ul>
 
    </div>
  </div>
</nav>

<div class="container">
  <div class="row">
    <div class="col-sm">
    <form:form action="/create" method="post" modelAttribute="lookify">
		<div class="input-group mb-3">
  			<span class="input-group-text" id="basic-addon1">Title</span>
  			<input name="title" type="text" class="form-control" placeholder="" aria-label="Username" aria-describedby="basic-addon1">
		</div>
		<div class="input-group mb-3">
  			<span class="input-group-text" id="basic-addon1">Artist</span>
  			<input name="artist" type="text" class="form-control" placeholder="" aria-label="Username" aria-describedby="basic-addon1">
		</div>		
		<div class="input-group mb-3">
		  <label class="input-group-text" for="inputGroupSelect01">Rating</label>
		  <select name="rating"  class="form-select" id="inputGroupSelect01">
		    <option selected>Select a rating...</option>
		    <option value="1">1</option>
		    <option value="2">2</option>
		    <option value="3">3</option>
		    <option value="4">4</option>
		    <option value="5">5</option>
		    <option value="6">6</option>
		    <option value="7">7</option>
		    <option value="8">8</option>
		    <option value="9">9</option>
		    <option value="10">10</option>
		  </select>
		</div>
		<button type="submit" class="btn btn-success">Submit</button>
	</form:form>
    </div>
  </div>
</div>







<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js" integrity="sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj" crossorigin="anonymous"></script>
 
</body>
</html>