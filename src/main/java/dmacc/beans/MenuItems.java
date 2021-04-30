package dmacc.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Abutalib Hasan - amhasan
 * 202101 CIS171 12928
 * Apr 2, 2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MenuItems {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String itemName;
	private double price;
	@ManyToMany(mappedBy = "items")
    private List<CustomerOrder> order = new ArrayList<CustomerOrder>();
}
