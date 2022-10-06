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

    public BoardRequestDto(String title, String username, String password, String contents) {
        this.title = title;
        this.username = username;
        this.password = password;
        this.contents = contents;
    }


    //@Getter
    //public class RequestRegistDto
    //private String title;
    //    private String username;
    //    private int password;
    //    private String contents;

}
