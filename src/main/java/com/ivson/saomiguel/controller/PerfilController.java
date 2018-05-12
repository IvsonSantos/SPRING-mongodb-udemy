package com.ivson.saomiguel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ivson.saomiguel.model.Perfil;
import com.ivson.saomiguel.service.PerfilService;

@RestController
public class PerfilController {

	@Autowired
	PerfilService service;

	@GetMapping("/perfil")
	public List<Perfil> listaPerfis() {
		return service.listarPerfis();
	}

	@PostMapping("/perfil")
	public Perfil salva(@RequestBody Perfil perfil) {
		return service.salva(perfil);
	}
	
	@PutMapping("/perfil")
	public Perfil editar(@RequestBody Perfil perfil) {
		return service.salva(perfil);
	}
	
}