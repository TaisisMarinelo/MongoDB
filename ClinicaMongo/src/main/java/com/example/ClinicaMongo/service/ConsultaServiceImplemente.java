package com.example.ClinicaMongo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ClinicaMongo.model.Consulta;
import com.example.ClinicaMongo.model.Medico;
import com.example.ClinicaMongo.repository.ConsultaRepository;
import com.example.ClinicaMongo.repository.MedicoRepository;

@Service
public class ConsultaServiceImplemente implements ConsultaService{

	@Autowired
	ConsultaRepository consultaRepository;
	
	@Autowired
	MedicoRepository medicoRepository;
	
	@Override
	public List<Consulta> obterTodos(){
		return this.consultaRepository.findAll();
	}
	
	@Override
	public Consulta obterPorCod(String cod) {
		return this.consultaRepository.findById(cod).orElseThrow(() -> new IllegalArgumentException("Consulta Inexistente"));
	}
	
	@Override
	public Consulta criar(Consulta consulta) {
		Medico medico = this.medicoRepository.findById(consulta.getMedico().getId()).orElseThrow(() -> new IllegalArgumentException("Medico Inexistente."));
		consulta.setMedico(medico);
		return this.consultaRepository.save(consulta);
	}

	@Override
	public Consulta atualizar(String id, Consulta consultaAtualizada) {
		Consulta consulta = obterPorCod(id);
		consulta.setNomePaciente(consultaAtualizada.getNomePaciente());
		consulta.setDataAgendamento(consultaAtualizada.getDataAgendamento());
		Medico medico = this.medicoRepository.findById(consultaAtualizada.getMedico().getId()).orElseThrow(() -> new IllegalArgumentException("Medico Inexistente"));
		consulta.setMedico(medico);
		return this.consultaRepository.save(consulta);
	}
	
	
}
