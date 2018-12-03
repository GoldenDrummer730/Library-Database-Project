package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Book;
import com.example.domain.Book_Authors;
import com.example.domain.Employee;
import com.example.service.BookService;
import com.example.service.Book_AuthorService;
import com.example.service.EmployeeService;

@Controller
public class LibraryController {
	@Autowired
	Book_AuthorService authorService;

	@Autowired
	BookService bookService;

    @GetMapping("/authornames")
    public String getAuthorName(Model model) { //The model applies the business logic
    	List<Book_Authors> authorList = new ArrayList<Book_Authors>();
    	authorList = authorService.getAuthorNames();
        model.addAttribute("authorList", authorList);
        return "authorLanding";
    }

	@GetMapping("/shop")
	public String viewBooks(Model model){
		List<Book> booksList = new ArrayList<Book>();
		booksList = bookService.getAllBooks();
		model.addAttribute("booksList", booksList);
		return "booksList";
	}


}
