package com.sparta.secondproject.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "posting")
public class Posting extends Timestamped {

    //게시글 번호
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "posting_id")
    private Long id;

    //게시글 제목
    @Column(nullable = false)
    private String title;

    //게시글 내용
    @Column(nullable = false)
    private String content;

    @ManyToOne
    //다 : 1 Posting : User
    @JoinColumn(name = "userId")
    private User user;
    //User의 userId 컬럼을 조인하겠다
    //userId가 외래키가 된다

    @JsonIgnore
    @OneToMany(mappedBy = "posting")
    List<Comment> comments = new ArrayList<>();

    // 게시글 생성 시
    public Posting(PostingRequestDto requestDto, User user){
        this.title = requestDto.getTitle();
        this.content = requestDto.getContent();
        this.user = user;
    }

    // 게시글 수정
    public void updatePost(PostingRequestDto requestDto){
        this.title = requestDto.getTitle();
        this.content = requestDto.getContent();
    }

}
