package home.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class MemberDao {
	public static final String USERNAME="dy" ,PASSWORD="dy";
	public void join(MemberDto memberDto) throws Exception{
		Connection con= JdbcUtils.connect(USERNAME, PASSWORD);
		String sql="insert into value(?,?,?,to_date(?,'YYYY-MM-DD'),?,?,sysdate,0,'일반회원')";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,memberDto.getMemberId());
		ps.setString(2,memberDto.getMemberPw());
		ps.setString(3,memberDto.getMemberNick());
		ps.setString(4, memberDto.getMemberBirth());
		ps.setString(5, memberDto.getMemberEmail());
		ps.setString(6, memberDto.getMemberPhone());
		
		
		ps.execute();
		
	
		con.close();
		
	}

}
