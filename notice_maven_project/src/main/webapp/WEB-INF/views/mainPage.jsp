<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>notice_project</title>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<style>
div {
	width: 100%;
	height: 700px;
	border: 1px solid #000;
}

div.left {
	width: 50%;
	float: left;
	box-sizing: border-box;
	background: #ff0;
}

div.right {
	width: 50%;
	float: right;
	box-sizing: border-box;
	background: #0ff;
}
</style>
<script type="text/javascript">
	$(document).ready(function() {
		$("#click_you").on('click', function() {
			location.href = "/mainYoo.do";
		});

		$("#click_koo").on('click', function() {
			location.href = "/mainKoo.do";
		});
		
		$("#click_board").on('click', function(){
			location.href = "/mainBoard.do";
		});
	});
</script>
<body>
	<div>
		<p>게시판 테스트용 버튼</p>
		<span id="click_board">샘플게시판으로 이동</span>	
	</div>

	<div>
		<div class="left">
			<img id="click_you" style="height: 100%; width: 100%" alt="유준태"
				src="../images/you.png">
		</div>
		<div class="right">
			<img id="click_koo" style="height: 100%; width: 100%" alt="구본혁"
				src="../images/koo.jpg">
		</div>
	</div>

</body>
</html>