package com.gautam.post.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gautam.post.blog.enums.BlogStatus;
import com.gautam.post.blog.models.BlogModel;

@Repository
public interface BlogRepository extends JpaRepository<BlogModel, Long> {

	void findAllByStatusNotEqualTo(BlogStatus dead);

}
