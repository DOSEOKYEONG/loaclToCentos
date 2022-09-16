package com.ll.exam.infra.article.repository;

import com.ll.exam.infra.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
