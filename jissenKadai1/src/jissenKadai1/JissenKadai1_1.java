package jissenKadai1;

import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class JissenKadai1_1 {

	public static void main(String[] args) {
		String msg = "";
		try {
			new Driver();
			msg = "ドライバのロードに成功しました";

		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			msg = "ドライバのロードに失敗しました";
		}
		System.out.println(msg);
	}
}