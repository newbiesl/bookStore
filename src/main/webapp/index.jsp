<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<base href="${deployName}">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>bookStore</title>
<link rel="stylesheet" type="text/css" href="css/style.css"/>
<script type="text/javascript" src="js/jquery.min.js"></script> 
</head>
<body>
	<div id="page">
		<div id="top">
			<div id="top_left">
				<img alt="" src="img/logo.png">
			</div>
			<div id="top_right">
				<img alt="" src="img/cart.gif">
				<a href="cart.jsp">购物车</a>|
				<a href="#">帮助中心</a>|
				<a href="account.jsp">我的账户</a>|
				<a href="register">新用户注册</a>
			</div>
		</div>
		<div class="clear"></div>
		<div id="menu">
			
		</div>
		<div id="search">
			<span>Search</span>
			<input type="text" />
			<input type="image" src="img/serchbutton.gif" />
		</div>
		<div id="content">
			<div id="content_top">
				<a href="#">首页</a>><a href="#">推荐</a>><a href="#">图书列表</a>
				<!-- <span>首页 > 推荐 > 图书列表 </span> -->
			</div>
			<div id="content_bottom">
				<h1>商品目录</h1>
				<hr/>
				<h1>精品书籍</h1>
				<span>共n种商品</span>
				<hr/>
				<div id="productlist">
					<div id="productlist_img">
						<img alt="" src="img/productlist.gif" width="100%">
					</div>
					<div id="booklist">
						<div class="book">
							<div>
							    <a href="#"><img src="img/timg%20(1).jpg" width="190" height="196" ></a>
								<!-- <img alt="" src="img/timg%20(1).jpg" width="190" height="196"> -->
							</div>
							<div class="bookIntr">
								<span>书名：xxx</span><br/>
								<span>售价：xxx</span>
							</div>
						</div>
						<div class="book">
							<div>
								 <a href="#"><img src="img/timg%20(2).jpg" width="190" height="196"></a>
								<!-- <img alt="" src="img/timg%20(2).jpg" width="190" height="196"> -->
							</div>
							<div class="bookIntr">
								<span>书名：xxx</span><br/>
								<span>售价：xxx</span>
							</div>
						</div>
						<div class="book">
							<div >
								<a href="#"><img src="img/timg%20(3).jpg" width="190" height="196"></a>
								<!-- <img alt="" src="img/timg%20(3).jpg" width="190" height="196"> -->
							</div>
							<div class="bookIntr">
								<span>书名：xxx</span><br/>
								<span>售价：xxx</span>
							</div>
						</div>
						<div class="book">
							<div >
								<a href="#"><img src="img/timg%20(4).jpg" width="190" height="196"></a>
								<!-- <img alt="" src="img/timg%20(4).jpg" width="190" height="196"> -->
							</div>
							<div class="bookIntr">
								<span>书名：xxx</span><br/>
								<span>售价：xxx</span>
							</div>
						</div>
						<div class="book">
							<div class="bookimg">
							    <a href="#"><img src="img/timg%20(5).jpg" width="156" ></a>
								<!-- <img alt="" src="img/timg%20(5).jpg" width="156"> -->
							</div>
							<div class="bookIntr">
								<span>书名：xxx</span><br/>
								<span>售价：xxx</span>
							</div>
						</div>
						<div class="book">
							<div class="bookimg">
								<a href="#"><img src="img/timg%20(6).jpg" width="156"></a>
								<!-- <img alt="" src="img/timg%20(6).jpg" width="156"> -->
							</div>
							<div class="bookIntr">
								<span>书名：xxx</span><br/>
								<span>售价：xxx</span>
							</div>
						</div>
						<div class="book">
							<div class="bookimg">
								<a href="#"><img src="img/timg%20(7).jpg" width="156"></a>
								<!-- <img alt="" src="img/timg%20(7).jpg" width="156"> -->
							</div>
							<div class="bookIntr">
								<span>书名：xxx</span><br/>
								<span>售价：xxx</span>
							</div>
						</div>
						<div class="book">
							<div>
								<a href="#"><img src="img/timg%20(8).jpg" width="190" height="196"></a>
								<!-- <img alt="" src="img/timg%20(8).jpg" width="190" height="196"> -->
							</div>
							<div>
								<span>书名:xxx</span>
								<br>
								<span>售价:xxx</span>
							</div>
						</div>
						<div class="clear"></div>
						<div id="jumpPage">
							<a href="#">上一页</a>
							<a class="current" href="#">1</a>
							<a href="two.jsp">2</a>
							<a href="three.jsp">3</a>
							<a href="four.jsp">4</a>
							<a href="five.jsp">5</a>
							<a href="six.jsp">6</a>
							<a href="seven.jsp">7</a>
							<a href="two.jsp">下一页</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">
	window.onload=function() {
		// 发送一个ajax请求， 获取到分类表的list数据
		$.ajax({
			url: 'class/list.do',
			type: "post",
			success:function(response){
				var classList = response.classList;
				var menuStr = "";
				for(var i = 0; i < classList.length; i++) {
					menuStr += "<a href='javascript:void(0);' onclick='selectClass(" + classList[i].cid +")'>";
					menuStr += classList[i].cname;
					menuStr += "</a>";
				}
				$("#menu").html(menuStr);
			}
		})
	}
	
	function selectClass(cid) {
		console.log("所选分类的id是" + cid);
	}
	
</script>

</html>