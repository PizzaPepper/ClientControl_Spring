package com.pepper.service;

import java.util.List;

import com.pepper.domain.Persona;

public interface PersonaService {
    
    public List<Persona> listarPersonas();
    
    public void guardar(Persona persona);
    
    public void eliminar(Persona persona);

    public Persona encontrarPersona(Persona persona);
}
