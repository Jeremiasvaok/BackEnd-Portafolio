
package com.portafolioWeb.JeremiasV.Securiry.Repository;

import com.portafolioWeb.JeremiasV.Security.entity.User;
import com.portafolioWeb.JeremiasV.model.Users;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IUserRepository extends JpaRepository<Users, Long>{

    public Optional<User> findByNameUser(String nameUser);

    public void save(User user);

    public boolean existsByNameUser(String userName);

    public boolean existsByEmail(String email);
    
}
