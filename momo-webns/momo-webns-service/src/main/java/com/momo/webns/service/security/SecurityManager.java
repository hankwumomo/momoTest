package com.momo.webns.service.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.momo.webns.service.userdetails.UserImpl;

public class SecurityManager implements UserDetailsService {

	@Override
	  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

	    //todo change connect to db
		UserDetails user = findUserbyUername(username);

	    UserBuilder builder = null;
	    if (user != null) {
	      builder = org.springframework.security.core.userdetails.User.withUsername(username);
	      builder.password(new BCryptPasswordEncoder().encode(user.getPassword()));
	      builder.roles(((UserImpl) user).getRoles());
	    } else {
	      throw new UsernameNotFoundException("User not found.");
	    }

	    return builder.build();
	  }

	  private UserDetails findUserbyUername(String username) {
		  
	    if(username.equalsIgnoreCase("admin")) {
	      return (UserDetails)(new UserImpl(username, "admin123", "ADMIN"));
	    }
	    
	    return null;
	    
	  }

}
