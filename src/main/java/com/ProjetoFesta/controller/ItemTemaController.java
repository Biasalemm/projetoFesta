package com.ProjetoFesta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProjetoFesta.entities.ItemTema;
import com.ProjetoFesta.services.ItemTemaService;


@RestController
@RequestMapping("/itemtema")
public class ItemTemaController {
private final ItemTemaService itemtemaService;
	
@Autowired
public ItemTemaController(ItemTemaService itemtemaService) {
	this.itemtemaService = itemtemaService;
}
@PostMapping
public ItemTema createitemtema(@RequestBody ItemTema itemtema) {
	return itemtemaService.saveItemTema(itemtema);
}
@GetMapping("/{id}")
public ItemTema getItemTema (@PathVariable Long id) {
	return itemtemaService.getItemTemaById(id);
}
@GetMapping
public List<ItemTema> getAllItemTema(){
	return itemtemaService.getAllItemTema();
}
@DeleteMapping("/{id}")
public void deleteItemTema(@PathVariable Long id) {
	itemtemaService.deleteItemTema(id);
}
}
