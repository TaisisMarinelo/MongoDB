package com.example.ClinicaMongo.service;

import java.util.List;

import com.example.ClinicaMongo.model.Medico;

public interface MedicoService {

	public List<Medico> obterTodos();
	
	public Medico obterPorCod(String cod);
	
	public Medico criar(Medico medico);
	
}
