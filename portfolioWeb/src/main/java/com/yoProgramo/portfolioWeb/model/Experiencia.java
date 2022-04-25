
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
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    @Basic
    private String empresa;
    private String cargo;
    private String pais;
    private String comienzo;
    private String fin;
    private String tareas;

    
    public Experiencia() {
    }

    public Experiencia(String empresa, String cargo, String pais, String comienzo, String fin, String tareas) {
        this.empresa = empresa;
        this.cargo = cargo;
        this.pais = pais;
        this.comienzo = comienzo;
        this.fin = fin;
        this.tareas = tareas;
    }

    @Override
    public String toString() {
        return "Experiencia{" + "id=" + id + ", empresa=" + empresa + ", cargo=" + cargo + ", pais=" + pais + ", comienzo=" + comienzo + ", fin=" + fin + ", tareas=" + tareas + '}';
    }
     
}
