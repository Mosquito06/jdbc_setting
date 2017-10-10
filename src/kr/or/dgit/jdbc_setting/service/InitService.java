package kr.or.dgit.jdbc_setting.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

import kr.or.dgit.jdbc_setting.dao.DatabaseDao;

public class InitService implements DbService {
	private static final InitService instance = new InitService();

	public static InitService getInstance() {
		return instance;
	}

	private InitService() {

	}

	// sql���� �ۼ��� txt ������ �ҷ����� �޼ҵ�
	@Override
	public void service() {
		File f = new File(System.getProperty("user.dir") + "\\resources\\create_sql.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(f));) {
			StringBuilder statement = new StringBuilder();
			for (String line; (line = br.readLine()) != null;) {
				if (!line.isEmpty() && !line.startsWith("--")) {
					statement.append(line.trim());
				}
				if (line.endsWith(";")) {
					//System.out.println(statement);
					DatabaseDao.getInstance().executeUpdateSQL(statement.toString());
					statement.setLength(0);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
