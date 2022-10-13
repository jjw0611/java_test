package com.jjw.FirstProject.service;

import com.jjw.FirstProject.domain.Board;
import com.jjw.FirstProject.dto.BoardRequestDto;
import com.jjw.FirstProject.dto.BoardResponseDto;
import com.jjw.FirstProject.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor //final이 붙은 필드 생성자 만들어드려욘
@Service //서비스 클래스라고 명시하는 거에용
public class BoardService {

    private final BoardRepository boardRepository;

    //전체 게시글 목록 조회
    //제목, 작성자명, 작성 내용, 작성 날짜, (비밀 번호)
    //작성 날짜 기준으로 내림차순
    //리턴타입이 List<Board>인 이유 : 모든 데이터를 보여주어야 하기때문에!
    public List<Board> getBoards() {
        return boardRepository.findAllByOrderByModifiedAtDesc();
    }

    //게시글 작성
    //리턴값이 boolean일 경우
    //저장이 되었는가 안되었는가를 확인!
   /* @Transactional
    public boolean postBoard(BoardRequestDto boardRequestDto){
        Board board = new Board(boardRequestDto);
        if(boardRepository.save(board)){
            return true;
        }
        return false;
    }*/

    //게시글 작성
    @Transactional
    public BoardResponseDto postBoard(BoardRequestDto boardRequestDto) {
        //입력받은 데이터가 들어있는 BoardRequestDto를 Board 즉 entitiy에 저장!
        //아래의 board는 boardRequestDto의 데이터를 담은 것에 불과!
        //Board board = new Board(boardRequestDto);

        //DB에 Board 즉, entity 저장! 찐으로 DB에 저장된 값
        //boardRepository.save(board);

        Board board = boardRepository.save(new Board(boardRequestDto));
        //저장된 board를 responseDto에 넣어서 리턴!
        BoardResponseDto boardResponseDto = new BoardResponseDto(board); //우리는 DB에 저장된 entitiy 즉, board가 필요해!
        return boardResponseDto;
    }


    //게시글 조회;
    //제목, 작성자명, 작성 내용, 작성 날짜 조회
    //@Transactional
    public Board getBoardOne(Long id) {
        return boardRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 id가 존재하지 않습니다.")
        );
    }

    //게시글 삭제
    @Transactional
    public void deleteBoardOne(Long id) {
        boardRepository.delete(Board.builder().id(id).build());
    }

    //게시글 비밀번호 확인
    public boolean checkPasswordOne(Long id, String password) {
        Board board = boardRepository.findById(id).get();
        if (!password.equals(board.getPassword())) {
            return false;
        }
        return true;
    }


    //게시글 수정
    @Transactional
    public Long update(Long id, BoardRequestDto requestDto) {
        Board board = boardRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 id가 존재하지 않습니다.")
        );
        board.update(requestDto);
        return board.getId();
    }

    //

}
