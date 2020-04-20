package com.capgemini.librarymanagementsystemuser.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.librarymanagementsystemuser.dto.BookInfo;
import com.capgemini.librarymanagementsystemuser.dto.BookRegister;
import com.capgemini.librarymanagementsystemuser.response.LibraryManagementSystemResponse;
import com.capgemini.librarymanagementsystemuser.service.UserService;

@RestController
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*", exposedHeaders = "Access-Control-Allow-Origin")
// @RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping(path = "/searchBook", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public LibraryManagementSystemResponse searchBook(@RequestBody BookInfo bookInfo) {
		LibraryManagementSystemResponse resp = new LibraryManagementSystemResponse();
		List<BookInfo> bookInfos = service.searchBook(bookInfo);
		if (bookInfos != null) {
			resp.setStatusCode(201);
			resp.setMessage("Successfull");
			resp.setDecription("Book Found");
			resp.setBook(bookInfos);
			;
		} else {
			resp.setStatusCode(401);
			resp.setMessage("Unsuccessfull");
			resp.setDecription("Book not found");
		}
		return resp;
	}

	@GetMapping(path = "/requestBook/{bookId}")
	public Boolean requestBook(@PathVariable("bookId") int bookId) {
		LibraryManagementSystemResponse resp = new LibraryManagementSystemResponse();
		Boolean register = service.requestBook(bookId);
		if (register != null) {
			resp.setStatusCode(201);
			resp.setMessage("Successfull");
			resp.setDecription("Book request sent");
			
		} else {
			resp.setStatusCode(401);
			resp.setMessage("Unsuccessfull");
			resp.setDecription("Book request not sent");
		}
		return register;
	}

	// @PostMapping("/requestBook")
	// public Issue requestBook(@RequestBody BookInfo book, int userId) {
	//
	// LibraryManagementSystemResponse response = new
	// LibraryManagementSystemResponse();
	// Issue req = service.requestBook(book, userId);
	//
	// if (req != null) {
	// response.setStatusCode(201);
	// response.setMessage("success");
	// } else {
	// response.setStatusCode(404);
	// response.setMessage("failed");
	// }
	// return req;
	// }// end of requestBook
	//
	// @PostMapping("/borrow")
	// public boolean borrow(int userId, String bookName) {
	// LibraryManagementSystemResponse response = new
	// LibraryManagementSystemResponse();
	// boolean issue = service.borrow(userId, bookName);
	//
	// if (issue) {
	// response.setStatusCode(201);
	// response.setMessage("success");
	// } else {
	// response.setStatusCode(404);
	// response.setMessage("failed");
	// }
	// return issue;
	// }

}
