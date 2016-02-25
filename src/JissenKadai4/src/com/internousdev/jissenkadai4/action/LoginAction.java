package com.internousdev.jissenkadai4.action;

import java.sql.SQLException;

import com.internousdev.jissenkadai4.dao.LoginDAO;

/**
 *
 */
/**
 * @author internous
 *
 */
public class LoginAction {
	// login.jspの<s:~~~>のname属性で指定した名前とフィールド名を一致させることで、入力されてきたデータが受け取れる
	private String id;
	private String password;

	public String execute() throws SQLException {
		LoginDAO dao = new LoginDAO();
		String ret = dao.select(id, password);

		return ret;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}