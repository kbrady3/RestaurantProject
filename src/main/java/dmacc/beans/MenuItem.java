package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Abutalib Hasan - amhasan
 * 202101 CIS171 12928
 * Apr 8, 2021
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuItem {
	private long id;
	private String name;
	private String ingredients;
	private double price;
	

}
