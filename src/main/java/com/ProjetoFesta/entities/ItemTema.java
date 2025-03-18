package com.ProjetoFesta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name= "ItemTema")
public class ItemTema {
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private long id;
	  
	  @Column (name = "Nome")
	  private String Nome;
	  
	  @Column (name = "Descricao")
	  private String descricao;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	  
	 
}
