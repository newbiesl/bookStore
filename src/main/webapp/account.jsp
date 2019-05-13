<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<base href="${deployName}">
<head>  
    <meta charset="UTF-8">  
    <title>登录界面</title>  
    <link rel="stylesheet" type="text/css" href="css/account.css"/> 
    <script type="text/javascript" src="js/jquery.min.js"></script> 
</head>  
<body>  
    <div id="login">  
        <h1>Account</h1>  
        <form name="login" action="user/login.do" method="post">
        	<p id="msg" style="position:absolute; margin-top: -25px; color: red;">${errorMsg}</p>  
            <input type="text" required="required" placeholder="用户名" name="uname" onfocus="clearMsg()"/>  
            <input type="password" required="required" placeholder="密码" name="pwd"/> 
            <input type="submit" value="登录" style="background-color: #4a77d4; width: -webkit-fill-available;
    			height: auto;"/>
			<p>还没有账号？<a href="register.jsp">立即注册</a></p>
        </form>  
    </div>  
</body>

<script type="text/javascript">
function clearMsg(){
	if($("#msg").text() != "") {
		// 聚焦时，清空错误提示
		$("#msg").text("");
	}
}

</script>  
</html>  