package com.rest.domain.article.entity;

import com.rest.global.jpa.BaseEntity;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
@ToString(callSuper = true)
@SuperBuilder
public class Article  extends BaseEntity {


    private  String subject;
    private  String content;
}
