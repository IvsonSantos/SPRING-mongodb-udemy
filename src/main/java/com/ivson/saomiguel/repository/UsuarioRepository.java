package com.ivson.saomiguel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ivson.saomiguel.model.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String>{

}