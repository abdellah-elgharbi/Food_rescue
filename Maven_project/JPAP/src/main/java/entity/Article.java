package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "T_Articles")
public class Article{
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idArticle; 
	
	@Column(nullable = false)
	private String brand; 
	
	@Column(nullable = false)
	private String description; 
	
	@Column(name="UnitaryPrice" , nullable = false) 
	private double price;

	public int getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	} 
	
	
	
	

}
