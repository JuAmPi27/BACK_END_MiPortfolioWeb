

package com.yoProgramo.portfolioWeb.service;

import com.yoProgramo.portfolioWeb.model.HardSkill;
import com.yoProgramo.portfolioWeb.repository.HardSkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HardSkillService implements IHardSkillService {

    @Autowired
    public HardSkillRepository repository;
    
    @Override
    public List<HardSkill> obtenerHardSkill() {
      return repository.findAll();
    }

    @Override
    public HardSkill crearHardSkill(HardSkill hard) {
        return repository.save(hard);
    }

    @Override
    public void borrarHardSkill(Long id) {
         repository.deleteById(id);
    }

    @Override
    public HardSkill obtenerHardSkill(Long id) {
         return repository.findById(id).orElse(null);
    }

    @Override
    public void modificarHardSkill(HardSkill hard) {
       repository.save(hard);
    }
    
}
