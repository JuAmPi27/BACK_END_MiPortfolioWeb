
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
public class Proyecto {
    
    @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
   
     @Basic
    private String nombre;
    private String descripcion;
    private String fechaRealizacion;
    private String href;

    public Proyecto() {
    }

    public Proyecto(String nombre, String descripcion, String fechaRealizacion, String href) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaRealizacion = fechaRealizacion;
        this.href = href;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fechaRealizacion=" + fechaRealizacion + ", href=" + href + '}';
    }
    
    
    
}
