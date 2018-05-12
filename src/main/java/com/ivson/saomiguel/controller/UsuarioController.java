package com.ivson.saomiguel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ivson.saomiguel.model.Usuario;
import com.ivson.saomiguel.service.UsuarioService;

@RestController
public class UsuarioController {

	@Autowired
	UsuarioService service;

	@GetMapping("/usuario")
	public List<Usuario> listaUsuarios() {
		return service.listarUsuarios();
	}
	
	@PostMapping("/usuario")
	public Usuario salva(@RequestBody Usuario usuario) {
		return service.salva(usuario);
	}
	
	@PutMapping("/usuario")
	public Usuario editar(@RequestBody Usuario usuario) {
		return service.salva(usuario);
	}
	
	@DeleteMapping("/usuario/{id}")
	public void delete(@PathVariable String id) {
		 service.deletarUsuario(id);
	}
	
	@GetMapping("/usuario/{id}")
	public Usuario consultar(@PathVariable String id) {
		 return service.consultarUsuario(id);
	}
	
}