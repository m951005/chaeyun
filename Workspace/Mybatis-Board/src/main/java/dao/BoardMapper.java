package dao;

import java.util.List;
import vo.Board;


public interface BoardMapper {
	// 게시글 작성
	void saveBoard(Board board);
	
	// 아이디로 게시글 조회
	Board findBoardById(Long id);
	
	// 게시글 전체 조회
	List<Board> findBoards();
	
	// 검색 조건으로 게시글 조회
	List<Board> findBoardsByCondition(Board board);
	
	// 여러 아이디로 게시글 조회
	List<Board> findBoardsByIds(List<Long> ids);
	
	// 게시글 삭제
	void removeBoardByMemberId(String id);
}
