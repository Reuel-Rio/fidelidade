package com.br.fidel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.fidel.model.LocalEntrega;
import com.br.fidel.repository.LocalEntregaRepository;

@Service
public class LocalEntregaService {

	@Autowired
	private LocalEntregaRepository ler;
	
	public void save (LocalEntrega le) {
		ler.save(le);
	}
	
	public List<LocalEntrega> getAllEnderecos (){
		return ler.findAll();
	}
	
}
