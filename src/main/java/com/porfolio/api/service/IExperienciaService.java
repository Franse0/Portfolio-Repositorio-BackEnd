
package com.porfolio.api.service;

import com.porfolio.api.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public List<Experiencia>verExperiencia();
    public void crearExperienca(Experiencia exp);
    public void borrarExperiencia(Long id);
    public Experiencia buscarExperiencia(Long id);
    
}
