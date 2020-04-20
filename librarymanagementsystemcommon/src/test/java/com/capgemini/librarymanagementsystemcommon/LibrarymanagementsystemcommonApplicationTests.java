package com.capgemini.librarymanagementsystemcommon;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;
import com.capgemini.librarymanagementsystemcommon.dao.CommonDAO;
import com.capgemini.librarymanagementsystemcommon.dto.BookInfo;
import com.capgemini.librarymanagementsystemcommon.dto.UserInfoBean;

import junit.framework.TestCase;

@RunWith(SpringRunner.class)
@SpringBootTest
class LibrarymanagementsystemcommonApplicationTests {

	@Autowired
	private CommonDAO dao;


	@Test
	void contextLoads() {
	}

//	@Test
//	public void testRegister() {
//		UserInfoBean userInfoBean = new UserInfoBean();
//		userInfoBean.setName("kanimozhi");
//		userInfoBean.setUsername("kaniii123@gmail.com");
//		userInfoBean.setUserPassword("krishna@123");
//		userInfoBean.setRole("ROLE_ADMIN");
//		TestCase.assertTrue(dao.register(userInfoBean));
//	}
//
//	@Test
//	void testShowAllBooks() {
//		List<BookInfo> allBooks = dao.showAllBooks();
//		assertNotNull(allBooks);
//	}

	@Test
	public void testGetByBookName() {
		List<BookInfo> bookInfo = dao.getByBookName("java");
		assertEquals(1, bookInfo.size());
	}
//
//	@Test
//	void testChangePassword() {
//		UserInfoBean userInfoBean = new UserInfoBean();
//		userInfoBean.setUserId(27);
//		userInfoBean.setUserPassword("abhi@12335");
//		try {
//			boolean expectedFlag = dao.changePassword(27, "abhi@12335");
//			assertEquals(expectedFlag, userInfoBean);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//
//	}
//	
//	@Test
//	void testForgotPassword() {
//		UserInfoBean userInfoBean = new UserInfoBean();
//		userInfoBean.setUserId(27);
//		userInfoBean.setUserPassword("abhi@12335");
//		try {
//			boolean expectedFlag = dao.changePassword(27, "abhi@12335");
//			assertEquals(expectedFlag, userInfoBean);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//
//	}

}
