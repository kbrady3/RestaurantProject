package dmacc.beans;

import java.time.LocalDate;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Abutalib Hasan - amhasan
 * 202101 CIS171 12928
 * Apr 2, 2021
 */
//@Embeddable
@Entity
public class CustomerOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private LocalDate date;
	@ManyToOne
	private Customer customer;
	

	public CustomerOrder() {
		super();
	}
	/**
	 * @param id
	 * @param date
	 * @param customer
	 * @param order
	 */
	public CustomerOrder(long id, LocalDate date, Customer customer) {
		super();
		this.id = id;
		this.date = date;
		this.customer = customer;
	}
	/**
	 * @param customer
	 * @param order
	 */
	public CustomerOrder(Customer customer) {
		super();
		this.customer = customer;
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
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}
	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}
	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", date=" + date + ", customer=" + customer + "]";
	}
	
	

}
