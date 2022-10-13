package com.sparta.secondproject.dto;


import com.sparta.secondproject.Entity.Comment;
import com.sparta.secondproject.Entity.Timestamped;
import lombok.Getter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

@Getter
@MappedSuperclass //Timestamped
@EntityListeners(AuditingEntityListener.class) //Timestamped
public class CommentResponseDto extends Timestamped {
    private Long id;
    private  String content;
    private Long userId;
    private String username;

    public CommentResponseDto(Comment comment) {
        this.id = comment.getId();
        this.userId = comment.getUser().getId();
        this.username =comment.getUser().getUsername();
        this.content = comment.getContent();
        this.createdAt = comment.getCreatedAt();
        this.modifiedAt = comment.getModifiedAt();
    }
}
