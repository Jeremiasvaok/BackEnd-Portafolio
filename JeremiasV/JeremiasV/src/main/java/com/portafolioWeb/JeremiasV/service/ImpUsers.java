
package com.portafolioWeb.JeremiasV.service;

import com.portafolioWeb.JeremiasV.model.Users;
import com.portafolioWeb.JeremiasV.repository.IUserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ImpUsers implements IUsersService{
 
    @Autowired
    private IUserRepository iuserRepository;
    
    @Override
    public void createUsers(Users user) {
     iuserRepository.save(user);
    }

    @Override
    public List<Users> getAllUsers() {
     return iuserRepository.findAll();
    }

    @Override
    public Users findUser(Long id){
    return iuserRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteUser(Long id) {
    iuserRepository.deleteById(id);
    }

    
}
