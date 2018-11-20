package com.gautam.post.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gautam.post.blog.models.SubjectModel;

@Repository
public interface SubjectRepository extends JpaRepository<SubjectModel, Long> {

}
