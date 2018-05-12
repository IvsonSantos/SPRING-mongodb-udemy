package com.ivson.saomiguel.service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
	
	public void deletarUsuario(String id) {
		usuarioRepository.deleteById(id);
	}
	
	public Usuario consultarUsuario(String id) {
		Optional<Usuario> opt = usuarioRepository.findById(id);
		return opt.orElse(null);
	}
	

	
		
}