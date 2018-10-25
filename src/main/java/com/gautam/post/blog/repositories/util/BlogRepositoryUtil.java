package com.gautam.post.blog.repositories.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gautam.post.blog.enums.BlogStatus;
import com.gautam.post.blog.models.BlogModel;
import com.gautam.post.blog.repositories.BlogRepository;

@Component
public class BlogRepositoryUtil {

	@Autowired
	BlogRepository blogRepository;
	
	public List<BlogModel> findUsersUndeadBlogs(Long userId) {
		return blogRepository.findByAuthorAndStatusNot(userId, BlogStatus.DEAD);
	}

	public List<BlogModel> getSubmitableBlogsByUserId(Long userId) {
		return blogRepository.findByAuthorOrStatusIsAndStatusNot(userId, BlogStatus.SUBMIT, BlogStatus.DEAD);
	}

	public List<BlogModel> getInReviewBlogsByUserId(Long userId) {
		return blogRepository.findByAuthorOrStatusIsAndStatusNot(userId, BlogStatus.REVIEW, BlogStatus.DEAD);
	}

	public List<BlogModel> getDeadBlogByUserId(Long userId) {
		return blogRepository.findByAuthorOrStatusIs(userId, BlogStatus.DEAD);
	}
	
	public List<BlogModel> getLiveBlogs() {
		return blogRepository.findByStatus(BlogStatus.LIVE);
	}

	public BlogModel getOne(Long id) {
		return blogRepository.getOne(id);
	}

	public void save(BlogModel model) {
		blogRepository.save(model);	
	}
}
