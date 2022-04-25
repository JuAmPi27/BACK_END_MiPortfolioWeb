
package com.yoProgramo.portfolioWeb.service;

import com.yoProgramo.portfolioWeb.model.Curso;
import com.yoProgramo.portfolioWeb.repository.CursoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CursoService implements ICursoService {

    @Autowired
    public CursoRepository repository;
    
    @Override
    public List<Curso> obtenerCurso() {
        return repository.findAll();
    }

    @Override
    public Curso crearCurso(Curso curso) {
       return repository.save(curso); 
    }

    @Override
    public void borrarCurso(Long id) {
       repository.deleteById(id);
    }

    @Override
    public Curso obtenerCurso(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void modificarCurso(Curso curso) {
       repository.save(curso);
    }
    
}
