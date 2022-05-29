
package com.yoProgramo.portfolioWeb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Curso {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
   
     @Basic
    private String nombre;
    private String lugar;
    private String duracion;

    public Curso() {
    }

    public Curso(String nombre, String lugar, String duracion) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Curso{" + "id=" + id + ", nombre=" + nombre + ", lugar=" + lugar + ", duracion=" + duracion + '}';
    }

   
    
   
    
    
}
