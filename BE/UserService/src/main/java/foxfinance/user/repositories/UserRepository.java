package foxfinance.user.repositories;

import foxfinance.user.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    // Get User's Information by Account Number
    User findByAccountNum(Integer req);

    // Get User's Information by fullName
    User findByFullName(String fullName);
}
