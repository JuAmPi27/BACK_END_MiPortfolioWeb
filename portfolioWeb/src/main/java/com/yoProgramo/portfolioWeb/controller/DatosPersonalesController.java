
package com.yoProgramo.portfolioWeb.controller;

import com.yoProgramo.portfolioWeb.model.DatosPersonales;
import com.yoProgramo.portfolioWeb.service.DatosPersonalesService;
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
public class DatosPersonalesController {
    
    @Autowired
    public DatosPersonalesService service;
    
    @GetMapping("/datosPersonales")
    @ResponseBody
    public List<DatosPersonales> obtenerDatosPersonales() {
        return service.obtenerDatosPersonales();
    }
    
    @PostMapping("/datosPersonales/crear")
    @ResponseBody
    public DatosPersonales crearDatosPersonales(@RequestBody DatosPersonales datosPer) {
        return service.crearDatosPersonales(datosPer);
    }
    
    @DeleteMapping("/datosPersonales/{id}")
    public void borrarDatosPersonales(@PathVariable Long id) {
        service.borrarDatosPersonales(id);
    }
    
    @GetMapping("/datosPersonales/{id}")
    @ResponseBody
    public DatosPersonales obtenerDatosPersonales(@PathVariable Long id) {
        return service.obtenerDatosPersonales(id);
    }
    
    @PutMapping("/datosPersonales/update")
    public void modificarDatosPersonales(@RequestBody DatosPersonales datosPer) {
        service.modificarDatosPersonales(datosPer);
    }
    
}
