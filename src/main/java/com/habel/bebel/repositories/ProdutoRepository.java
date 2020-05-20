package com.habel.bebel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.habel.bebel.entity.Produto;

@Repository
public interface ProdutoRepository  extends JpaRepository<Produto, Integer >{
	
	
}
