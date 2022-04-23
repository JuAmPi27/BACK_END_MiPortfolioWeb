
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
public class Educacion {
    
     @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
   
     @Basic
    private String titulo;
    private String escuela;
    private String comienzo;
    private String fin;

    public Educacion() {
    }

    public Educacion(String titulo, String escuela, String comienzo, String fin) {
        this.titulo = titulo;
        this.escuela = escuela;
        this.comienzo = comienzo;
        this.fin = fin;
    }

    @Override
    public String toString() {
        return "Educacion{" + "id=" + id + ", titulo=" + titulo + ", escuela=" + escuela + ", comienzo=" + comienzo + ", fin=" + fin + '}';
    }
    
    
    
}
