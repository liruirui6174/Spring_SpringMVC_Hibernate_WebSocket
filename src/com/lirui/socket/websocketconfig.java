package com.lirui.socket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import com.lirui.socket.handlerImpl.myHandler;


@Configuration
@EnableWebMvc
@EnableWebSocket
public class websocketconfig  implements WebSocketConfigurer{
	@Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        //允许连接的域,只能以http或https开头
		System.out.println("kaishi");
        String[] allowsOrigins = {"http://www.xxx.com"};
        
       //WebIM WebSocket通道
        registry.addHandler(chatWebSocketHandler(),"/skt").setAllowedOrigins(allowsOrigins).addInterceptors(myInterceptor());
        registry.addHandler(chatWebSocketHandler(), "/sockjs/webSocketIMServer").setAllowedOrigins(allowsOrigins).addInterceptors(myInterceptor()).withSockJS();
    }
    @Bean
    public ChatWebSocketHandler chatWebSocketHandler() {
        return new myHandler();
    }
    @Bean
    public WebSocketHandshakeInterceptor myInterceptor(){
        return new WebSocketHandshakeInterceptor();
    }

}
