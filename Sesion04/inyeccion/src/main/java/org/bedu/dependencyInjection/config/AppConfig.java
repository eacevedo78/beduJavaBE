package org.bedu.dependencyInjection.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.bedu.dependencyInjection.config.Greeting;
@Configuration
public class AppConfig {

    @Bean
    public Greeting greeting(){
        return new Greeting();
     }
}
