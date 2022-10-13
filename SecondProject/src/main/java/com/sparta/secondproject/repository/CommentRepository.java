package com.sparta.secondproject.repository;

import com.sparta.secondproject.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {
    List<Comment> findByPostingId(Long id);
}
