package com.habel.bebel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.habel.bebel.entity.Endereco;

@Repository
public interface EnderecoRepository  extends JpaRepository<Endereco, Integer >{
	
	
}
