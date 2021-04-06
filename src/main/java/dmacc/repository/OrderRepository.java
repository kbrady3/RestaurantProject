
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dmacc.beans.Order;

/**
 * @author Jeremy Brannen - jrbrannen CIS175 Apr 5, 2021
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
