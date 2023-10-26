package com.priya.Registration.service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.priya.Registration.model.User;

public class CustomeUser implements UserDetails {
	 	private User u;
	 	public CustomeUser(User u) {
	 		this.u=u;
	 	}
		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public String getPassword() {
			// TODO Auto-generated method stub
			return u.getPass();
		}
		@Override
		public String getUsername() {
			// TODO Auto-generated method stub
			return u.getEmail();
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
		public String getName() {
			return u.getName();
		}

}
