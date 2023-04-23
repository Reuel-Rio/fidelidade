package com.br.fidel.model;

import java.util.List;

import com.br.fidel.enuns.Pessoa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity	
@Data
public class Cliente {

	@Id
	private Integer id;
	private String nome;
	private String email;
	private Boolean status;
	private String doc;
	private Pessoa Pessoa;
	@OneToMany(mappedBy = "cliente")
	private List<LocalEntrega> endereco;
	@OneToMany(mappedBy = "cliente")
	private List<Ponto> pontos;
	
}
