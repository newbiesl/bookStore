<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<base href="${deployName}">
<head>  
    <meta charset="UTF-8">  
    <title>注册界面</title>  
    <link rel="stylesheet" type="text/css" href="css/account.css"/> 
    <script type="text/javascript" src="js/jquery.min.js"></script> 
</head>  
<body>  
    <div id="login">  
        <h1>Register</h1>  
        <div>
        	<p id="msg" style="position:absolute; margin-top: -25px; color: red;"></p>    
            <input id="uname" type="text" required="required" placeholder="用户名" name="uname" onfocus="clearMsg()"/>  
            <input id="pwd" name="pwd" type="password" required="required" placeholder="密码"/> 
            <input id="pwd2" name="pwd2" type="password" required="required" placeholder="确认密码"/>
            <button onclick="myFunction();" style="background-color: #4a77d4; width: -webkit-fill-available;
    			height: 40px;">注册</button>
			<p>已有账号？<a href="account.jsp">立即登录</a></p>
        </div>  
    </div>  
</body>

<script type="text/javascript">
	function clearMsg(){
		if($("#msg").text() != "") {
			// 聚焦时，清空错误提示
			$("#msg").text("");
		}
	}

	function myFunction(){
		var uname=$("#uname").val(); 
		var p1=$("#pwd").val(); 
		var p2=$("#pwd2").val();
		if(uname =="" || p1=="" || p2 == ""){
			alert("用户名和密码不能为空！");
			$("#pwd").focus();
			return false;
		}
		if(p1!= p2){
			alert("两次输入密码不一致，请重新输入");
			return false;
		}else{
			$.ajax({
				  url: 'user/register.do',
				  type: "post",
				  data: {"uname": uname, "pwd": p1},
				  success: function(response){
				     if(response.result == "success") {
				    	 // 跳转页面
				    	window.location.href="index.jsp";
				     } else {
				    	 $("#msg").text(response.msg);
				     }
				  }
			})
		}
	}
</script>  
</html>  