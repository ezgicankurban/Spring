package com.ecankurban.deneme.repo;

import java.util.List;

import com.ecankurban.deneme.model.Owner;

public interface OwnerRepostory {

	
	List<Owner> findAll();
	Owner findOwnerById(Long id);
	List<Owner> findByLastName(String lastname);
}
