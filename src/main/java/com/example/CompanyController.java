package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.Employee;
import com.example.demo.service.EmployeeService;

@Controller
public class CompanyController {
	
	@Autowired
	EmployeeService employeeService;

    @GetMapping("/employees") //Go to localhost:8080/employees
    public String getEmployees(Model model) {
    	System.out.println("inside /employees");
    	List<Employee> empList = new ArrayList<Employee>();
    	empList = employeeService.getEmpList();
        model.addAttribute("empList", empList);
        return "empLanding";
    }
    
    @GetMapping("/editEmployee/{ssn}")
    public String editEmployee(@PathVariable String ssn, @ModelAttribute Employee employee, Model model) {
    	employee = new Employee();
    	employee.setSsn(ssn);
    	System.out.println("before getEmployee"+employee);
    	
    	employee = employeeService.getEmployee(employee);
        
    	System.out.println("after getEmployee"+employee);
    	
    	model.addAttribute("employee", employee);
        
        return "editEmployee";
    }
    
    @RequestMapping(value = "/updateEmployee", method = RequestMethod.POST) //Post data to the server (go to page)
    public String updateEmployee(@ModelAttribute Employee employee, Model model) {
    	
    	employeeService.updateEmployee(employee);
    	model.addAttribute("message", "success. employee updated.");
        
        return "editEmployee";
    }



}