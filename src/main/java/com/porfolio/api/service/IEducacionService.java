
package com.porfolio.api.service;

import com.porfolio.api.model.Educacion;
import java.util.List;


public interface IEducacionService {
    public List<Educacion> verEducacion();
    public void borrarEducacion(Long id);
    public void crearEducacion(Educacion educ);
    public Educacion buscarEducacion(Long id);
    
    
} 
    

