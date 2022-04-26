
package com.yoProgramo.portfolioWeb.controller;

import com.yoProgramo.portfolioWeb.model.SoftSkill;
import com.yoProgramo.portfolioWeb.service.SoftSkillService;
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
public class SoftSkillController {
    
    @Autowired
    public SoftSkillService service;
    
    @GetMapping("/softSkill")
    @ResponseBody
    public List<SoftSkill> obtenerSoftSkill() {
        return service.obtenerSoftSkill();
    }
    
    @PostMapping("/softSkill/crear")
    @ResponseBody
    public SoftSkill crearSoftSkill(@RequestBody SoftSkill soft) {
        return service.crearSoftSkill(soft);
    }
    
    @DeleteMapping("/softSkill/{id}")
    public void borrarSoftSkill(@PathVariable Long id) {
        service.borrarSoftSkill(id);
    }
    
    @GetMapping("/softSkill/{id}")
    @ResponseBody
    public SoftSkill obtenerSoftSkill(@PathVariable Long id) {
        return service.obtenerSoftSkill(id);
    }
    
    @PutMapping("/softSkill/update")
    public void modificarSoftSkill(@RequestBody SoftSkill hard) {
        service.modificarSoftSkill(hard);
    }
    
}
