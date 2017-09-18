package cn.smj.model;

public class User {
	private int index;
	private String username;
	private String password;

	public User(int id, String username, String password) {
		// super();
		this.index = id;
		this.username = username;
		this.password = password;
	}

	public User() {
		// super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return index;
	}

	public void setId(int id) {
		this.index = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + index + ", username=" + username + ", password=" + password + "]";
	}

}
