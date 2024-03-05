package com.demo.blogApp.payloads;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CategoryDto {

	
	private int categoryId;
	
	@NotBlank
	@Size(min = 4)
	private String categoryTitle;
	
	@NotBlank
	private String categoryDescription;
	
}