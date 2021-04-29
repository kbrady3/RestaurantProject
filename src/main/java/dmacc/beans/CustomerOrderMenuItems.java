/**
 * 
 */
package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
public class CustomerOrderMenuItems {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

}
