package com.spring.jj9.category.service;

import java.util.List;

import com.spring.jj9.dto.Category;
import com.spring.jj9.dto.TalentAll;

public interface CategoryService {

	public List<Category> readCategory();
	
	public List<TalentAll> readTalentById(int id);
}
