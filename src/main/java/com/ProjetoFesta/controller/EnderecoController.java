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

import com.ProjetoFesta.entities.Endereco;
import com.ProjetoFesta.services.EnderecoService;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
	private final EnderecoService enderecoService;
	
	@Autowired
	public EnderecoController(EnderecoService enderecoService) {
		this.enderecoService = enderecoService;
	}
	@PostMapping
	public  Endereco createendereco(@RequestBody Endereco endereco) {
		return enderecoService.saveEndereco(endereco);
	}
	@GetMapping("/{id}")
	public Endereco getEndereco (@PathVariable Long id) {
		return enderecoService.getEnderecoById(id);
	}
	@GetMapping
	public List<Endereco> getAllEndereco(){
		return enderecoService.getAllEndereco();
	}
	@DeleteMapping("/{id}")
	public void deleteItemTema(@PathVariable Long id) {
		enderecoService.deleteEndereco(id);
	}
}
