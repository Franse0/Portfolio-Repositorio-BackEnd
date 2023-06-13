
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
@Table(name="persona")
public class Persona {
        @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    @Basic
    private String nombre;
    private String apellido;
    private String fecha_nac;
    private String nacionalidad;
    private String mail;
    private String sobre_mi;
    private String ocupacion;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String fecha_nac, String nacionalidad, String mail, String sobre_mi, String ocupacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nac = fecha_nac;
        this.nacionalidad = nacionalidad;
        this.mail = mail;
        this.sobre_mi = sobre_mi;
        this.ocupacion = ocupacion;
    }


    
}
