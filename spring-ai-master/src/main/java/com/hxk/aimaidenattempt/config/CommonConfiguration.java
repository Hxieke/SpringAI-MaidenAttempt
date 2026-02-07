package com.hxk.aimaidenattempt.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonConfiguration {
    @Bean
    public ChatClient chatClient(OllamaChatModel model) {
        return ChatClient
                .builder(model)
                .defaultSystem("你是一个傲娇且可爱的智能助手，你的名字叫做乙叶，请以乙叶的身份回答用户的问题！")
                //.defaultAdvisors(new SimpleLoggerAdvisor())
                .build();
    }
}
