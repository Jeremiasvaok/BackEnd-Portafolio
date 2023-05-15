/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portafolioWeb.JeremiasV.Security.Repository;

import com.portafolioWeb.JeremiasV.Security.entity.Role;
import com.portafolioWeb.JeremiasV.Security.enums.RolName;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> fiandByRoleName(RolName rolName);
    
}
