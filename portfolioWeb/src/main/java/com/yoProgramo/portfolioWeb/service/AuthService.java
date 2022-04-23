
package com.yoProgramo.portfolioWeb.service;

import com.yoProgramo.portfolioWeb.model.Usuario;
import com.yoProgramo.portfolioWeb.model.dto.UsuarioDto;
import com.yoProgramo.portfolioWeb.repository.AuthRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    
    @Autowired
    AuthRepository repository;
    
     @Autowired
    private PasswordEncoder passwordEncoder;
    
    public boolean isUserEnabled(UsuarioDto usuarioDto) {
        boolean isUserEnabled = false;
        List<Usuario> usuarios = repository.findByEmailAndIsEnabledTrue(usuarioDto.getEmail());
        if (!usuarios.isEmpty()) {
            if (passwordEncoder.matches(usuarioDto.getPassword(), usuarios.get(0).getPassword()))
                isUserEnabled = true;
        }
        return isUserEnabled;
    }
    
      public void crearUsuario(Usuario usuario) throws Exception {
        List<Usuario> usuarios = repository.findByEmailAndIsEnabledTrue(usuario.getEmail());
        if (!usuarios.isEmpty())
            throw new Exception("El email ya está registrado");
        else {
            usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
            usuario.setEnabled(true);
            repository.save(usuario);
        }
    }
    
}
