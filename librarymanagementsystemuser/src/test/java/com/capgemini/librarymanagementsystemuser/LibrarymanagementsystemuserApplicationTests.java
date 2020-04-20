package com.capgemini.librarymanagementsystemuser;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.capgemini.librarymanagementsystemuser.dao.UserDAO;
import com.capgemini.librarymanagementsystemuser.dto.BookInfo;

@RunWith(SpringRunner.class)
@SpringBootTest
class LibrarymanagementsystemuserApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private UserDAO dao;

	@Test
	public void testSearchBookName() {
		BookInfo bookInfo=new BookInfo();
		bookInfo.setBookName("java");
		bookInfo.setBookAuthor("ajay");
		List<BookInfo> books=dao.searchBook(bookInfo);
		assertEquals(1, books.size());
		
		
	}

}
