package com.ecankurban.deneme.repo;

import java.util.List;

import com.ecankurban.deneme.model.User;

public interface UserRepostory {
	

	List<User> findAll();
	User findOwnerById(Long id);
	List<User> findByLastName(String lastname);

}
