/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolioWeb.JeremiasV.Security.Sevirce;

import com.portafolioWeb.JeremiasV.Securiry.Repository.IRoleRepository;
import com.portafolioWeb.JeremiasV.Security.entity.Role;
import com.portafolioWeb.JeremiasV.Security.enums.RolName;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class RoleService {
  @Autowired IRoleRepository iroleRepository;
  
 public Optional<Role> getByRoleName(RolName rolName){
     return iroleRepository.fiandByRoleName(rolName);
 }
 
 public void save(Role role){
     iroleRepository.save(role);
 }
}
