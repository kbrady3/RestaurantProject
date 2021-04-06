
package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import dmacc.repository.MenuRepoitory;

/**
 * @author Jeremy Brannen - jrbrannen CIS175 Apr 5, 2021
 */
public class MenuController {

	@Autowired
	MenuRepoitory repo;

	// view current menus
	@GetMapping({ "displayMenu" })
	public String viewMenu(Model model) {
		if (repo.findAll().isEmpty()) {
			return viewMenu(model);
		}
		model.addAttribute("menu", repo.findAll());
		return "results";
	}

}
