package com.gautam.post.blog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gautam.post.blog.dtos.BlogDTO;
import com.gautam.post.blog.exceptions.ApiException;
import com.gautam.post.blog.services.BlogService;

@RestController
@RequestMapping("/api/blog")
public class BlogController {
	
	@Autowired
	BlogService blogService;
	
	public List<BlogDTO> getAllBlogs() {
		return blogService.getAllBlogs();
	}
	
	@ExceptionHandler({ApiException.class})
	public void exceptionHandler() {
		throw new ApiException("Blog controller", new RuntimeException());
	}
}
