package data_managements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	private Connection conn;
	private Statement stat;
	private ResultSet rs;
	private int max = 0;
	public Database(){
		int score;
		try { Class.forName("org.sqlite.JDBC"); } 
		catch (ClassNotFoundException e) { e.printStackTrace(); }
		// sqlite3���� ���� database�� �ҷ��ִ� �� �׸��� �ִ밪�� �����Ѵ�.
		try { 
			conn = DriverManager.getConnection("jdbc:sqlite:C:/Users/USER/git/HamburgerGame_giga/HamburgerGame/score.db"); 
			stat = conn.createStatement();
			rs = stat.executeQuery("select * from score");
			while (rs.next()) {
				score = rs.getInt("score");
				if (max < score) {
					max = score;
				}
			}
		} 
		catch (SQLException e) { e.printStackTrace(); }
	}
	// ���� ������ �ִ� �������� ������ ����ǰ� �ְ������� ��ȯ�ȴ�.
	public int scoreSave(int score){
		if(max<score){
			max = score;
			try { stat.execute("insert into score values("+ score +")"); }
			catch (SQLException e) { e.printStackTrace(); }
		}
		return max;
	}
	// ���� �����ͺ��̽��� �ݾ��ش�.
	public void endDatabase(){
		try {
			rs.close();
		    conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
