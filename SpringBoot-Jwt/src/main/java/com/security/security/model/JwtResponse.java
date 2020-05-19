package com.security.security.model;


// This is class is required for creating a response containing the JWT to be returned to the user.
// Bu class bir response içerigi oluşturmak için gereklidir.. Jwt için user doner
public class JwtResponse {

	
	private final String jwttoken;

	public JwtResponse(String jwttoken) {
		this.jwttoken = jwttoken;
	}

	public String getToken() {
		return this.jwttoken;
	}
}
