
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
@Table(name="tecnologias")
public class Tecnologia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String nombre_tec;
    private String img_tec;
    private Long persona_id;

    public Tecnologia() {
    }

    public Tecnologia(Long id, String nombre_tec, String img_tec, Long persona_id) {
        this.id = id;
        this.nombre_tec = nombre_tec;
        this.img_tec = img_tec;
        this.persona_id = persona_id;
    }
    
    
    
}
