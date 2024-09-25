package ca.gbc.application_properties;

import org.springframework.boot.SpringApplication;

public class TestApplicationPropertiesApplication {

    public static void main(String[] args) {
        SpringApplication.from(ApplicationPropertiesApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
