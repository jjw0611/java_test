package com.sparta.secondproject.repository;

import com.sparta.secondproject.Entity.Posting;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostingRepository extends JpaRepository<Posting,Long> {
    List<Posting> findAllByOrderByCreatedAtDesc();
}
