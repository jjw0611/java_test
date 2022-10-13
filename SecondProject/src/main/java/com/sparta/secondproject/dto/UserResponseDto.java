package com.sparta.secondproject.dto;

import com.sparta.secondproject.Entity.User;
import lombok.Getter;

@Getter
public class UserResponseDto {
    private final Long id;
    private final String username;

    //User를 파라미터로 하는 매개변수 생성자 생성
    public UserResponseDto(User user){
        this.id = user.getId();
        this.username = user.getUsername();
    }

}
