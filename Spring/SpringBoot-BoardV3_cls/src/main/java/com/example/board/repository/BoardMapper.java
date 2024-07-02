package com.example.board.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.board.model.board.Board;

@Mapper
public interface BoardMapper {
	void saveBoard(Board board);
	List<Board> findAllBoards();
    Board findBoard(Long board_id);
    void updateBoard(Board updateBoard);
    void removeBoard(Long board_id);
}