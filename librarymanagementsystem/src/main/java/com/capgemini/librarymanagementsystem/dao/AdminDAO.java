package com.capgemini.librarymanagementsystem.dao;

import com.capgemini.librarymanagementsystem.dto.UserInfoBean;

public interface AdminDAO {

	public UserInfoBean getUser(String userName);
	
}
