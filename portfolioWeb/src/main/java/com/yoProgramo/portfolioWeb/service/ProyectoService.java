
package com.yoProgramo.portfolioWeb.service;

import com.yoProgramo.portfolioWeb.model.Proyecto;
import com.yoProgramo.portfolioWeb.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProyectoService implements IProyectoService{

    @Autowired
    public ProyectoRepository repository;
    
    @Override
    public List<Proyecto> obtenerProyecto() {
         return repository.findAll();
    }

    @Override
    public Proyecto crearProyecto(Proyecto proyecto) {
        return repository.save(proyecto);
    }

    @Override
    public void borrarProyecto(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Proyecto obtenerProyecto(Long id) {
         return repository.findById(id).orElse(null);
    }

    @Override
    public void modificarProyecto(Proyecto proyecto) {
       repository.save(proyecto);
    }
    
}
