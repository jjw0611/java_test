package com.jjw.FirstProject.repository;

import com.jjw.FirstProject.domain.Board;
import com.jjw.FirstProject.dto.BoardRequestDto;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;
import java.util.List;

//<enitiy, id의 데이터타입>
public interface BoardRepository extends JpaRepository<Board, Long> {
    List<Board> findAllByOrderByModifiedAtDesc();

//    void delete(Long id);
}
