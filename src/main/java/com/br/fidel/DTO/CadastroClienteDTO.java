package com.br.fidel.DTO;

import com.br.fidel.model.Cliente;
import com.br.fidel.model.LocalEntrega;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CadastroClienteDTO {

	private String cep;
	private Cliente cli;
	
}
