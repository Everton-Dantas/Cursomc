package com.educandoweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.curso.domain.Estado;

@Repository
public interface  EstadoRepository extends JpaRepository<Estado, Integer> {




	
	

}
