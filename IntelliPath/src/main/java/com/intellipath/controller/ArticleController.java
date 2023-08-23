package com.intellipath.controller;

import com.intellipath.model.Article;
import com.intellipath.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {
    private final ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/{id}")
    public Article getArticleById(@PathVariable Long id) {
        return articleService.getById(id);
    }

    @GetMapping
    public List<Article> getAllArticles() {
        return articleService.getAllArticles();
    }

    @PostMapping
    public void addArticle(@RequestBody Article article) {
        articleService.saveArticle(article);
    }

    @PutMapping("/{id}")
    public void updateArticle(@PathVariable Long id, @RequestBody Article article) {
        Article existingArticle = articleService.getById(id);
        if (existingArticle != null) {
            existingArticle.setTitle(article.getTitle());
            existingArticle.setContent(article.getContent());
            existingArticle.setAuthor(article.getAuthor());
            articleService.updateArticle(existingArticle);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteArticle(@PathVariable Long id) {
        articleService.deleteArticle(id);
    }
}
