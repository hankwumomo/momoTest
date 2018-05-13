package com.momo.webns.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  @Bean
  public UserDetailsService userDetailsService() {
	  //todo here change 
    return new com.momo.webns.service.security.SecurityManager();
	  
	  /*
	  System.out.println("ssssssssssss");
	  System.out.println("ssssssssssss2222");
	  UserDetails user =
	             User.withDefaultPasswordEncoder()
	                .username("abc")
	                .password("password")
	                .roles("USER")
	                .build();

	        return new InMemoryUserDetailsManager(user);
	        */
	  
  };
  
  @Bean
  public BCryptPasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  };
  
  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.userDetailsService(userDetailsService()).passwordEncoder(passwordEncoder());
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
	  

	  /*
	       http
            .authorizeRequests()
                .antMatchers("/", "/home").permitAll()
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
            .logout()
                .permitAll();
                */

	
	  
    http.authorizeRequests().anyRequest().hasAnyRole("ADMIN", "USER")
    .and()
    .formLogin()
    .loginPage("/login")
    .permitAll()
    .and()
    .logout().permitAll().logoutSuccessUrl("/login")
    .and()
    .csrf().disable();
    
  }
  
}
