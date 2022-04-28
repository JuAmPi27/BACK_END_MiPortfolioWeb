
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
public class DatosPersonales {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    @Basic
    private String nombre;
    private String apellido;
    private String img;
    private String profesion;
    private String ubicacion;
    private String email;
    private String tel;
    private String acercaDe;

    public DatosPersonales() {
    }

    public DatosPersonales(String nombre, String apellido, String img, String profesion, String ubicacion, String email, String tel, String acercaDe) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
        this.profesion = profesion;
        this.ubicacion = ubicacion;
        this.email = email;
        this.tel = tel;
        this.acercaDe = acercaDe;
    }

    @Override
    public String toString() {
        return "DatosPersonales{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", img=" + img + ", profesion=" + profesion + ", ubicacion=" + ubicacion + ", email=" + email + ", tel=" + tel + ", acercaDe=" + acercaDe + '}';
    }
    
    

}
