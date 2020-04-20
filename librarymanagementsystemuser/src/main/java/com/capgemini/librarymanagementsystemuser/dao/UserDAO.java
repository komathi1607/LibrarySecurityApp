package com.capgemini.librarymanagementsystemuser.dao;

import java.util.List;

import com.capgemini.librarymanagementsystemuser.dto.BookInfo;
import com.capgemini.librarymanagementsystemuser.dto.Issue;

public interface UserDAO {

	public List<BookInfo> searchBook(BookInfo bookInfo);

	public Boolean requestBook(int bookId);

//	public Issue requestBook(BookInfo book, int userId);
//
//	public boolean borrow(int userId, String bookName);

	// public boolean book(BookInfo bookInfo);

}
