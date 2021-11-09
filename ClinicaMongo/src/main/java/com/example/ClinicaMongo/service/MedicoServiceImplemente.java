package com.example.ClinicaMongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ClinicaMongo.model.Medico;
import com.example.ClinicaMongo.repository.MedicoRepository;

@Service
public class MedicoServiceImplemente implements MedicoService{
	
	@Autowired
	MedicoRepository medicoRepository;
	
	@Override
	public List<Medico> obterTodos(){
		return this.medicoRepository.findAll();
	}

	@Override
	public Medico obterPorCod(String cod) {
		return this.medicoRepository.findById(cod).orElseThrow(() -> new IllegalArgumentException("Medico inexistente."));
	}
	
	@Override
	public Medico criar(Medico medico) {
		return this.medicoRepository.save(medico);
	}
	
}
