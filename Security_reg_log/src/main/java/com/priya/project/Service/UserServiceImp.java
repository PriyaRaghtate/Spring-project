package com.priya.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priya.project.Model.User;
import com.priya.project.Repository.Repo;
@Service
public class UserServiceImp implements UserService{
@Autowired
	private Repo r;

	@Override
	public User saveuser(User u) {
		User u1=r.save(u);
		return u1;
	}

	
}
