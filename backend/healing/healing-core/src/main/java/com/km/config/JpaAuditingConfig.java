package com.km.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing(auditorAwareRef = "commonAuditorAware")
@Configuration
public class JpaAuditingConfig {
    @Bean
    public AuditorAware<String> commonAuditorAware() {
        return new CommonAuditorAware();
    }
}
