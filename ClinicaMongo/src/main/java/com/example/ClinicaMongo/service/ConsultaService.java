package com.example.ClinicaMongo.service;

import java.util.List;

import com.example.ClinicaMongo.model.Consulta;

public interface ConsultaService {

	
	public List<Consulta> obterTodos();
	
	public Consulta obterPorCod(String cod);
	
	public Consulta criar (Consulta consulta);
	
	public Consulta atualizar(String id, Consulta consulta);
	
}
