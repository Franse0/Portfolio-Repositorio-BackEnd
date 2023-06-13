



package com.porfolio.api.controller;

import com.porfolio.api.model.Experiencia;
import com.porfolio.api.service.IExperienciaService;
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
//@CrossOrigin(origins="http://localhost:4200")//
@CrossOrigin(origins="*")
public class ExperienciaController {
    
    @Autowired
    private IExperienciaService expService;
            
    
    @GetMapping("/ver/experiencia")
    @ResponseBody
    public List<Experiencia> fetExperiencias(){
        return expService.verExperiencia();
    }
    

    @GetMapping("/ver/experiencia/{id}")
    @ResponseBody
    public Experiencia traerExperiencia(@PathVariable Long id){
        return expService.buscarExperiencia(id);
    }
    
    @PostMapping("/new/experiencia")
    public void crearExperiencia(@RequestBody Experiencia exp){
        expService.crearExperienca(exp);
        System.out.println("Experiencia cargada");
    }
    
    @PostMapping("/editar/experiencia")
    public void editarExperiencia(@RequestBody Experiencia exp){
        expService.crearExperienca(exp);
        System.out.println("Experiencia editada");
    }
    
    @DeleteMapping("/borrar/experiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        expService.borrarExperiencia(id);
        System.out.println("Experiencia borrada con exito");
    }
            
}
