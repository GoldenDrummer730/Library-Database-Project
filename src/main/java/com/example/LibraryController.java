package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Book;
import com.example.demo.domain.Borrower;
import com.example.demo.service.BookService;
import com.example.demo.service.BorrowerService;
import com.example.demo.domain.FormCommand;
@Controller
public class LibraryController {
	
	@Autowired
	BookService bookService;
	BorrowerService borrowerService = new BorrowerService();
    @GetMapping("/books") //Go to localhost:8080/employees
    public String getBooks(Model model) {
    	System.out.println("inside /books");

    	List<Book> bookList = new ArrayList<Book>();
    	bookList = bookService.getBookList();
        model.addAttribute("bookList", bookList);
        return "bookLanding";
    }
    

    @GetMapping("/login")
    public String login(Model model)
    {
    	
    	return "login";
    }
    

    @RequestMapping(value = "/loginCheck", method = RequestMethod.GET) //Post data to server (results)
    public String checkLogin(HttpServletRequest request,  Model model)
    {
    	String card = request.getParameter("cardno");
    	String pass = request.getParameter("password");
    	System.out.println("in checkLogin + cardno = " + card);
    	System.out.println("password = :" + pass);
    	boolean loggedin = borrowerService.checkLogin(card, pass);
    	
    	if (loggedin == true)
    	{
    		return "bookLanding"; //If credentials correct proceed
    	}
    	else 
    	{
    		model.addAttribute("message", "Incorrect login. Try again."); //Should clear screen with message
    		return "login";
    	}
    }
    
    
    
    



}