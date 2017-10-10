package kr.or.dgit.jdbc_setting;

import java.sql.Connection;

import javax.sql.rowset.JdbcRowSet;

import kr.or.dgit.jdbc_setting.jdbc.DBCon;
import kr.or.dgit.jdbc_setting.jdbc.jdbcUtil;

public class TestMain {

	public static void main(String[] args) {
		DBCon dbCon = DBCon.getInstance();
		
		Connection connection = dbCon.getConnection();
		System.out.println(connection);
		
		// DB연결에는 오랜 시간이 걸리기 때문에 수행 종료 시에 종료해주는 것이 좋음
		jdbcUtil.close(connection);
		
	}

}
