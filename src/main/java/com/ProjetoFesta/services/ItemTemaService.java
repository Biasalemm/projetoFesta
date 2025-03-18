package com.ProjetoFesta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ProjetoFesta.entities.ItemTema;
import com.ProjetoFesta.repository.ItemTemaRepository;

public class ItemTemaService {
	
	private final ItemTemaRepository itemtemaRepository;

	@Autowired
	public ItemTemaService(ItemTemaRepository itemtemaRepository) {
		this.itemtemaRepository = itemtemaRepository;
	}

	public ItemTema saveItemTema (ItemTema itemtema) {
		return itemtemaRepository.save(itemtema);
	}
	public ItemTema getItemTemaById(Long id) {
		return itemtemaRepository.findById(id).orElse(null);
	}
	public List<ItemTema> getAllItemTema(){
		return itemtemaRepository.findAll();
	}
	public void deleteItemTema (Long id) {
		itemtemaRepository.deleteById(id);
	}

}
