package com.ProjetoFesta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name= "Tema")
public class Tema {
	
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private long id;
	  
	  @Column (name = "Nome")
	  private String Nome;
	  
	  @Column (name = "Valor Aluguel")
	  private String ValorAluguel;
	  
	  @Column (name = "Cor toalha")
	  private String CorToalha;

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

	public String getValorAluguel() {
		return ValorAluguel;
	}

	public void setValorAluguel(String valorAluguel) {
		ValorAluguel = valorAluguel;
	}

	public String getCorToalha() {
		return CorToalha;
	}

	public void setCorToalha(String corToalha) {
		CorToalha = corToalha;
	}
	  
	  
}
