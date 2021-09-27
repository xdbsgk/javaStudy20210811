package b20_�����ͺ��̽�;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DBConnectionMgr;

public class LoginDaoImpl implements LoginDao{
	private DBConnectionMgr pool;
	
	public LoginDaoImpl() {
		pool = DBConnectionMgr.getInstance();
	}
	
	// �α��� ����
	
	public int login(String id, String password) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		int flag = 0;
		
		// ����ó��
		try {
			con = pool.getConnection();
			sql = "select count(um.user_id), count(ud.user_password) from "
					+ "user_mst um "
					+ "left outer join user_mst ud on(ud.user_id = um.user_id and ud.user_password = ?)"
					+ "where um.user_id = ?";
			// sql�� mariadb�� �˾Ƶ赵�� ��ȯ������ (prepareStatement)
			// prepareStatement�� ? �ڸ��� password�� id�� set���ش�.
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, password);
			pstmt.setString(2, id);
			// ������ ������ ����� ������ (ctrl + shift + F9)
			rs = pstmt.executeQuery();
			
			// Ŀ���� BOF���� �������� �̵��Ѵ�.
			rs.next();
			// ù ���� column�� ���ڸ� ������. (count�̱� ������ int�� ���� ���)
			flag = rs.getInt(1) + rs.getInt(2);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// ���������� Ʃ�긦 �ݳ��ϴ� �۾�. freeConnection�� ���ǵǾ��ֱ� ������ ��üó���� �����ϰ� �����Ѵ�.
			pool.freeConnection(con, pstmt, rs);
		}
		
		return flag;
		
	}
	
	
	@Override
	public String getLoginUsername(String id) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		String name = null;
		
		// ����ó��
		try {
			con = pool.getConnection();
			sql = "select user_name from user_mst where user_id = ?";
			// sql�� mariadb�� �˾Ƶ赵�� ��ȯ������ (prepareStatement)
			// prepareStatement�� ? �ڸ��� password�� id�� set���ش�.
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			// ������ ������ ����� ������ (ctrl + shift + F9)
			rs = pstmt.executeQuery();
			
			// Ŀ���� BOF���� �������� �̵��Ѵ�.
			rs.next();
			// ù ���� column�� ���ڸ� ������. (count�̱� ������ int�� ���� ���)
			name = rs.getString(1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// ���������� Ʃ�긦 �ݳ��ϴ� �۾�. freeConnection�� ���ǵǾ��ֱ� ������ ��üó���� �����ϰ� �����Ѵ�.
			pool.freeConnection(con, pstmt, rs);
		}
		
		return name;
	
	}
	
	
	
	
}
