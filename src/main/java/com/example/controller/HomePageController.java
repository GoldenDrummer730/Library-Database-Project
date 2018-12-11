package com.example.demo;
	import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.domain.Borrower;
import com.example.demo.domain.FormCommand;
import com.example.demo.service.BorrowerService;

import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.domain.FormCommand;
import com.example.demo.domain.*;

@Controller
public class HomePageController {

	@Autowired
	BorrowerService borrowerService;
	
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
		//We need to add in a new borrower here from the login page
		Borrower borrower = new Borrower("1", "pass234");
		model.addAttribute("borrower", borrower);
		//model.addAttribute("dropdownSelectedValue", formCommander.getDropdownSelectedValue());
	    //model.addAttribute("name", name);
	   
        return "homePage";
	 }
	
	@GetMapping("/viewCheckedOut/{CardNo}") //Use borrowerService
	public String viewCheckedOut(@PathVariable String CardNo, @ModelAttribute Borrower borrower, Model model)
	{
		borrower = new Borrower();
		borrower.setCardNo(CardNo);
		List<CheckedOutBooks> checkedout = new ArrayList<CheckedOutBooks>();
		checkedout = borrowerService.getCheckedOut(borrower);
		model.addAttribute("checkedout", checkedout);
		return "homePage";
		
		
	}
}

