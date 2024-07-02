package vo;

public class GuestBook {
    private Long id;
    private String contents;
    private String member_id;
    private int hit;
    private String input_date;

    public GuestBook() {}

    public GuestBook(String contents, String member_id) {
        this.contents = contents;
        this.member_id = member_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public String getInput_date() {
        return input_date;
    }

    public void setInput_date(String input_date) {
        this.input_date = input_date;
    }

    @Override
    public String toString() {
        return "GuestBook{" +
                "id=" + id +
                ", contents='" + contents + '\'' +
                ", member_id='" + member_id + '\'' +
                ", hit=" + hit +
                ", input_date='" + input_date + '\'' +
                '}';
    }
}
