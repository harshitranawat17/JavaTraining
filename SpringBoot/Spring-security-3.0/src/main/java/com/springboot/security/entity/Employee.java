package com.springboot.security.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity
@Table(name = "Employee")

public class Employee {
	@Id
	private int id;
	private String username;
	private String password;
	private String roles;

}
