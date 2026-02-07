package com.ajay.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@Id
	@GeneratedValue(generator = "gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "gen", sequenceName = "pri_val", allocationSize = 1, initialValue = 1)
	private Integer id;
	private String email;
	private String pwd;
	private String role;
<<<<<<< HEAD
	private Integer ntg;
=======
	private String name;
>>>>>>> 33c65d67f45a97b0a4e5296a0ce22cc88588acf8
}
