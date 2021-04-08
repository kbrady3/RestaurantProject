package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Abutalib Hasan - amhasan
 * 202101 CIS171 12928
 * Apr 8, 2021
 */
@Entity
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String ingredients;
	private double price;
	/**
	 * 
	 */
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param name
	 * @param ingredients
	 * @param price
	 */
	public Item(long id, String name, String ingredients, double price) {
		super();
		this.id = id;
		this.name = name;
		this.ingredients = ingredients;
		this.price = price;
	}
	/**
	 * @param name
	 * @param ingredients
	 * @param price
	 */
	public Item(String name, String ingredients, double price) {
		super();
		this.name = name;
		this.ingredients = ingredients;
		this.price = price;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the ingredients
	 */
	public String getIngredients() {
		return ingredients;
	}
	/**
	 * @param ingredients the ingredients to set
	 */
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", ingredients=" + ingredients + ", price=" + price + "]";
	}
	
	
	

}
