
package com.porfolio.api.service;

import com.porfolio.api.model.Tecnologia;
import com.porfolio.api.repository.TecnologiaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class TecnologiaService implements ITecnologiaService{

    @Autowired
    public TecnologiaRepository tecRepo;
    
    @Override
    public List<Tecnologia> verTecnologia() {
        return tecRepo.findAll();
    }

    @Override
    public void crearTecnologia(Tecnologia tecnologia) {
        tecRepo.save(tecnologia);
    }

    @Override
    public void borrarTecnologia(Long id) {
        tecRepo.deleteById(id);
    }

    @Override
    public Tecnologia traerTecnologia(Long id) {
        return tecRepo.findById(id).orElse(null);
    }

  


    

    
}
