package com.inhabitants.persona.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inhabitants.persona.model.Departamento;
import com.inhabitants.persona.service.DepartamentoService;

@RestController
@RequestMapping ("/departamento/")
public class DepartamentoRest {

	@Autowired
	private DepartamentoService departamentoService;
	
	@GetMapping
	private ResponseEntity<List<Departamento>> getAllDepartamentos(){
		return ResponseEntity.ok(departamentoService.findAll());
	}
	
	@GetMapping ("{id}")
	private ResponseEntity<List<Departamento>> getAllDepartamentosByPiso(@PathVariable("id") Long idPiso){
		return ResponseEntity.ok(departamentoService.findAllByPiso(idPiso));
	}
}
