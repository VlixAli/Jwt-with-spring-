package com.seinfeld.security.config;

import com.seinfeld.security.request.RegisterRequest;
import com.seinfeld.security.service.AuthenticationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import static com.seinfeld.security.model.Role.ADMIN;
import static com.seinfeld.security.model.Role.MANAGER;

@Configuration
public class DatabaseSeeder {

    @Bean
    public CommandLineRunner dataloader(AuthenticationService service,
                                        PasswordEncoder passwordEncoder) {
        return args -> {
            var admin = RegisterRequest.builder()
                    .firstname("Admin")
                    .lastname("Admin")
                    .email("admin@gmail.com")
                    .password(passwordEncoder.encode("password"))
                    .role(ADMIN)
                    .build();

            var manager = RegisterRequest.builder()
                    .firstname("Manager")
                    .lastname("Manager")
                    .email("manager@gmail.com")
                    .password(passwordEncoder.encode("password"))
                    .role(MANAGER)
                    .build();
            System.out.println("Admin token: " + service.register(admin).getAccessToken());
            System.out.println("Manager token: " + service.register(manager).getAccessToken());

        };
    }
}
