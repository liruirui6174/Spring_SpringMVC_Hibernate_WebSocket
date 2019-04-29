<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="jquery-easyui-1.6.2/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="jquery-easyui-1.6.2/themes/icon.css">
<link rel="stylesheet" type="text/css"
	href="jquery-easyui-1.6.2/demo/demo.css">
<script type="text/javascript" src="jquery-easyui-1.6.2/jquery.min.js"></script>
<script type="text/javascript"
	src="jquery-easyui-1.6.2/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="jquery-easyui-1.6.2/locale/easyui-lang-zh_CN.js"></script>

</head>
<body>
    <script >
            var url='ws://'+window.location.host+"/wbskt/skt";
            var websocket=new WebSocket(url);             
            // 打开时
            websocket.onopen = function(evnt) {
                console.log("  websocket.onopen  ");
            };
            // 处理消息时
            websocket.onmessage = function(evnt) {
                $("#msg").append("<p>(<font color='red'>" + evnt.data + "</font>)</p>");
                console.log("  websocket.onmessage   ");
            };         
            websocket.onerror = function(evnt) {
                console.log("  websocket.onerror  ");
            };         
            websocket.onclose = function(evnt) {
                console.log("  websocket.onclose  ");
            };                  
            // 点击了发送消息按钮的响应事件
           function  fun(){    
            	  console.log(12121212);
                // 获取消息内容
                var text = $("#tx").val();         
                // 判断
                if(text == null || text == ""){
                    alert(" content  can not empty!!");
                    return false;
                }         
                var msg = {
                    msgContent: text,
                    postsId: 1
                };         
                // 发送消息
              
                websocket.send(JSON.stringify(msg));
         
            }       
        </script> 
    </head> 
    <body>
        <!-- 最外边框 -->
        <div style="margin: 20px auto; border: 1px solid blue; width: 300px; height: 500px;"> 
            <!-- 消息展示框 -->
            <div id="msg" style="width: 100%; height: 70%; border: 1px solid yellow;overflow: auto;"></div> 
            <!-- 消息编辑框 -->
            <textarea id="tx" style="width: 100%; height: 20%;"></textarea> 
            <!-- 消息发送按钮 -->
            <button id="TXBTN" onClick ="fun()
            " style="width: 100%; height: 8%;">发送数据</button> 
        </div>  
    </body> 

</html>