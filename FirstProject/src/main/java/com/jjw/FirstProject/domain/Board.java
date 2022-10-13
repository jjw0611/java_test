package com.jjw.FirstProject.domain;

import com.jjw.FirstProject.dto.BoardRequestDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter //get메서드 안써요~
@Entity //테이블입니다~
@NoArgsConstructor //기본 생성자 생성!
@Builder //인스턴스를 생성자를 통해 만들지 않고 Builder라는 메서드를 사용한다
@AllArgsConstructor //모든 필드를 매개변수로 하는 매개변수 생성자를 자동으로 만들어주는 어노테이션
public class Board extends Timestamped{ //생성, 수정 시간 자동으로 알려드려용~

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    //제목
    @Column(nullable = false)
    private String title;

    //작성자명
    @Column(nullable = false)
    private String username;

    //비밀번호
    @Column(nullable = false)
    private String password;

    //작성내용
    @Column(nullable = false)
    private String contents;

    //매개변수 생성자
    //클라이언트로 부터 값을 받은 requestDto를 Board 즉, Entity에 넣어주기 위해서
    //BoardRequestDto를 매개변수로 하는 매개변수 생성자 생성0
    public Board(BoardRequestDto requestDto){
        this.title = requestDto.getTitle();
        this.password = requestDto.getPassword();
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
    }

    //update메서드
    public void update(BoardRequestDto requestDto){
        this.title = requestDto.getTitle();
        this.password = requestDto.getPassword();
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
    }

}
