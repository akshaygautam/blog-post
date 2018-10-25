package com.gautam.post.blog.serviceImpls.utils;

import org.modelmapper.ModelMapper;

import com.gautam.post.blog.dtos.BlogDTO;
import com.gautam.post.blog.models.BlogModel;

public class BlogServiceUtil {
	private ModelMapper mapper = new ModelMapper();
	
	public boolean valid(BlogDTO blog) {
		// TODO Auto-generated method stub
		return false;
	}

	public BlogDTO convertModelToDTO(BlogModel model) {
		BlogDTO dto = new BlogDTO();
		mapper.map(model, dto);
		return dto;
	}
	
	public BlogModel convertDTOToModel(BlogDTO dto) {
		BlogModel model = new BlogModel();
		mapper.map(dto, model);
		return model;
	}

}
