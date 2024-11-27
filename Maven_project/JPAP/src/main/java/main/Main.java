package main;

import entity.Article;
import dao.ArticleDao;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		ArticleDao articleDAO = new ArticleDao();
		Scanner scanner = new Scanner(System.in);
		//Ajouter un article 
		Article article = new Article();
		article.setDescription("Artcile 1 est une tres bonne article");
		article.setBrand("marque artciel1");
		article.setPrice(100);
		articleDAO.save(article);
		
		//Lire les articles 
		articleDAO.getAll().forEach(art -> System.out.println(art.getDescription()));
			}

}
