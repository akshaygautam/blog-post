package com.gautam.post.blog.repositories.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gautam.post.blog.models.User;
import com.gautam.post.blog.repositories.UserRepository;

@Component
public class UserRepositoryUtil {
	@Autowired
	UserRepository userRepository;

	public User getOne(Long userId) {
		userRepository.getOne(userId);
		return null;
	}
}
