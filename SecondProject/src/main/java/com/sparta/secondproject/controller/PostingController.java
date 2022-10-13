package com.sparta.secondproject.controller;

import com.sparta.secondproject.dto.PostingListResponseDto;
import com.sparta.secondproject.dto.PostingRequestDto;
import com.sparta.secondproject.dto.PostingResponseDto;
import com.sparta.secondproject.security.UserDetailsImpl;
import com.sparta.secondproject.service.PostingService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostingController {

    private final PostingService postingService;

    // 게시글 작성
    @PostMapping("/auth/postings")
    public PostingResponseDto createPosing(@RequestBody PostingRequestDto requestDto, @AuthenticationPrincipal UserDetailsImpl userDetails){
        return postingService.createPost(requestDto,userDetails.getUser());
    }

    // 게시글 목록 조회
    @GetMapping("/postings")
    public List<PostingListResponseDto> getPostingList(){
        return postingService.getPostList();
    }

    // 특정 게시글 조회
    @GetMapping("/postings/{id}")
    public PostingResponseDto getPosting(@PathVariable Long id){
        return postingService.getPost(id);
    }

    // 게시글 수정
    @PutMapping("/auth/postings/{id}")
    public PostingResponseDto updatePosing(@RequestBody PostingRequestDto requestDto,@PathVariable Long id, @AuthenticationPrincipal UserDetailsImpl userDetails){
        return postingService.updatePost(requestDto,id,userDetails.getUser());
    }

    // 게시글 삭제
    @DeleteMapping ("/auth/postings/{id}")
    public String deletePosting(@PathVariable Long id, @AuthenticationPrincipal UserDetailsImpl userDetails){
        return postingService.deletePost(id, userDetails.getUser());
    }


}
