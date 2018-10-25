package com.gautam.post.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gautam.post.blog.enums.BlogStatus;
import com.gautam.post.blog.models.BlogModel;

@Repository
public interface BlogRepository extends JpaRepository<BlogModel, Long> {

	List<BlogModel> findByAuthorAndStatusNot(Long userId, BlogStatus status);

	List<BlogModel> findByStatus(BlogStatus status);

	List<BlogModel> findByAuthorOrStatusIs(Long userId, BlogStatus submit);

	List<BlogModel> findByAuthorAndStatusIs(Long userId, BlogStatus status);

	List<BlogModel> findByAuthorOrStatusIsAndStatusNot(Long userId, BlogStatus status, BlogStatus dead);

}
