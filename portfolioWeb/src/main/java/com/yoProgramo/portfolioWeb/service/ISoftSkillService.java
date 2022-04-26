
package com.yoProgramo.portfolioWeb.service;

import com.yoProgramo.portfolioWeb.model.SoftSkill;
import java.util.List;


public interface ISoftSkillService {
    
   public List<SoftSkill> obtenerSoftSkill();
   public SoftSkill crearSoftSkill(SoftSkill soft);
   public void borrarSoftSkill(Long id);
   public SoftSkill obtenerSoftSkill(Long id);
   public void modificarSoftSkill(SoftSkill soft);
    
}
