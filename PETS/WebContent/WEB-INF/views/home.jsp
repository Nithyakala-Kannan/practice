<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
        header {
            background-color: brown;
            height: 10vh;
        }
        .nav-area{
	        float: left;
            list-style: none;
	        margin-top: 30px;
        }
        
        .link{
            float: right;
            list-style: none;
	        margin-top: 30px;
        }
        .nav-area li, .link li{
	        display: inline-block;
        }
        .nav-area li a , .link li a{
            color: black;
            text-decoration: none;
            padding: 5px 20px;
            font-weight: bold;
            font-size: 20px;
            text-transform: uppercase;
        }
        .nav-area li a:hover , .link li a:hover{
            background: #fff;
            color: #333;
        }
        .nav-area {
		    text-align: center;
	    }
        
        .text {
            color: white;
            width: 100%;
            height: 200%;
		    text-align: center;
            margin: 15% 0;
        }
        </style>
</head>
<body>
  <header>
            <div>
            <ul class="nav-area">
            <li><a href="">Home</a></li>
            <li><a href="">About Us</a></li>
            <li><a href="#">Product</a></li>
            <li><a href="">Contact Us</a></li>
            </ul>
        </div>
        <div>
            <ul class="link">
            <li><a href="./login.html">Login</a></li>
            <li><a href="./register .html">Register</a></li>
            </ul>
        </div>
    </header>
    <div class="text">
       
        <h1>Pet Store</h1>
        <h3>Pet Store at your Door</h3>
 <h3>Pets are humanizing. They remind us we have an obligation and responsibility to preserve and nurture and care for all life</h3>
 <h3>Pets have More Love and Compassion in them than most humans</h3>
 <h5>Place where you can buy different things for yourself or others</h5><br>
 <h3>Please login to continue ahead or if you are a new user kindly Sign Up by pressing the link below</h3>
        
            </div>
</body>
</html>