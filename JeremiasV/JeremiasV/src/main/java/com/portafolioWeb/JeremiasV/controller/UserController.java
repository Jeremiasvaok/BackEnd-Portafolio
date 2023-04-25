
package com.portafolioWeb.JeremiasV.controller;

import com.portafolioWeb.JeremiasV.model.Users;
import com.portafolioWeb.JeremiasV.service.ImpUsers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    
    @Autowired
    private ImpUsers impUserService;
    
    @PostMapping("/create/user")
    public void createUser(@RequestBody Users user){
        impUserService.createUsers(user);
    }
    
    @GetMapping("/users/all")
    @ResponseBody
      public List<Users> allUsers(){
          return impUserService.getAllUsers();
    }
    
    @GetMapping("/user")
    public Users allUserrById(@RequestParam Long id){
        return impUserService.findUser(id);
    }
  
    @DeleteMapping("delete/user/{id")
    public void deleteuser(@PathVariable Long id){
        impUserService.deleteUser(id);
    }
}
