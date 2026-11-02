package ma.ikram.tp5.dao;

import ma.ikram.tp5.entities.Article;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ArticleDaoImpl implements IArticleDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Article save(Article article) {
        sessionFactory.getCurrentSession().persist(article);
        return article;
    }

    @Override
    public Article findById(Long id) {
        return sessionFactory.getCurrentSession().get(Article.class, id);
    }

    @Override
    public List<Article> findAll() {
        return sessionFactory.getCurrentSession().createQuery("from Article", Article.class).list();
    }

    @Override
    public void update(Article article) {
        sessionFactory.getCurrentSession().merge(article);
    }

    @Override
    public void delete(Long id) {
        Article a = findById(id);
        if (a != null) {
            sessionFactory.getCurrentSession().remove(a);
        }
    }
}
