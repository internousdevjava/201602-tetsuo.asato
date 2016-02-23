package jissenKadai1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JissenKadai1_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Connection conn = null;//ステートメントを作成

		try{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/testdb", "root", "mysql");

			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM test_table";
			ResultSet rs = stmt.executeQuery(sql);

			while(rs.next()){
				int id = rs.getInt("id");
				System.out.println(id);
			}
		}catch(SQLException e){
		System.	out.println("SQLException:"+ e.getMessage());
		}
	}

}
