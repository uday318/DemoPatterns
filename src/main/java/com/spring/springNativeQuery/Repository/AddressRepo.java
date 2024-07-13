package com.spring.springNativeQuery.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.springNativeQuery.Entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {
	
	

}
