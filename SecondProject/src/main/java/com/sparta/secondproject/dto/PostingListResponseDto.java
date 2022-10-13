package com.sparta.secondproject.dto;

import com.sparta.secondproject.Entity.Posting;
import com.sparta.secondproject.Entity.Timestamped;
import lombok.Getter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

@Getter
@MappedSuperclass //Timestamped
@EntityListeners(AuditingEntityListener.class) //Timestamped
public class PostingListResponseDto extends Timestamped {
    private Long id;
    private String title;
    private  String content;
    private String username;
    private Long userId;

    public PostingListResponseDto(Posting posting) {
        this.id = posting.getId();
        this.title = posting.getTitle();
        this.username = posting.getUser().getUsername();
        this.userId = posting.getUser().getId();
        this.content = posting.getContent();
        this.createdAt = posting.getCreatedAt();
        this.modifiedAt = posting.getModifiedAt();
    }
}