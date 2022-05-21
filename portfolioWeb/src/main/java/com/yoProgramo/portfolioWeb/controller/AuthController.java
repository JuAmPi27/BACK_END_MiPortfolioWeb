
package com.yoProgramo.portfolioWeb.controller;

import com.yoProgramo.portfolioWeb.model.Usuario;
import com.yoProgramo.portfolioWeb.model.dto.UsuarioDto;
import com.yoProgramo.portfolioWeb.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    
     @Autowired
    AuthService service;
    
     @PostMapping("/login")
    public boolean login(@RequestBody UsuarioDto userDto) {
        return service.isUserEnabled(userDto);
    }
    
    /*  @PostMapping("/registrar")
    public void registrar(@RequestBody Usuario usuario) throws Exception {
        service.crearUsuario(usuario);
    } */
    
}
