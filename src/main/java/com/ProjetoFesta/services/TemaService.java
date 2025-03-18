package com.ProjetoFesta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ProjetoFesta.entities.Tema;
import com.ProjetoFesta.repository.TemaRepository;

public class TemaService {
private final TemaRepository temaRepository;

@Autowired
public TemaService(TemaRepository temaRepository) {
	this.temaRepository = temaRepository;
}

public Tema saveTema (Tema tema) {
	return temaRepository.save(tema);
}
public Tema getTemaById(Long id) {
	return temaRepository.findById(id).orElse(null);
}
public List<Tema> getAllTema(){
	return temaRepository.findAll();
}
public void deleteTema (Long id) {
	temaRepository.deleteById(id);
}
}
