package com.inhabitants.persona.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inhabitants.persona.model.Piso;
import com.inhabitants.persona.service.PisoService;

@RestController
@RequestMapping ("/piso/")
public class PisoRest {

	@Autowired
	private PisoService pisoService;
	
	@GetMapping
	private ResponseEntity<List<Piso>> getAllDepartamentos(){
		return ResponseEntity.ok(pisoService.findAll());
	}
}
