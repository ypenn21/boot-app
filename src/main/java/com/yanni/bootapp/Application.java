package com.yanni.bootapp;
import com.yanni.bootapp.config.BootAppConfig;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.springframework.boot.SpringApplication.run;

//@EnableAutoConfiguration
//@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        final Class<?>[] sources = {
                BootAppConfig.class
        };

        run(sources, args);
    }
}