package com.jjw.FirstProject.dto;

import com.jjw.FirstProject.domain.Board;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter //get메서드 생략이여~
@NoArgsConstructor //기본 생성자 만들어 줄게연
public class BoardRequestDto {

    private String title;
    private String username;
    private String password;
    private String contents;

    //클라이언트로 받은 입력값들을 BoardRequestDto에 저장하기 위함
    public BoardRequestDto(String title, String username, String password, String contents) {
        this.title = title;
        this.username = username;
        this.password = password;
        this.contents = contents;
    }
}
