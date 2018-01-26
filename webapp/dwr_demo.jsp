<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="${pageContext.request.contextPath}/dwr/engine.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/dwr/interface/Demo.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/dwr/interface/UserInfoAction.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/dwr_userinfo.js"></script>

<script type="text/javascript">
	function printName(){
		var myfunction = function(data){
			alert("MyName: "+data);
		}
		
		Demo.getUserName(myfunction);
		}
</script>


<script type="text/javascript">
	function getUserInfo(){
		var myfunction = function(data){
			if(typeof data == 'object'){
				//if('uuid' in data){
					//	alert(data.uuid);//上下这是两种取值的方式
					//alert(data['uuid']);// 上下这是两种取值的方式
				//	}
				var mydiv = document.getElementById("mydiv");
				var dataList = [data]; //data 此时为单个对象 传的dataList是数组 (把单个对象放进数组里)
				InitialTable.loadDataFromDWR(mydiv,dataList)
			}
		}
		UserInfoAction.getUserInfo(myfunction);
	}
</script>


<script type="text/javascript">
	function findAllUserInfo(){
		var myfunction = function(dataList){
			if(typeof dataList == 'object'){
				var mydiv = document.getElementById("mydiv");
				InitialTable.loadDataFromDWR(mydiv,dataList)
			}
		}
		
		UserInfoAction.findAllUserInfo(myfunction);
	}
</script>
</head>
<body><br>
	<input type="button" name="button1" value="printName" onclick="printName();">
	<input type="button" name="button2" value="getUserInfo" onclick="getUserInfo();">
	<input type="button" name="button3" value="findAllUserInfo" onclick="findAllUserInfo();">
	<br>
	<div id="mydiv">
	
	</div>
</body>
</html>