
package com.portafolioWeb.JeremiasV.repository;

import com.portafolioWeb.JeremiasV.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IUserRepository extends JpaRepository<Users, Long>{
    
}
