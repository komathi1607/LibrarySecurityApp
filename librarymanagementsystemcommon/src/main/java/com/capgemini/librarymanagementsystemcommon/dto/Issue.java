package com.capgemini.librarymanagementsystemcommon.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name = "issue_info")
public class Issue implements Serializable {
	@Id
	@Column
	@GeneratedValue
	private int issueId;
	@Column
	private int registerId;
	@Column(nullable = false)
	@JsonFormat(pattern = "dd-MM-yyyy")	
	private LocalDate issueDate;
	@Column(nullable = false)
	@JsonFormat(pattern = "dd-MM-yyyy")	
	private LocalDate returnDate;
	@Column
	private double fine;

	@Exclude
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId", referencedColumnName = "userId", insertable = false, updatable = false)
	private UserInfoBean users;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bookId", referencedColumnName = "bookId", insertable = false, updatable = false)
	private BookInfo books;

}
