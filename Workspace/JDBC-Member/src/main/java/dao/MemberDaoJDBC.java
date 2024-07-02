package dao;

import java.util.*;
import java.sql.*;
import vo.Member;

public class MemberDaoJDBC implements MemberDao {
	
	public Long getSequence() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		ResultSet rs = null;
		
		Long sequence = null;
		
		try {
			conn = ConnectionManager.getConnection();
			sql = "select seq_member.nextval as sequence from dual";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				sequence = rs.getLong("sequence");
			}
			if (conn != null) conn.close();
			if (pstmt != null) pstmt.close();
			if (rs != null) rs.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return sequence;
	}

	@Override
	public Member saveMember(Member member) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		ResultSet rs = null;
		
		Long sequence = null;
		
		try {
			conn = ConnectionManager.getConnection();
			sql = "insert into member (id, name, gender, birth, email)"
					+ "values (?, ?, ?, ?, ?)";							// '?'로 변수가 들어갈 자리를 만들어주고 set으로 값을 넣어줌
			pstmt = conn.prepareStatement(sql);
			sequence = getSequence();
			member.setId(sequence);
			pstmt.setLong(1, member.getId());
			pstmt.setString(2, member.getName());
			pstmt.setString(3, member.getGender().name());
			pstmt.setString(4, member.getBirth());
			pstmt.setString(5, member.getEmail());
			
			pstmt.executeUpdate();
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, rs);
		}
		
		return member;
	}

	@Override
	public Member findMemberById(Long id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		ResultSet rs = null;
		Member member = null;
		
		try {
			conn = ConnectionManager.getConnection();
			sql = "select id, name, gender, birth, email from member where id = " + id;
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				String birth = rs.getString("birth");
				String email = rs.getString("email");
				
				member = new Member(id, name, gender, birth, email);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, rs);
		}
		return member;
	}

	@Override
	public List<Member> findMembers() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		ResultSet rs = null;
		List<Member> members = new ArrayList<>();
		
		try {
			conn = ConnectionManager.getConnection();
			sql = "select id, name, gender, birth, email from member";							// '*'보다는 컬럼명을 지정함으로써 컬럼 출력 순서를 지정함
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Long id = rs.getLong("id");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				String birth = rs.getString("birth");
				String email = rs.getString("email");
				members.add(new Member(id, name, gender, birth, email));
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, rs);
		}
		return members;
	}

	@Override
	public Member updateMember(Member member) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		ResultSet rs = null;
		
		try {
			conn = ConnectionManager.getConnection();
			sql = "update member set name = ?, gender = ?, birth = ?, email = ? where id = " + member.getId();							
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, member.getName());
			pstmt.setString(2, member.getGender().name());
			pstmt.setString(3, member.getBirth());
			pstmt.setString(4, member.getEmail());
			pstmt.executeUpdate();

		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, rs);
		}
		return member;
	}

	@Override
	public void removeMember(Long id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		ResultSet rs = null;
		
		try {
			conn = ConnectionManager.getConnection();
			sql = "delete from member where id = " + id;							
			pstmt = conn.prepareStatement(sql);
			
			pstmt.executeUpdate();

		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, rs);
		}
	}
	
	public void closeConnection(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			if (conn != null) conn.close();
			if (pstmt != null) pstmt.close();
			if (rs != null) rs.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
