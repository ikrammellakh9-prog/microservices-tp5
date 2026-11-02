package ma.ikram.tp5.service;

import ma.ikram.tp5.dao.IArticleDao;
import ma.ikram.tp5.entities.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ArticleServiceImpl implements IArticleService {

    @Autowired
    private IArticleDao articleDao;

    @Override
    public Article ajouterArticle(Article article) {
        return articleDao.save(article);
    }

    @Override
    @Transactional(readOnly = true)
    public Article trouverParId(Long id) {
        return articleDao.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Article> listerTous() {
        return articleDao.findAll();
    }

    @Override
    public void mettreAJour(Article article) {
        articleDao.update(article);
    }

    @Override
    public void supprimer(Long id) {
        articleDao.delete(id);
    }

    @Override
    @Transactional(readOnly = true)
    public double calculerValeurTotaleStock() {
        return listerTous().stream()
                .mapToDouble(a -> a.getPrix() * a.getQuantite())
                .sum();
    }
}
