package com.habel.bebel.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.habel.bebel.entity.Categoria;
import com.habel.bebel.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository rep;
	
	public Categoria buscar(Integer id) {
		Optional <Categoria> obj = rep.findById(id);
		return obj.orElse(null);
	}
}
