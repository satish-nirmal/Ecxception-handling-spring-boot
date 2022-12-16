package com.example.exception.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Data
public class UserRequest {
	private Integer id;
	private	String name;
	private String email;
	private String mobile;
	private String gender;
	private Integer age;
	private String nationality;
	
}
