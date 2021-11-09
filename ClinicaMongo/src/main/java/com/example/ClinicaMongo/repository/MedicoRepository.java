package com.example.ClinicaMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.ClinicaMongo.model.Medico;

public interface MedicoRepository extends MongoRepository<Medico, String> {

}
