/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.gjm.Security.Repository;

import com.portfolio.gjm.Security.Entity.Rol;
import com.portfolio.gjm.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepositoryImplementation<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
    
}
