
package com.porfolio.api.controller;

import com.porfolio.api.model.Educacion;
import com.porfolio.api.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class EducacionController {
    
    
    @Autowired
    private IEducacionService eduServ;
    
    @GetMapping("/ver/educacion")
    @ResponseBody
    public List<Educacion> verEducacion(){
        return eduServ.verEducacion();
    }
    
    @GetMapping("/ver/educacion/{id}")
    @ResponseBody
    public Educacion getEducacion(@PathVariable Long id){
        return eduServ.buscarEducacion(id);
    }
    
    @PostMapping("/new/educacion")
    public void crearEducacion(@RequestBody Educacion educacion){
        eduServ.crearEducacion(educacion);
        System.out.println("Educacion Cargada");
    }
    
    @PostMapping("/editar/educacion")
    public void editarrEducacion(@RequestBody Educacion educacion){
        eduServ.crearEducacion(educacion);
         System.out.println("Datos Educativos actualizados");
    }
    
    @DeleteMapping("/borrar/educacion/{id}")
    public void borrarEducacion(@PathVariable Long id){
        eduServ.borrarEducacion(id);
        System.out.println("borrada exitosamene");
    }
    

}
