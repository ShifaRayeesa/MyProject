<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title> 
        Zoho Schools for Graduate Studies
    </title>
    <link rel="stylesheet" href="zsgs.css">
 </head>
    <body>
        <div class="container">
            <div class="card">
                <div class ="form">
                <form action="addrecord" method="post">
                    <h1>Create Account</h1> 
                    <input type="text" name="username" id="username" placeholder="Username" required />
                    <input type="email" name="email" placeholder="Email" id="email" required/>
                    <input type="password" name="password" placeholder="Password" id="password" required />
                    
                    <button>Sign Up</button>
                    <span> Already have an account? <a href="login">Log In </a> </span>
                </form>
                </div>
          </div>
        </div>
    </body>
</html>
