
package com.yoProgramo.portfolioWeb.service;

import com.yoProgramo.portfolioWeb.model.SoftSkill;
import com.yoProgramo.portfolioWeb.repository.SoftSkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SoftSkillService implements ISoftSkillService {

    @Autowired
    public SoftSkillRepository repository;
    
    @Override
    public List<SoftSkill> obtenerSoftSkill() {
       return repository.findAll();
    }

    @Override
    public SoftSkill crearSoftSkill(SoftSkill soft) {
        return repository.save(soft);
    }

    @Override
    public void borrarSoftSkill(Long id) {
        repository.deleteById(id);
    }

    @Override
    public SoftSkill obtenerSoftSkill(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void modificarSoftSkill(SoftSkill soft) {
         repository.save(soft);
    }
    
}
