package com.fkbinho.gof.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Messaging API")
                        .version("1.0")
                        .description("API for sending messages via Email, SMS, and WhatsApp using Strategy, Factory, and Facade patterns"));
    }
}
