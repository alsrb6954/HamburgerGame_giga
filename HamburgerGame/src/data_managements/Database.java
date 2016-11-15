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
		// sqlite3으로 만든 database를 불러주는 곳 그리고 최대값을 저장한다.
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
	// 들어온 점수가 최대 점수보다 높으면 저장되고 최고점수가 반환된다.
	public int scoreSave(int score){
		if(max<score){
			max = score;
			try { stat.execute("insert into score values("+ score +")"); }
			catch (SQLException e) { e.printStackTrace(); }
		}
		return max;
	}
	// 열린 데이터베이스를 닫아준다.
	public void endDatabase(){
		try {
			rs.close();
		    conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
