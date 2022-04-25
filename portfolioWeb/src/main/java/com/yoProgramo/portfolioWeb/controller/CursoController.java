
package com.yoProgramo.portfolioWeb.controller;

import com.yoProgramo.portfolioWeb.model.Curso;
import com.yoProgramo.portfolioWeb.service.CursoService;
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
public class CursoController {
    
    @Autowired
    public CursoService service;
    
    @GetMapping("/curso")
    @ResponseBody
    public List<Curso> obtenerCurso() {
        return service.obtenerCurso();
    }
    
    @PostMapping("/curso/crear")
    @ResponseBody
    public Curso crearCurso(@RequestBody Curso curso) {
        return service.crearCurso(curso);
    }
    
    @DeleteMapping("/curso/{id}")
    public void borrarCurso(@PathVariable Long id) {
        service.borrarCurso(id);
    }
    
    @GetMapping("/curso/{id}")
    @ResponseBody
    public Curso obtenerCurso(@PathVariable Long id) {
        return service.obtenerCurso(id);
    }
    
    @PutMapping("/curso/update")
    public void modificarCurso(@RequestBody Curso curso) {
        service.modificarCurso(curso);
    }
    
}
