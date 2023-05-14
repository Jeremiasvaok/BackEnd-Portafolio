
package com.portafolioWeb.JeremiasV.Security.entity;

import java.util.Collection;


public class UserMain implements UserDerails{
    private String nombre;
    private String userName;
    private String email;
    private String password;
    private Collection<? extends GrantedAuthority> authorities;
    
    
}
