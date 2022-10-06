package com.jjw.FirstProject.service;

import com.jjw.FirstProject.domain.Board;
import com.jjw.FirstProject.dto.BoardRequestDto;
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
    //@Transactional
    public  List<Board> getBoards(){
        return boardRepository.findAllByOrderByModifiedAtDesc();
    }

    //게시글 작성
    //리턴타입이 Board인 이유 : 하나씩 입력하기 때문에
    @Transactional
    public Board postBoard(Board board){
        return boardRepository.save(board);
    }

    //게시글 조회l,
    //제목, 작성자명, 작성 내용, 작성 날짜 조회
    //@Transactional
    public Board getBoardOne(Long id){
        return boardRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 id가 존재하지 않습니다.")
        );
    }

    //게시글 삭제
    @Transactional
    public void deleteBoardOne(Long id){
        boardRepository.delete(Board.builder().id(id).build());
    }

    //게시글 비밀번호 확인
    public boolean checkPasswordOne(Long id,String password){
        Board board = boardRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 id가 존재하지 않습니다.")
        );
        return password.equals(board.getPassword());
    }


    //게시글 수정
    @Transactional
    public Long update(Long id, BoardRequestDto requestDto){
        Board board = boardRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 id가 존재하지 않습니다.")
        );
        board.update(requestDto);
        return board.getId();
    }

    //

}
