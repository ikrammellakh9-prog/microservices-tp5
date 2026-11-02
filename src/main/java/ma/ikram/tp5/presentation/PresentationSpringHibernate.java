package ma.ikram.tp5.presentation;

import ma.ikram.tp5.config.SpringHibernateConfig;
import ma.ikram.tp5.entities.Article;
import ma.ikram.tp5.service.IArticleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationSpringHibernate {
    public static void main(String[] args) {
        System.out.println("========== TEST SPRING + HIBERNATE + @Transactional (Ikram) ==========");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringHibernateConfig.class);

        IArticleService service = context.getBean(IArticleService.class);

        Article a1 = new Article("REF-101", "Module Caméra ESP32-CAM", 95.0, 30);
        Article a2 = new Article("REF-102", "Écran OLED 0.96 I2C", 55.0, 50);

        service.ajouterArticle(a1);
        service.ajouterArticle(a2);

        System.out.println(">>> Liste des articles enregistrés via Service Spring/Hibernate :");
        service.listerTous().forEach(a -> System.out.println(" - " + a.getReference() + " : " + a.getDesignation() + " (" + a.getPrix() + " DH, Qte: " + a.getQuantite() + ")"));

        System.out.println(">>> Valeur totale du stock = " + service.calculerValeurTotaleStock() + " DH");

        context.close();
    }
}
