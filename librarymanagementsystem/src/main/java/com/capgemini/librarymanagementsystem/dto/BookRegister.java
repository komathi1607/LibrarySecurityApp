package com.capgemini.librarymanagementsystem.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "bookRegister_info")
public class BookRegister implements Serializable{
	@Id
	@Column
	@GeneratedValue
	private int registerId;
	@Column
	private int bookId;
	@Column
	private int userId;
	@Column(nullable = false)
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date registerDate;
	
//	@Exclude
//	@ManyToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="userId",referencedColumnName="userId",insertable=false,updatable=false)
//	private UserInfoBean users;
//	
//	@ManyToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="bookId",referencedColumnName="bookId",insertable=false,updatable=false)
//	private BookInfo books;

}