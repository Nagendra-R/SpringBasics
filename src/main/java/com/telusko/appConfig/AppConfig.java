package com.telusko.appConfig;

import com.telusko.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "desktop")
    public Desktop getDesktop(){
        return new Desktop();
    }

}
