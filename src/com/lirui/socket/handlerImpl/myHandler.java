package com.lirui.socket.handlerImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import com.lirui.model.TestModel;
import com.lirui.service.IService;
import com.lirui.socket.ChatWebSocketHandler;


public class myHandler extends ChatWebSocketHandler {

	@Autowired
	private IService is;
	 @Override
	    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
	       System.out.println("收到消息");
			/* super.handleTextMessage(session, message); */
	       try {
	    	   TestModel tm = new TestModel();
	    	   tm.setProperty_A("testaaa");
	    	   tm.setProperty_b("testBBB");
	    	   try {
	    		   is.saveTest(tm);
	    	   }catch(Exception e) {
	    		   e.printStackTrace();
	    	   }
	    	  
	    	   System.out.println(is.getTest().getProperty_A());
	       }catch(Exception e) {
	    	   e.printStackTrace();
	       }
	      
	        session.sendMessage(message);
	    }
}
