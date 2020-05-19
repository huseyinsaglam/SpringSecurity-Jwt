package com.security.security.model;


// Bu sınıf Client dan alınan username and password için gereklidir..
public class JwtRequest {
	
	private String username;
	private String password;
	
	// Json Pars etmek için default consructor gereklidir..
	public JwtRequest()
	{
		
	}

	public JwtRequest(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
