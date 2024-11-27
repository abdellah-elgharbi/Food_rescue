package dao;

import java.util.List;

import entity.Article;
import jakarta.persistence.*;

public class ArticleDao {
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("T_Article");
	
	public void save(Article art) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		try {
			transaction.begin();
			em.persist(art);
			transaction.commit();
		}catch(Exception e) {
			if(transaction.isActive()) transaction.rollback();
			e.printStackTrace();
		}finally {
			em.close();
		}
	}
	
	public List<Article> getAll(){
		EntityManager em = emf.createEntityManager();
		return em.createQuery("Select * FROM Article art", Article.class).getResultList();
	}
	
	


}
