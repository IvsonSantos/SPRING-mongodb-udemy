package com.ivson.saomiguel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivson.saomiguel.model.Usuario;
import com.ivson.saomiguel.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	public List<Usuario> listarUsuarios() {		
		return usuarioRepository.findAll();
	}
	
	public Usuario salva(Usuario newUser) {		
		return usuarioRepository.save(newUser);
	}
}