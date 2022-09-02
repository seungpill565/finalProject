package com.spring.jj9.request.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jj9.dto.Category;
import com.spring.jj9.request.mapper.RequestMapper;

@Service
public class RequestServiceImpl implements RequestService {
	
	@Autowired
	RequestMapper mapper;
	
	@Override
	public List<Category> getMainCategories() {
		
		return mapper.getMainCategories();
	}
	
	@Override
	public List<Category> getSubCateByMain(String cate_main) {
		
		return mapper.getSubCateByMain(cate_main);
	}
}
