package com.ll.exam.infra.article.base;

import com.ll.exam.infra.article.service.ArticleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevInitData {
    @Bean
    public CommandLineRunner initDevData(ArticleService articleService) {
        return args -> {
            articleService.write("제목1");
            articleService.write("제목2");
        };
    }
}