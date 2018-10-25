package com.gautam.post.blog.services;

import java.util.List;

import com.gautam.post.blog.dtos.BlogDTO;
import com.gautam.post.blog.enums.RoleName;

public interface BlogService {

	List<BlogDTO> getAllBlogs();
	
	BlogDTO saveBlog(BlogDTO blog);

	BlogDTO getBlogById(Long id);

	List<BlogDTO> getBlogsByUserId(Long userId, Boolean deleted); 

}
