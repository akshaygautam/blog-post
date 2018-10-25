package com.gautam.post.blog.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gautam.post.blog.dtos.BlogDTO;
import com.gautam.post.blog.exceptions.ApiException;
import com.gautam.post.blog.services.BlogService;

@RestController
@RequestMapping("/api/blog")
public class BlogController {
	
	@Autowired
	BlogService blogService;
	
	@GetMapping("/blog")
	public List<BlogDTO> getAllBlogs() {
		return blogService.getAllBlogs();
	}
	
	@PostMapping("/blog")
	public BlogDTO saveBlog(BlogDTO blog) {
		return blogService.saveBlog(blog);
	}
	
	@GetMapping("/blog/:id")
	public BlogDTO getBlogById(@PathParam(value = "id") Long id) {
		return blogService.getBlogById(id);
	}
	
	@GetMapping("/blogs/:userId/:deleted")
	public List<BlogDTO> getBlogsByUserId(@PathParam(value="userId") Long userId, 
			@PathParam(value = "deleted")Boolean deleted) {
		return blogService.getBlogsByUserId(userId,deleted);
	}
	
	@ExceptionHandler({ApiException.class})
	public void exceptionHandler() {
		throw new ApiException("Blog controller", new RuntimeException());
	}
}
