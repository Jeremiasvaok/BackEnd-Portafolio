package com.portafolioWeb.JeremiasV.Security.Sevirce;

import com.portafolioWeb.JeremiasV.Security.entity.User;
import com.portafolioWeb.JeremiasV.Securiry.Repository.IUserRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {
      @Autowired IUserRepository iuserRepository;
  
 public Optional<User> getByNameUserName(String userName){
     return iuserRepository.findByNameUser(userName);
 }
 
 public boolean existsByNameUsers(String userName){
   return iuserRepository.existsByNameUser(userName);
 }
  public boolean existsByEmail(String email){
   return iuserRepository.existsByEmail(email);
 }

  public void save(User user){
      iuserRepository.save(user);
  }
}
