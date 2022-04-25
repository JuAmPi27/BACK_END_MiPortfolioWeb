
package com.yoProgramo.portfolioWeb.controller;

import com.yoProgramo.portfolioWeb.model.HardSkill;
import com.yoProgramo.portfolioWeb.service.HardSkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HardSkillController {
    
    @Autowired
    public HardSkillService service;
    
    @GetMapping("/hardSkill")
    @ResponseBody
    public List<HardSkill> obtenerHardSkill() {
        return service.obtenerHardSkill();
    }
    
    @PostMapping("/hardSkill/crear")
    @ResponseBody
    public HardSkill crearHardSkill(@RequestBody HardSkill hard) {
        return service.crearHardSkill(hard);
    }
    
    @DeleteMapping("/hardSkill/{id}")
    public void borrarHardSkill(@PathVariable Long id) {
        service.borrarHardSkill(id);
    }
    
    @GetMapping("/hardSkill/{id}")
    @ResponseBody
    public HardSkill obtenerHardSkill(@PathVariable Long id) {
        return service.obtenerHardSkill(id);
    }
    
    @PutMapping("/hardSkill/update")
    public void modificarHardSkill(@RequestBody HardSkill hard) {
        service.modificarHardSkill(hard);
    }
    
}
