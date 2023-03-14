package bcoder.api.repository;

import bcoder.api.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer> {
  UserModel findUserModelByLogin(String login);
}
