/**
 * 
 */
package dmacc.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author Jeremy Brannen - jrbrannen
 *CIS175
 * Apr 29, 2021
 */
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OrderItems {

	@ManyToOne
	private CustomerOrder order;
	@ManyToOne
	private MenuItems item;
	private long quantity;
	//for whatever reason every entity must have an id, so this is here, even though it should never be used.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

}
