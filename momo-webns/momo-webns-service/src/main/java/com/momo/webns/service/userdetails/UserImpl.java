package com.momo.webns.service.userdetails;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

import com.momo.webns.service.api.userdetails.User;

public class UserImpl implements User {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5111851564887314046L;
	
	
	
	private String username;
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

	public String[] getRoles() {
		return roles;
	}

	public void setRoles(String[] roles) {
		this.roles = roles;
	}

	private String password;
	  private String[] roles;

	  public UserImpl(String username, String password, String... roles) {
	    this.username = username;
	    this.password = password;
	    this.roles = roles;
	  }

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	

}
