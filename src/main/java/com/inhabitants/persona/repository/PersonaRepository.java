package com.inhabitants.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inhabitants.persona.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
