package com.learn.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.learn.services.CustomUserDetailService;

@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
	
		@Autowired	
		private CustomUserDetailService customUserDetailService;
		
	    @Override
		protected void configure(HttpSecurity http) throws Exception {
			
	    	http
	    			.csrf().disable()
	    			.authorizeRequests()
	    			.antMatchers("/public/**").hasRole("NORMAL")
	    			.antMatchers("/users/**").hasRole("ADMIN")
	    			.anyRequest()
	    			.authenticated()
	    			.and()
	    			//.httpBasic();
	    			.formLogin();
	    			
		}
	
	    @Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	   
	    	auth.userDetailsService(customUserDetailService).passwordEncoder(encoder());
	 
	    }
	
	    @Bean
	    public BCryptPasswordEncoder encoder() {
	    	return new BCryptPasswordEncoder(10);
	    }
	
}
