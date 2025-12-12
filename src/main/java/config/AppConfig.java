package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan (value = {"controller", "service", "dao", "config"})
public class AppConfig {


}