package b22_���������.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DBConnectionMgr;

// ���̵� �ߺ�Ȯ�� Implements

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
			// row�� ù��° �� ���
			// 1: id ����, 0: id ����, 2: null��
			flag = rs.getInt(1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}

	@Override
	public boolean signUp(String[] values) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		
		try {
			con = pool.getConnection();
			sql = "insert into user_mst values(?,?,?,?,?,?,now(),now())";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, values[0]);
			pstmt.setString(2, values[1]);
			pstmt.setString(3, values[3]);
			pstmt.setString(4, values[4]);
			pstmt.setString(5, values[5]);
			pstmt.setInt(6, Integer.parseInt(values[7]));
			pstmt.executeUpdate();
			
			flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		
		return flag;
	}
	

}
