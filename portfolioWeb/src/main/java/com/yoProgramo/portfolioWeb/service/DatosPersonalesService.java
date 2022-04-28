
package com.yoProgramo.portfolioWeb.service;

import com.yoProgramo.portfolioWeb.model.DatosPersonales;
import com.yoProgramo.portfolioWeb.repository.DatosPersonalesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DatosPersonalesService implements IDatosPersonalesService{

    @Autowired
    public DatosPersonalesRepository repository;
    
    @Override
    public List<DatosPersonales> obtenerDatosPersonales() {
        return repository.findAll();
    }

    @Override
    public DatosPersonales crearDatosPersonales(DatosPersonales datosPer) {
        return repository.save(datosPer); 
    }

    @Override
    public void borrarDatosPersonales(Long id) {
        repository.deleteById(id);
    }

    @Override
    public DatosPersonales obtenerDatosPersonales(Long id) {
        return repository.findById(id).orElse(null); 
    }

    @Override
    public void modificarDatosPersonales(DatosPersonales datosPer) {
        repository.save(datosPer); 
    }
    
}
