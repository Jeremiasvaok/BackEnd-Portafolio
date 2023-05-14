
package com.portafolioWeb.JeremiasV.Security.Sevirce;

import com.portafolioWeb.JeremiasV.Security.entity.User;
import com.portafolioWeb.JeremiasV.Security.entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserDetailsI implements UserDetailsService {
    @Autowired UserService userService; 

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
     User user = userService.getByNameUserName(username).get();
     return UsuarioPrincipal.build(user);
    }
}
    

