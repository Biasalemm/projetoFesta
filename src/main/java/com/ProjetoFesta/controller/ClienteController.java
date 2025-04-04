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

import com.ProjetoFesta.entities.Cliente;
import com.ProjetoFesta.services.ClienteService;


@RestController
@RequestMapping("/cliente")
public class ClienteController {
	private final ClienteService clienteService;
	
	@Autowired
	public ClienteController(ClienteService clienteService) {
		this.clienteService = clienteService;
	}
	@PostMapping
	public Cliente createcliente(@RequestBody Cliente cliente) {
		return clienteService.saveCliente(cliente);
	}
	@GetMapping("/{id}")
	public Cliente getCliente (@PathVariable Long id) {
		return clienteService.getClienteById(id);
	}
	@GetMapping
	public List<Cliente> getAllCliente(){
		return clienteService.getAllCliente();
	}
	@DeleteMapping("/{id}")
	public void deleteCliente(@PathVariable Long id) {
		clienteService.deleteCliente(id);
	}
}
