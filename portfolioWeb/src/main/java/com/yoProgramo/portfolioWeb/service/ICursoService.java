
package com.yoProgramo.portfolioWeb.service;

import com.yoProgramo.portfolioWeb.model.Curso;
import java.util.List;


public interface ICursoService {
    
   public List<Curso> obtenerCurso ();
   public Curso crearCurso(Curso curso);
   public void borrarCurso(Long id);
   public Curso obtenerCurso(Long id);
   public void modificarCurso(Curso curso);
    
}
