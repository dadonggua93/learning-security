package org.example.security.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = { "org.example.security.domain.*" })
@EntityScan("org.example.security.domain.*")
@EnableJpaRepositories(basePackages = "org.example.security.domain.*")
public class DbConfiguration {
}
