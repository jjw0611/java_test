package com.jjw.FirstProject.controller;

import com.jjw.FirstProject.domain.Board;
import com.jjw.FirstProject.dto.BoardRequestDto;
import com.jjw.FirstProject.dto.BoardResponseDto;
import com.jjw.FirstProject.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class BoardController {

    private final BoardService boardService;
    //@RequiredArgsConstructor없을시 원래는 이런식으로 생성자를 생성했어야 한다
    //public BoardController(BoardRepository boardRepository){
    //  this.boardRepository = boardRepository;
    //}

    //전체 게시글 조회
    @GetMapping("/api/boards")
    public List<Board> readBoardList(){
        return boardService.getBoards();
    }

    //게시글 작성(리턴값 boolean)
    //저장이 되었는지 안되었는지만 false, true로만 확인!!
    //@PostMapping("/api/boards")
    //public boolean createBoard(@RequestBody BoardRequestDto boardRequestDto){
    //    if(boardService.postBoard(boardRequestDto)){
    //        return true;
    //    }
    //}

    //게시글 작성
    //리턴값이 responseDto인 이유 : 명세서를 보았을때 response값이 arc를 통해 보여지게 하기 위해서!
    //그냥 시발 responseDto형식의 데이터를 출력하기 위해서야 시팔
    @PostMapping("/api/boards")
    public BoardResponseDto createBoard(@RequestBody BoardRequestDto boardRequestDto){
        return boardService.postBoard(boardRequestDto);
    }

    //게시글 조회
    @GetMapping("/api/boards/{id}")
    public Board getBoard(@PathVariable Long id){
        return boardService.getBoardOne(id);
    }

    //게시글 비밀번호 확인
    @PostMapping("/api/boards/{id}")
    public boolean passwordcheck(@PathVariable Long id, @RequestBody HashMap<String,String> password){
        String pw = password.get("password"); //get(key)의 의미 : key에 맞는 value값을 반환하는 메서드 HashMap내장 함수
        return boardService.checkPasswordOne(id,pw);
    }

    //게시글 수정
    @PutMapping("/api/boards/{id}")
    public Board updateBoard(@PathVariable Long id, @RequestBody BoardRequestDto boardRequestDto){
        Long id2 = boardService.update(id, boardRequestDto);
        return boardService.getBoardOne(id2);
    }

    //게시글 삭제
    @DeleteMapping("/api/boards/{id}")
    public void deleteBoard(@PathVariable Long id){
        boardService.deleteBoardOne(id);
    }


}
