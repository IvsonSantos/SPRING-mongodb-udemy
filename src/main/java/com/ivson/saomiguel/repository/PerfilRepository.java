package com.ivson.saomiguel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ivson.saomiguel.model.Perfil;

public interface PerfilRepository extends MongoRepository<Perfil, String>{

}