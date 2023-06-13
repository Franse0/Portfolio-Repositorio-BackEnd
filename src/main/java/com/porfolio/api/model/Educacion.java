
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
@Table (name="educacion")
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String escuela;
    private String img_school;
    private String descripcion;
    private String start;
    private String end;
    private String certificado;
    private Long persona_id;

    public Educacion() {
    }

    public Educacion(Long id, String escuela, String img_school, String descripcion, String start, String end, String certificado, Long persona_id) {
        this.id = id;
        this.escuela = escuela;
        this.img_school = img_school;
        this.descripcion = descripcion;
        this.start = start;
        this.end = end;
        this.certificado = certificado;
        this.persona_id = persona_id;
    }


    
    
    
    
}
