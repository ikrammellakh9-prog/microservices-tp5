package ma.ikram.tp5.dao;

import ma.ikram.tp5.entities.Article;
import java.util.List;

public interface IArticleDao {
    Article save(Article article);
    Article findById(Long id);
    List<Article> findAll();
    void update(Article article);
    void delete(Long id);
}
