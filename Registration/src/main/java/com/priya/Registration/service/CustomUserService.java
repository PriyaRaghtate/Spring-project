package com.priya.Registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.priya.Registration.model.User;
import com.priya.Registration.repository.repo;

public class CustomUserService implements UserDetailsService{
	@Autowired
	private repo r;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User u=r.findByEmail(username);
		if(u==null) {
			 throw new UsernameNotFoundException("User not found");
		}
		return new CustomeUser(u);
	}

}
