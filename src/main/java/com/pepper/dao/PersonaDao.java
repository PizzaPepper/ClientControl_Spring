package com.pepper.dao;

import com.pepper.domain.Persona;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaDao extends JpaRepository<Persona, Long> {

}
