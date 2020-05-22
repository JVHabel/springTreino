package com.habel.bebel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.habel.bebel.entity.Cliente;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, Integer >{
	
	
}
