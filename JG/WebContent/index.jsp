<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="cn" lang="cn">
<head>
<title>Insert title here</title>

<!--Character Encoding-->
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />

<!--CSS-->
<link rel="stylesheet" type="text/css" href="../common/css/global.css" />
<link rel="stylesheet" type="text/css" href="../common/css/fragment.css" />

<!--Lightbox CSS - Remove if not needed-->
<link rel="stylesheet" type="text/css" href="../common/css/lightbox.css" media="screen" />

<script type="text/javascript" src="../common/js/jquery-latest.js"></script>
<script type="text/javascript" src="../common/js/jquery-ui-1.8.16.custom.min.js"></script>
<script type="text/javascript">

$(document).keyup(function(event){
	if(event.keyCode == 17){
		$("#newitem").hide();
	}
});

$(function(){
	$("h5[name='fragitem']").attr("title","click to add").css("cursor","pointer").click(function(event){
		event.stopPropagation();

		$("#newitem").hide().show("200").css("top",event.pageY).css("left",event.pageX).children().width(200).height(30).html("输入内容").click(function(){
			$(this).html("");
		}).keypress(function(e){
			if(e.keyCode == 13){
				alert('submit');
			}
		});
	});

});
</script>
	
</head>
<body>
<div id="newitem" style="position:fixed; display: none;">
<textarea>在此输入内容</textarea>
</div>
<div id="mainContainer">
<div id="mainContent">
	<div id="leftContent">
		<div id="goalnav">
		<h5 name="fragitem">Goals</h5>
		<ol>
			<li>学习英语</li>
			<li>学习jquery</li>
		</ol>
		</div>
		<div id="mattersnav">
		<h5 name="fragitem">Matters</h5>
		<ol>
			<li>学习英语</li>
			<li>学习jquery</li>
		</ol>
		</div>		
	</div>
	<div id="rightContent">
		<div id="timetable">
		<h5>Timetable</h5>
		2011-03-04,周一<br/>
		18:00-19:00 溜狗
		</div>
		<div id="schedule">
		<h5>Schedule</h5>
		今天
		<ol><li>国庆节 </li></ol>
		本周
		<ol>
		<li>某某生日</li>
		<li>小丁从海南回来 </li>
		</ol>
		</div>
		
		<div id="bracket">
		<h5 name="fragitem">Bracket</h5>
		<ol><li>王老师的页面 </li></ol>
		</div>
	</div>
</div>
<div id="footer">
<div id="footerinfo">欢迎你：$nickname</div>
<div id="footerutil"><a href="">日记本</a><a href="">密码箱</a><a href="">联系人</a></div>
</div>
</div>
</body>
</html>