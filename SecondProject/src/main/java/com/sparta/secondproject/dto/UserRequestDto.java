package com.sparta.secondproject.dto;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDto {

    @NotNull //Null을 허용하지 않음
    private String username;

    @NotNull
    private String password;

    @NotNull
    private String passwordCheck;


}
