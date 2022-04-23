
package com.yoProgramo.portfolioWeb.service;

import com.yoProgramo.portfolioWeb.model.Educacion;
import java.util.List;


public interface IEducacionService {
    
   public List<Educacion> obtenerEducacion ();
   public void crearEducacion(Educacion educacion);
   public void borrarEducacion(Long id);
   public Educacion obtenerEducacion(Long id);
   public void modificarEducacion(Educacion educacion);
    
}
