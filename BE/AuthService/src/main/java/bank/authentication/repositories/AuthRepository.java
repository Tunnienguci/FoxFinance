package bank.authentication.repositories;

import bank.authentication.entities.Auth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<Auth,String> {
    // Find username in database
    Auth findByUsername(String username);
}
