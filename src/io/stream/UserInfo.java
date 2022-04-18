package io.stream;

public class UserInfo {

	private String name;
	private String email;

	public UserInfo(User user) {
		this.name = user.getName();
		this.email = user.getEmail();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", email=" + email + "]";
	}

}
