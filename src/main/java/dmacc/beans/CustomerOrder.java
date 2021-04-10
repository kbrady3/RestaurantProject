package dmacc.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Abutalib Hasan - amhasan
 * 202101 CIS171 12928
 * Apr 2, 2021
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerOrder {
	private long id;
	private LocalDate date;
	@Autowired
	private Customer customer;
	private MenuItem menuItem;
	
}
