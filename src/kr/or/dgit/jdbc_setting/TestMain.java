package kr.or.dgit.jdbc_setting;

import java.sql.Connection;

import javax.sql.rowset.JdbcRowSet;

import kr.or.dgit.jdbc_setting.jdbc.DBCon;
import kr.or.dgit.jdbc_setting.jdbc.jdbcUtil;
import kr.or.dgit.jdbc_setting.service.DbService;
import kr.or.dgit.jdbc_setting.service.ExportService;
import kr.or.dgit.jdbc_setting.service.ImportService;
import kr.or.dgit.jdbc_setting.service.InitService;

public class TestMain {

	public static void main(String[] args) {
		DBCon dbCon = DBCon.getInstance();
		
		Connection connection = dbCon.getConnection();
		System.out.println(connection);
		
		DbService service = InitService.getInstance();
		service.service();
				
		/*service = ImportService.getInstance();
		service.service();
		
		service = ExportService.getInstance();
		service.service();
		
		// DB연결에는 오랜 시간이 걸리기 때문에 프로그램 종료 시에 연결을 끊어 주는 것이 좋음
		jdbcUtil.close(connection);*/
		
		
	}

}
