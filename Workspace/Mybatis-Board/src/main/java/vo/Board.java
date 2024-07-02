package vo;

public class Board {
	private Long id;						// 게시물 일련번호
	private String title;					// 제목
	private String contents;				// 내용
	private Member member;					// 작성자 정보
	private String createdTime;				// 작성일
	private String lastModifiedTime;		// 수정일
	
	// 기본 생성자
	public Board() {}
	
	// 생성자
	public Board(String title, String contents, Member member) {
		this.title = title;
		this.contents = contents;
		this.member = member;
	}

	// getter, setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public String getLastModifiedTime() {
		return lastModifiedTime;
	}

	public void setLastModifiedTime(String lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

	// toString
	@Override
	public String toString() {
		return "Board [id=" + id + ", title=" + title + ", contents=" + contents + ", member=" + member
				+ ", createdTime=" + createdTime + ", lastModifiedTime=" + lastModifiedTime + "]";
	}
}
