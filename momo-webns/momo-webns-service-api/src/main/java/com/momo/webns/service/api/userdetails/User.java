package com.momo.webns.service.api.userdetails;


import org.springframework.security.core.userdetails.UserDetails;

public interface User extends UserDetails {
	
	 public String getUsername();
	 public String getPassword();
	 public String[] getRoles();

}
