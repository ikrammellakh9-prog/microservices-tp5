package ma.ikram.tp5.service;

import ma.ikram.tp5.dao.IArticleDao;
import ma.ikram.tp5.entities.Article;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ArticleServiceTest {

    @Mock
    private IArticleDao articleDao;

    @InjectMocks
    private ArticleServiceImpl articleService;

    @Test
    @DisplayName("Tester le calcul de la valeur totale du stock")
    void testCalculerValeurTotaleStock() {
        Article a1 = new Article("REF-A", "Item A", 100.0, 2); // 200
        Article a2 = new Article("REF-B", "Item B", 50.0, 4);  // 200

        when(articleDao.findAll()).thenReturn(Arrays.asList(a1, a2));

        double total = articleService.calculerValeurTotaleStock();
        assertEquals(400.0, total, 0.001);
    }
}
