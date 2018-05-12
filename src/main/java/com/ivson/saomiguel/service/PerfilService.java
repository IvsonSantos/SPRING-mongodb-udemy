package com.ivson.saomiguel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivson.saomiguel.model.Perfil;
import com.ivson.saomiguel.repository.PerfilRepository;

@Service
public class PerfilService {

	@Autowired
	PerfilRepository perfilRepository;
	
	public List<Perfil> listarPerfis() {		
		return perfilRepository.findAll();
	}
	
	public Perfil salva(Perfil perfil) {		
		return perfilRepository.save(perfil);
	}
	
	public void deletarPerfil(String id) {
		perfilRepository.deleteById(id);
	}
	
	public Perfil consultarPerfil(String id) {
		Optional<Perfil> opt = perfilRepository.findById(id);
		return opt.orElse(null);
	}
			
}