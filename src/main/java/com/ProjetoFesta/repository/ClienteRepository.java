package com.ProjetoFesta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoFesta.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
