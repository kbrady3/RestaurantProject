package dmacc.beans;

import java.time.LocalDate;
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
 * Apr 14, 2021
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PaymentInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String cardInfo;
}
