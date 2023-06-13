
package com.porfolio.api.service;

import com.porfolio.api.model.Persona;
import java.util.List;


public interface iPersonaService {
    public List<Persona> VerPersonas();
    public void crearPersona(Persona pers);
    public void borrarPersona(Long id);
    public Persona buscarPersona(Long id);
}
