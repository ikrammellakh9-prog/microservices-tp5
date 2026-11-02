package ma.ikram.tp5.service;

import ma.ikram.tp5.entities.Article;
import java.util.List;

public interface IArticleService {
    Article ajouterArticle(Article article);
    Article trouverParId(Long id);
    List<Article> listerTous();
    void mettreAJour(Article article);
    void supprimer(Long id);
    double calculerValeurTotaleStock();
}
