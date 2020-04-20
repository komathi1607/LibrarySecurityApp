package com.capgemini.librarymanagementsystemcommon.dao;

import java.util.List;
import com.capgemini.librarymanagementsystemcommon.dto.BookInfo;
import com.capgemini.librarymanagementsystemcommon.dto.UserInfoBean;

public interface CommonDAO {
	public boolean register(UserInfoBean bean);

	public boolean changePassword(int userId, String password);

	public boolean forgotPassword(int userId, String password);

	public List<BookInfo> showAllBooks();

	public List<BookInfo> getByBookName(String name);
}
