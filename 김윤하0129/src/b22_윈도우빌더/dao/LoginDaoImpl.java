package b22_윈도우빌더.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DBConnectionMgr;

public class LoginDaoImpl implements LoginDao{
	private DBConnectionMgr pool;

	public LoginDaoImpl() {
		pool = DBConnectionMgr.getInstance();
	}

	// 로그인 로직

	public int login(String id, String password) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		int flag = 0;

		// 예외처리
		try {
			con = pool.getConnection();
			sql = "select count(um.user_id), count(ud.user_password) from "
					+ "user_mst um "
					+ "left outer join user_mst ud on(ud.user_id = um.user_id and ud.user_password = ?)"
					+ "where um.user_id = ?";
			// sql을 mariadb가 알아듣도록 변환시켜줌 (prepareStatement)
			// prepareStatement가 ? 자리에 password와 id를 set해준다.
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, password);
			pstmt.setString(2, id);
			// 쿼리를 실행해 결과를 가져옴 (ctrl + shift + F9)
			rs = pstmt.executeQuery();

			// 커서가 BOF에서 다음으로 이동한다.
			rs.next();
			// 첫 번 column의 숫자를 가져옴. (count이기 때문에 int형 변수 사용)
			flag = rs.getInt(1) + rs.getInt(2);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 마지막으로 튜브를 반납하는 작업. freeConnection이 정의되어있기 때문에 객체처리로 간단하게 정리한다.
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

		// 예외처리
		try {
			con = pool.getConnection();
			sql = "select user_name from user_mst where user_id = ?";
			// sql을 mariadb가 알아듣도록 변환시켜줌 (prepareStatement)
			// prepareStatement가 ? 자리에 password와 id를 set해준다.
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			// 쿼리를 실행해 결과를 가져옴 (ctrl + shift + F9)
			rs = pstmt.executeQuery();

			// 커서가 BOF에서 다음으로 이동한다.
			rs.next();
			// 첫 번 column의 숫자를 가져옴. (count이기 때문에 int형 변수 사용)
			name = rs.getString(1);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 마지막으로 튜브를 반납하는 작업. freeConnection이 정의되어있기 때문에 객체처리로 간단하게 정리한다.
			pool.freeConnection(con, pstmt, rs);
		}

		return name;

	}




}