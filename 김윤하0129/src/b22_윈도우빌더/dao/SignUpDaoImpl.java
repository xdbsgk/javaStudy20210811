package b22_윈도우빌더.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DBConnectionMgr;

// 아이디 중복확인 Implements

public class SignUpDaoImpl implements SignUpDao {
	
	private DBConnectionMgr pool;
	
	
	public SignUpDaoImpl() {
		pool = DBConnectionMgr.getInstance();
	}
	
	@Override
	public int idCheck(String id) {
		Connection con;
		PreparedStatement pstmt;
		ResultSet rs;
		String sql;
		int flag = 2;
		
		try {
			con = pool.getConnection();
			sql = "select count(user_id) from user_mst where user_id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			rs.next();
			// row의 첫번째 값 담기
			// 1: id 있음, 0: id 없음, 2: null값
			flag = rs.getInt(1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	

}
