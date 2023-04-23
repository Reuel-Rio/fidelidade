package com.br.fidel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class LocalEntrega {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String cep;
	private String estado;
	private String cidade;
	private String bairro;
	private String logradouro;
	private String complemento;
	private String pontoReferencia;
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	
}
