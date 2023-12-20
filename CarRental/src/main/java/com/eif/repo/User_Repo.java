package com.eif.repo;

import java.util.List;

import com.eif.data.User;

public interface User_Repo {

	List<User> findAll();

	void add(User st);

	void deleteById(int id);

	User save(User u);

	User getUser_byPhoneNumber(int num);


}
