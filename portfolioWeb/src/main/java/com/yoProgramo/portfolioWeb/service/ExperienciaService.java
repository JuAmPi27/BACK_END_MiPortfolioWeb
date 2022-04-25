
package com.yoProgramo.portfolioWeb.service;

import com.yoProgramo.portfolioWeb.model.Experiencia;
import com.yoProgramo.portfolioWeb.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ExperienciaService implements IExperienciaService {

    @Autowired
    public ExperienciaRepository repository;

    @Override
    public List<Experiencia> obtenerExperiencia() {
       return repository.findAll();
    }

    @Override
    public Experiencia crearExperiencia(Experiencia experiencia) {
       return repository.save(experiencia);
    }

    @Override
    public void borrarExperiencia(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Experiencia obtenerExperiencia(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void modificarExperiencia(Experiencia experiencia) {
       repository.save(experiencia);
    }
    
   
    
}
