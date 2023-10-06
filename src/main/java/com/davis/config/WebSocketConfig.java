package com.davis.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.corundumstudio.socketio.SocketIOServer;

@Configuration
public class WebSocketConfig {

	@Value("${socket.host}")
	private String host;

	@Value("${socket.port}")
	private int port;

	@Bean
	public SocketIOServer socketIOServer() throws Exception {
		com.corundumstudio.socketio.Configuration config = new com.corundumstudio.socketio.Configuration();
		config.setHostname(host);
		config.setPort(port);

		SocketIOServer server = new SocketIOServer(config);
		
		return server;
	}
}
