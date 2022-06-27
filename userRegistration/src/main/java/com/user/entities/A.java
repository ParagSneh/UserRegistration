package com.user.entities;

public class A {
	@Entity
	@Table(name = "users")
	public class User {
	     
	    @Column(name = "verification_code", length = 64)
	    private String verificationCode;
	     
	    private boolean enabled;
	 
	    // other fields, getters and setters are not shown 
	}

}
