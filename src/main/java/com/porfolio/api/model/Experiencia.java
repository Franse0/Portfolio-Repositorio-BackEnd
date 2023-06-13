
package com.porfolio.api.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="experiencia")
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String nombre_exp;
    private String descripcion;
    private String img_exp;
    private String url_git;
    private Long persona_id;

    public Experiencia() {
    }

    public Experiencia(Long id, String nombre_exp, String descripcion, String img_exp, Long persona_id, String url_git) {
        this.id = id;
        this.nombre_exp = nombre_exp;
        this.descripcion = descripcion;
        this.img_exp = img_exp;
        this.persona_id = persona_id;
        this.url_git = url_git;
    }


    
    
    
    
    
    
}
