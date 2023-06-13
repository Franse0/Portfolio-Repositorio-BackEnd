
package com.porfolio.api.service;

import com.porfolio.api.model.Tecnologia;
import java.util.List;


public interface ITecnologiaService {
    
    public List<Tecnologia> verTecnologia();
    public void crearTecnologia(Tecnologia tecnologia);
    public void borrarTecnologia(Long id);
    public Tecnologia traerTecnologia(Long id);
    
    
}
