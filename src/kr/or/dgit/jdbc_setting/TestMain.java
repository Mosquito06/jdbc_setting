package kr.or.dgit.jdbc_setting;

import java.sql.Connection;

import javax.sql.rowset.JdbcRowSet;

import kr.or.dgit.jdbc_setting.jdbc.DBCon;
import kr.or.dgit.jdbc_setting.jdbc.jdbcUtil;
import kr.or.dgit.jdbc_setting.service.DbService;
import kr.or.dgit.jdbc_setting.service.InitService;

public class TestMain {

	public static void main(String[] args) {
		DBCon dbCon = DBCon.getInstance();
		
		Connection connection = dbCon.getConnection();
		System.out.println(connection);
		
		DbService service = InitService.getInstance();
		service.service();
				
		
		
		// DB���ῡ�� ���� �ð��� �ɸ��� ������ ���α׷� ���� �ÿ� ������ ���� �ִ� ���� ����
		jdbcUtil.close(connection);
		
		
	}

}
