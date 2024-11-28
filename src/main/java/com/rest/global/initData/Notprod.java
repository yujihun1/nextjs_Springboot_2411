package com.rest.global.initData;


import com.rest.domain.article.service.ArticleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({"dev","test"})
public class Notprod {
    @Bean
    CommandLineRunner initData(ArticleService articleService){
        return args -> {
            articleService.create("제목 1","내용 1");
            articleService.create("제목 2","내용 2");
            articleService.create("제목 3","내용 3");
            articleService.create("제목 4","내용 4");
            articleService.create("제목 5","내용 5");

        };
    }
}
