package com.revature.reimbursement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor @EqualsAndHashCode @Getter @Setter @ToString @NoArgsConstructor
@Entity
@Table(name = "User")
public class User {
	@Id @GeneratedValue
	@Column(name = "USER_ID")
	private int UserId;
	
	@Column(name = "USER_USERNAME")
	private String username;
	
	@Column(name = "USER_PASSWORD")
	private String password;
	
	@Column(name = "USER_FIRST_NAME")
	private String firstName;
	
	@Column(name = "USER_LAST_NAME")
	private String lastName;
	
	@Column(name = "USER_EMAIL")
	private String email;
	
//	@ManyToOne
//	@JoinColumn(name = "USER_ROLE_ID")
//	UserRole userRoleId;
}
