
package com.portfolio.gjm.Security.Service;

import com.portfolio.gjm.Security.Entity.Rol;
import com.portfolio.gjm.Security.Entity.Usuario;
import com.portfolio.gjm.Security.Enums.RolNombre;
import com.portfolio.gjm.Security.Repository.IRolRepository;
import com.portfolio.gjm.Security.Repository.IUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    IUsuarioRepository iusuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    public boolean existsByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.existsByEmail(nombreUsuario);
    }
    public boolean  existsByEmail(String email){
        return iusuarioRepository. existsByEmail(email);
    }
    public void save(Usuario usuario){
        iusuarioRepository.save(usuario);
    }
}
