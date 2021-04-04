package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Abutalib Hasan - amhasan
 * 202101 CIS171 12928
 * Apr 2, 2021
 */
@Entity
public class Menu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String item;
	private String ingredients;
	private double price;
	/**
	 * 
	 */
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param item
	 * @param ingredients
	 * @param price
	 */
	public Menu(long id, String item, String ingredients, double price) {
		super();
		this.id = id;
		this.item = item;
		this.ingredients = ingredients;
		this.price = price;
	}
	/**
	 * @param item
	 * @param ingredients
	 * @param price
	 */
	public Menu(String item, String ingredients, double price) {
		super();
		this.item = item;
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
	 * @return the item
	 */
	public String getItem() {
		return item;
	}
	/**
	 * @param item the item to set
	 */
	public void setItem(String item) {
		this.item = item;
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
		return "Menu [id=" + id + ", item=" + item + ", ingredients=" + ingredients + ", price=" + price + "]";
	}
	
	
	

}
