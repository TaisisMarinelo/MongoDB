package com.example.ClinicaMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.ClinicaMongo.model.Consulta;

public interface ConsultaRepository extends MongoRepository<Consulta, String>{

}
