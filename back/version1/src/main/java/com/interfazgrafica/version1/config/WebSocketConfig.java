package com.interfazgrafica.version1.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        config.enableSimpleBroker("/topic"); // Habilita un broker simple para enviar mensajes a los clientes
        config.setApplicationDestinationPrefixes("/app"); // Prefijo para los mensajes enviados desde el cliente
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws") // Endpoint para conectarse al WebSocket
                .setAllowedOrigins("http://localhost:5173") // Permite solicitudes desde el frontend
                .withSockJS(); // Habilita SockJS para compatibilidad con navegadores antiguos
    }
}