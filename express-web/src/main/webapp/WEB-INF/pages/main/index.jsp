<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Main</title>
<script src="https://cdn.bootcss.com/jquery/1.10.2/jquery.min.js">
  </script>
	<style>
		
		.main{
			margin: 0 auto;
			height: 100vh;
			background-color: #F0F8FF;
			width: 60vw;
		}
		.module{
			margin: 2% 18%;
			list-style-type: none;
		}
		li{
			padding: 5px;
		}
		a{
			text-decoration: none;
			color: #474747;
			cursor: pointer;
		}
		.login {
			height: 35vh;
			width: 35vw;
			position: absolute;
			background-color: #fff;
			left: 32.5vw;
			top: 30vh;
			border-radius: 15px;
			z-index: 2;
			display: none;
	  }
	  .q {
			background-color: #000;
			height: 100vh;
			width: 100vw;
			position: absolute;
			z-index: 1;
			opacity: 0.3;
			display: none;
	  }
		.title{
			text-align: center;
			padding: 10px;
		}
		.in{
			text-align: center;
			padding: 3%;
		}
	</style>
	<script type="text/javascript">
		$(document).ready(function () {
			$("#button").click(function (){
				$(".login").fadeIn(400);
				$(".q").fadeIn(400);
			});
			$("#cancel,#close").click(function (){
				$(".login").fadeOut(400);
				$(".q").fadeOut(400);
			});
		});
	</script>
</head>

<body>
	<!--登录背景-->
	<div class="q"></div>
  <div class="main">
     <!--导航条-->
		<div style="display: flex;justify-content: flex-end;">
	    <div id="button" style=""><a>登录</a>	</div>
			<div style="margin-left: 1vw;"><a>注册</a></div>
		</div>
		<!--登录弹窗-->
		<div class="login">
			<div id="close" style="text-align: right;margin-right: 1vw;"><a>&#10005;</a></div>
		  <div class="title">账号登录</div>			
		  <div>
			<div class="in">账号：<input type="text" placeholder="账号" /></div>
			<div class="in">密码：<input type="password" placeholder="密码" /></div>
			<div style="display: flex;justify-content: center; align-items: center;margin-top: 3vh;">
				<div><button type="button" style="">确认</button></div>
				<div id="cancel"><button type="button" style="margin-left: 6vw;">取消</button></div>
			</div>
	  </div>
		</div>
		
		<!--页面内容-->
	<h2 style="text-align: center;">快递小助手</h2>
	<div>
		<h3 style="margin: 2% 15%;">模块选择</h3>
	  <ul class="module">
	  	<li><a href="manager/journal/index.html">员工工作日志</a></li>
	  	<li><a href="zouguo/myFinance/index.html">财务统计模块</a></li>
	  	<li><a href="zsy/staff/index.html">员工基本信息</a></li>
	  	<li><a href="fangye/register/index.html">用户信息注册</a></li>
	  	<li><a href="ujournal/index.html">用户使用日志</a></li>
	  	<li><a href="Ymz/myUserorder/index.html">快递预约</a></li>
	  	<li><a href="pay/index.html">支付模块</a></li>
	  	<li><a href="houjie/massage/index.html">留言模块</a></li>
	  </ul>
  </div>


</body>

</html>