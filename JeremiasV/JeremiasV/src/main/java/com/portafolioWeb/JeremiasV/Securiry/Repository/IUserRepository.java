
package com.portafolioWeb.JeremiasV.Securiry.Repository;

import com.portafolioWeb.JeremiasV.Security.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer>{
    Optional<User> findByNombreUser(String userName);
    boolean existsByNameUser(String userName);
    boolean existsByEmail(String email);
}
