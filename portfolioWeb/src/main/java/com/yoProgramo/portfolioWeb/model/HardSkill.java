
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
public class HardSkill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    @Basic
    private String nombre;
    private String progreso;

    
    public HardSkill() {
    }

    public HardSkill(String nombre, String progreso) {
        this.nombre = nombre;
        this.progreso = progreso;
    }

    @Override
    public String toString() {
        return "HardSkill{" + "id=" + id + ", nombre=" + nombre + ", progreso=" + progreso + '}';
    }
    
}
