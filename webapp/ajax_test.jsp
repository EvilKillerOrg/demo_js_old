<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/ajax.js"></script>
<script type="text/javascript">
	//var httpRequest = HTTP.newRequest();
	//alert(httpRequest);
	//HTTP.sendGETRequest("${pageContext.request.contextPath}/servlet/generateXMLServlet" , true);
	
	//覆盖了JS文件中的
	HTTP.responseTextCall=function(responseText){
		//alert(responseText);
		var span = document.getElementById("myspan");
		span.innerHTML=responseText; //给span的位置插入responseText的值
		
	}
	
	var getResponse = function(){
		HTTP.sendGETRequest("${pageContext.request.contextPath}/servlet/generateXMLServlet" , true);
	}
</script>
</head>
<body>
	<input type="button" name="button1" value="GetRespnose" onclick="getResponse();"><br>
	<span id="myspan"></span>
</body>
</html>