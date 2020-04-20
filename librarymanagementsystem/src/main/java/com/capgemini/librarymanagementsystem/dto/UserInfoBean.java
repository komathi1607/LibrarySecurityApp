package com.capgemini.librarymanagementsystem.dto;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.springframework.web.bind.annotation.CrossOrigin;
import lombok.Data;

@Data
@Entity
@Table(name = "user_info")
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*", exposedHeaders = "Access-Control-Allow-Origin")
public class UserInfoBean implements Serializable {

	@Id
	@GeneratedValue
	@Column
	private int userId;

	@Column
	@Pattern(regexp = "[a-zA-Z]*")
	@Size(min = 3, max = 30, message = "User Name should be greater than 3 and should be less than 20")
	private String name;

	@NotNull
	@Column(unique = true)
	@Pattern(regexp = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$",
	message = "Invalid Email!! should contain atleast one uppercase,lowercase,digits")
	private String username;

	@NotNull
	@Column
//	@Pattern(regexp = "^(?=.[A-Za-z])(?=.\\d)(?=.[@$!%#?&])[A-Za-z\\d@$!%*#?&]{8,}$")
	@Size(min = 8, max = 20,message = "Mismatch Pattern!! should contain atleast one uppercase,lowercase,digits and special character")
	private String userPassword;

	@NotNull
	@Column
	@Pattern(regexp = "[a-zA-Z]*")
	private String role;

	// @Exclude
	// @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	// private Collection<BookInfo> bookInfo;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
	private Collection<Issue> issue;

}
