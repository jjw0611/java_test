package com.jjw.FirstProject.controller;

import com.jjw.FirstProject.domain.Board;
import com.jjw.FirstProject.dto.BoardRequestDto;
import com.jjw.FirstProject.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    //게시글 작성
    @PostMapping("/api/boards")
    public Board createBoard(@RequestBody BoardRequestDto boardRequestDto){
        Board board = new Board(boardRequestDto);
        return boardService.postBoard(board);
    }

    //게시글 조회
    @GetMapping("/api/boards/{id}")
    public Board getBoard(@PathVariable Long id){
        return boardService.getBoardOne(id);
    }

    //게시글 비밀번호 확인
    @PostMapping("/api/boards/{id}")
    public boolean passwordcheck(@PathVariable Long id, @RequestBody String password){
        return boardService.checkPasswordOne(id,password);
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
