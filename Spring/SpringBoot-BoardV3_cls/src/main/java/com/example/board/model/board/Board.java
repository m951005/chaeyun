package com.example.board.model.board;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Board {
	private Long board_id; //게시물 아이디
	private String title; //글 제목
	private String contents; //내용
	private String member_id; //작성자
	private Long hit; //조회수
	private LocalDateTime created_time; //작성일
	
	public void addHit() {
		this.hit++;
	}
}
