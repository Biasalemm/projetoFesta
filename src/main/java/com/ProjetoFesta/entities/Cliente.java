package com.ProjetoFesta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table (name= "cliente")
public class Cliente {
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private long id;
	  
	  @Column (name = "Nome")
	  private String Nome;
	  
	  @Column (name = "Telefone")
	  private String telefone;
	  
	  @Column (name = "CPF")
	  private String cpf;
	  
	  @Column (name = "RG")
	  private String rg;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	  
	  
}
