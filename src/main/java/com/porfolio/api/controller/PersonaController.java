
package com.porfolio.api.controller;

import com.porfolio.api.model.Persona;
import com.porfolio.api.service.iPersonaService;
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
public class PersonaController {
    
    @Autowired
    private iPersonaService persoServ;
    
    @PostMapping("/new/persona")
    public void agregarPersona(@RequestBody Persona pers){
        persoServ.crearPersona(pers);
        System.out.println("Todo ok");
    }
    @PostMapping("/editar/persona")
    public void editarPersona(@RequestBody Persona pers){
        persoServ.crearPersona(pers);
        System.out.println("Todo ok con la edicion de persona");
    }
    
    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas (){
        return persoServ.VerPersonas();
    }
    
    @GetMapping("/ver/persona/{id}")
    public Persona getPersona (@PathVariable Long id){
        return persoServ.buscarPersona(id);
    }
    
    @DeleteMapping("/borrar/persona/{id}")
    public void borrarPersona (@PathVariable Long id){
        persoServ.borrarPersona(id);
        System.out.println("Todo okk");
    }
}


    


