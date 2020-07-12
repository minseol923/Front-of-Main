<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>Sign Up Page</title>
  <link rel="stylesheet" href="/css/Register.css">

</head>
<body>
<section class="wrapper">
  <div class="main-content">
    <h3>Join Us</h3>
    <form action="/member/register" method="post">
      <div class="input-group">
        <label for="id">Id</label>
        <input type="text" placeholder="ID" id="id" autocomplete="off">
      </div>
      <div class="input-group">
        <label for="password">Password</label>
        <input type="password" placeholder="Password" id="password">
      </div>
        <div class="input-group">
        <label for="email">Email</label>
        <input type="email" placeholder="Email" id="email" autocomplete="off">
      </div>
        <div class="input-group">
        <label for="name">Name</label>
        <input type="name" placeholder="Name" id="name" autocomplete="off">
      </div>
        <div class="input-group">
        <label for="phone">Phone</label>
        <input type="phone" placeholder="Phone" id="phone" autocomplete="off">
      </div>
        
        <div class="input-group">
        <label for="phone">Gender</label>
            <label class="checkbox">
        <input type="checkbox" value="remember-me" id="rememberMe" name="rememberMe"> 남<input type="checkbox" value="remember-me" id="rememberMe" name="rememberMe">여
      </label>
        
      </div><br>

        
      <div class="input-group">
        <button>Sign up</button>
      </div>
    </form>
    
  </div>
</section>  
</body>
</html>
