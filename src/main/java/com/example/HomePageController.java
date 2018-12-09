package com.example.demo;
	import org.springframework.stereotype.Controller;
	import com.example.demo.domain.FormCommand;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.FormCommand;

@Controller
public class HomePageController {

	@ModelAttribute("singleSelectAllValues")
	public String[] getSingleSelectAllValues()
	{
		return new String[] {
		"Entire Catalog", "Sharpstown", "South", "Carnegie",
		"Bemis", "Downtown", "Northwest"
		};
	}
	
	@GetMapping("/homePage")
 	public String homePage(@RequestParam(name="name", required=false, defaultValue="Patron") String name, Model model) {
		FormCommand formCommander = new FormCommand();
		model.addAttribute("dropdownSelectedValue", formCommander.getDropdownSelectedValue());
	    model.addAttribute("name", name);
        return "homePage";
	 }
}

