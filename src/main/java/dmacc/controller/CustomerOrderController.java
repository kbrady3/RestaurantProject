
package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import dmacc.beans.CustomerOrder;
import dmacc.repository.CustomerOrderRepository;

/**
 * @author Jeremy Brannen - jrbrannen
 *CIS175
 * Apr 5, 2021
 */
@Controller
public class CustomerOrderController {
	
	@Autowired
	CustomerOrderRepository repo;
	
	// display an order
	@GetMapping({"displayCustomerOrder"})
	public String viewCustomerOrder(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewCustomerOrder(model);
		}
		model.addAttribute("CustomerOrder", repo.findAll());
		return "displayCustomerOrder";
	}
	
	// adds a new order to database
	@GetMapping("/addNewCustomerOrder")
	public String addNewCustomerOrder(Model model) {
			CustomerOrder o = new CustomerOrder();
			model.addAttribute("newCustomerOrder", o);
			return "input";
	}
	
	// edits order pull order from database by id
	@GetMapping("/editOrder/{id}")
	public String editCustomerOrder(@PathVariable("id") long id, Model model) {
		CustomerOrder o = repo.findById(id).orElse(null);
		model.addAttribute("newOrder", o);
		return "input";
	}
	
	// updates a current order
	@PostMapping("/createCustomerOrder/{id}")
	public String updateOrder(@ModelAttribute CustomerOrder o, Model model) {
		repo.save(o);
		return viewCustomerOrder(model);
	}
	
	// deletes current order id
	@GetMapping("/deleteCustomerOrder/{id}")
	public String deleteOrder(@PathVariable("id") long id, Model model) {
		CustomerOrder o = repo.findById(id).orElse(null);
		repo.delete(o);
		return viewCustomerOrder(model);
	}
}
