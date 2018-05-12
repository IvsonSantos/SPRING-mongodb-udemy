package com.ivson.saomiguel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ivson.saomiguel.model.Usuario;
import com.ivson.saomiguel.service.UsuarioService;

@RestController("/usuario")
public class UsuarioController {

	@Autowired
	UsuarioService service;

	@GetMapping
	public List<Usuario> listaUsuarios() {
		return service.listarUsuarios();
	}
	
	@PostMapping
	public Usuario salva(@RequestBody Usuario usuario) {
		return service.salva(usuario);
	}
	
	@PutMapping
	public Usuario editar(@RequestBody Usuario usuario) {
		return service.salva(usuario);
	}
	
	
}