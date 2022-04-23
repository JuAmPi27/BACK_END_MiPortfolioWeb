
package com.yoProgramo.portfolioWeb.service;

import com.yoProgramo.portfolioWeb.model.Educacion;
import com.yoProgramo.portfolioWeb.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EducacionService implements IEducacionService {
    
    @Autowired
    public EducacionRepository repository;

    @Override
    public List<Educacion> obtenerEducacion() {
       return repository.findAll();
    }

    @Override
    public void crearEducacion(Educacion educacion) {
        repository.save(educacion);
    }

    @Override
    public void borrarEducacion(Long id) {
       repository.deleteById(id);
    }

    @Override
    public Educacion obtenerEducacion(Long id) {
       return repository.findById(id).orElse(null);
    }

    @Override
    public void modificarEducacion(Educacion educacion) {
        repository.save(educacion);
    }
    
}
