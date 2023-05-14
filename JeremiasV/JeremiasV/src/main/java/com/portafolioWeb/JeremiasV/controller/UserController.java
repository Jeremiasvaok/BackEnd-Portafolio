
package com.portafolioWeb.JeremiasV.controller;

import com.portafolioWeb.JeremiasV.model.Users;
import com.portafolioWeb.JeremiasV.service.ImpUsers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    
    @Autowired
    private ImpUsers impUserService;
    
    @PostMapping("/create/user")
    public String createUser(@RequestBody Users user){
            impUserService.createUsers(user);
            return "La persona con el id: " + user.getId() + " fue creada correctamente";
    }
    
    @GetMapping("/users/all")
    @ResponseBody
      public List<Users> allUsers(){
         return impUserService.getAllUsers();
          
    }
    @PutMapping("/edit/user/{id}")
    public String editUser(@PathVariable Long id,
                           @RequestParam("nombre") String newNombre,
                           @RequestParam("apellido") String newApellido,
                           @RequestParam("img") String newImg){
    Users user = impUserService.findUser(id);
     user.setNombre(newNombre);
     user.setApellido(newApellido);
     user.setImg(newImg);
     impUserService.createUsers(user);
     
     return "La usuario con el id " + user.getId() + " fue autualizado con exito " + user;
        
    }
    
    @GetMapping("/user")
    public Users allUserrById(@RequestParam Long id){
        return impUserService.findUser(id);
    }
  
    @DeleteMapping("delete/user/{id}")
    public String deleteuser(@PathVariable Long id){
        impUserService.deleteUser(id);
        return "El usuario con el id: " + id + " se ha eliminado correctamente";
    }
}
