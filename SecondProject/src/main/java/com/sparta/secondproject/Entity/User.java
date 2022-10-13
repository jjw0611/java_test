package com.sparta.secondproject.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@NoArgsConstructor //기본생성자 생성
@AllArgsConstructor //모든 컬럼이 매개변수로 들어간 생성자를 생성해줌
@Builder //필요로 하는 매개변수가 들어간 생성자를 생성해줌
@Entity
@Table(name = "users")//Entity와 매핑할 테이블 지정
public class User {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //기본키 생성을 데이터베이스에 위임
    //id값을 따로 할당하지 않아도
    //자동으로 AUTO_INCREMENT를 하여기본키 생성
    @Id
    @Column(name = "user_id")
    private Long id;

    //이름
    @Column(name = "username", nullable = false, length= 12, unique = true)
    private String username;

    //비밀번호
    @JsonIgnore
    //필드에서 무시 될 수 있는 속성을 표시하는데 사용
    //Json타입으로 보낼때 response시 보이지 않음
    @Column(name = "password", nullable = false)
    private String password;

    //id로 유저 조회시(Get) 유저가 작성한
    //게시글이랑 댓글보여주기 위해?
    @JsonIgnore
    @OneToMany(mappedBy = "user")
    //1 : 다  User : Posting
    //1명의 유저가 여러 게시글 작성가능
    //mappedBy = "user"의 의미
    //연관관계의 주인은 1 : 다인 경우 다 쪽이다
    //자신이 이 연관관계의 주인이 아님을 설정!!
    //User입장에서 Posting이 외래키임으로
    //mappedBy = "user"로 설정해주어야 User가 주인이 아님을 말해줌
    List<Posting> posting = new ArrayList<>();
    //Posting Entity를 List데이터타입으로 선언하고 객체를 생성한뒤 참조변수명을 posting으로 설정함

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    //1 : 다  User : Comment
    //1명의 유저가 여러 댓글 작성가능
    List<Comment> comments = new ArrayList<>();


}
