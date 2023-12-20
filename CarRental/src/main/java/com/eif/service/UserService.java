package com.eif.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.eif.data.User;
import com.eif.repo.User_Repo;

@Service
public class UserService {


	@Autowired
	private User_Repo us;
	public List<User> getUsers(){
		return us.findAll();
	}
	
	public User getUser_byName(String name) {
		return null;
	}
	
	
	public void addUser(User us) {
		us.add(us);
	}

@DeleteMapping
public void delete (int id) {
		us.deleteById(id);
	}

	public User saveUser(User u) {
		return us.save(u);
		
	}

	public User getUser_byPhoneNumber(int num) {
		// TODO Auto-generated method stub
		return us.getUser_byPhoneNumber(num);
	}

	public User getUser_byAddress(String address) {
		// TODO Auto-generated method stub
		return null;
	}



	public User getUser_byDOB(int dOB) {
		// TODO Auto-generated method stub
		return null;
	}

}
	
