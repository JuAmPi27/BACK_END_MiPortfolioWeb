
package com.yoProgramo.portfolioWeb.service;

import com.yoProgramo.portfolioWeb.model.HardSkill;
import java.util.List;


public interface IHardSkillService {
    
   public List<HardSkill> obtenerHardSkill ();
   public HardSkill crearHardSkill(HardSkill hard);
   public void borrarHardSkill(Long id);
   public HardSkill obtenerHardSkill(Long id);
   public void modificarHardSkill(HardSkill hard);
    
}
