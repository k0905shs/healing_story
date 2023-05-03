package com.km.config;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class CommonAuditorAware implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        // TODO: 스프링 시큐리티 OAuth2 연동 필요
        return Optional.of("SYSTEM");
    }
}
