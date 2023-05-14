/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolioWeb.JeremiasV.Security.Sevirce;

import com.portafolioWeb.JeremiasV.Security.entity.User;
import com.portafolioWeb.JeremiasV.repository.IUserRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {
      @Autowired IUserRepository iuserRepository;
  
 public Optional<User> getByNameUserName(String nameUser){
     return iuserRepository.findByNameUser(nameUser);
 }
 
 public boolean existsByNameUser(String nameUser){
   return iuserRepository.
 }
}
