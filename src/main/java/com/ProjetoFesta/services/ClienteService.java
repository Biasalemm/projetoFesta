package com.ProjetoFesta.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjetoFesta.entities.Cliente;
import com.ProjetoFesta.repository.ClienteRepository;

@Service
public class ClienteService{
private final ClienteRepository clienteRepository;

@Autowired
public ClienteService(ClienteRepository clienteRepository) {
	this.clienteRepository = clienteRepository;
}
public Cliente saveCliente (Cliente cliente) {
	return clienteRepository.save(cliente);
}
public Cliente getClienteById(Long id) {
	return clienteRepository.findById(id).orElse(null);
}
public List<Cliente> getAllCliente(){
	return clienteRepository.findAll();
}
public void deleteCliente (Long id) {
	clienteRepository.deleteById(id);
}
}
