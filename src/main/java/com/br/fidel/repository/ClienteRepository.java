package com.br.fidel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.fidel.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
