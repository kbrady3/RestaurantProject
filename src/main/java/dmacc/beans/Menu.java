package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

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
	private String description;
	
	@Autowired
	private Item item;
	
	/**
	 * 
	 */
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param description
	 * @param item
	 */
	public Menu(long id, String description, Item item) {
		super();
		this.id = id;
		this.description = description;
		this.item = item;
	}

	/**
	 * @param description
	 * @param item
	 */
	public Menu(String description, Item item) {
		super();
		this.description = description;
		this.item = item;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the item
	 */
	public Item getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Menu [id=" + id + ", description=" + description + ", item=" + item + "]";
	}
	
	
}
