package com.gautam.post.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gautam.post.blog.models.CourseModel;

@Repository
public interface CourseRepository extends JpaRepository<CourseModel, Long> {

}
