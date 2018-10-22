package com.gautam.post.blog.serviceImpls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gautam.post.blog.dtos.BlogDTO;
import com.gautam.post.blog.enums.BlogStatus;
import com.gautam.post.blog.repositories.BlogRepository;
import com.gautam.post.blog.services.BlogService;

@Service
public class BlogServiceImpl implements BlogService{

	@Autowired
	BlogRepository blogRepository;

	@Override
	public List<BlogDTO> getAllBlogs() {
		blogRepository.findAllByStatusNotEqualTo(BlogStatus.DEAD);
		return null;
	}
	
}
