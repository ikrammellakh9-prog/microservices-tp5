# TP 5 : Intégration Spring et Hibernate

**Auteure :** Ikram Mellakh  
**Module :** Architecture Microservices : Conception, Déploiement et Orchestration  
**Dépôt GitHub :** [https://github.com/ikrammellakh9-prog/microservices-tp5.git](https://github.com/ikrammellakh9-prog/microservices-tp5.git)  

---

## 🎯 Objectifs
- Intégration de Spring ORM et d'Hibernate 6 via configuration Java (`SpringHibernateConfig`).
- Déclaration des beans `DataSource` (H2 en mémoire), `LocalSessionFactoryBean` et `PlatformTransactionManager`.
- Gestion déclarative des transactions avec l'annotation `@Transactional`.
- Séparation stricte des couches DAO (`IArticleDao`) et Métier (`IArticleService`).
- Tests unitaires avec JUnit 5 et Mockito.

---

## 🚀 Exécution

```bash
# Compilation et tests
mvn clean test

# Démonstration console
mvn exec:java -Dexec.mainClass="ma.ikram.tp5.presentation.PresentationSpringHibernate"
```
