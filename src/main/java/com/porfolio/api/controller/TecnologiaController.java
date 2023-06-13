
package com.porfolio.api.controller;

import com.porfolio.api.model.Tecnologia;
import com.porfolio.api.service.ITecnologiaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins="*")
public class TecnologiaController {
    
    @Autowired 
    private ITecnologiaService tecServ;
    
    @GetMapping("/ver/tecnologia")
    @ResponseBody
    public List<Tecnologia>verTecnologia(){
        return tecServ.verTecnologia();
    }
    
    @GetMapping("/ver/tecnologia/{id}")
    @ResponseBody
    public Tecnologia getTec(@PathVariable Long id){
        return tecServ.traerTecnologia(id);
    }
    
    @PostMapping("/new/tecnologia")
    public void crarTecnologia(@RequestBody Tecnologia tecnologia){
        tecServ.crearTecnologia(tecnologia);
        System.out.println("Todo joya con la tecnologia");
    }
    
    @PostMapping("/editar/tecnologia")
    public void editarTecnologia(@RequestBody Tecnologia tecnologia){
        tecServ.crearTecnologia(tecnologia);
        System.out.println("Todo joya con la eidicon");
    }
    
    @DeleteMapping("/borrar/tecnologia/{id}")
    public void borrarTecnologia(@PathVariable Long id){
        tecServ.borrarTecnologia(id);
        System.out.println("Todo joya con borrar tecnologia");
    }
    
  
}
