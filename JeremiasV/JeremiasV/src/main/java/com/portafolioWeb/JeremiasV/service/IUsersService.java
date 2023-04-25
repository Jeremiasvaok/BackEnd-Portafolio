

package com.portafolioWeb.JeremiasV.service;

import com.portafolioWeb.JeremiasV.model.Users;
import java.util.List;

public interface IUsersService {
    
    public void createUsers(Users user);
    public List<Users> getAllUsers();
    public Users findUser(Long id);
    public void deleteUser(Long id);
    
}
