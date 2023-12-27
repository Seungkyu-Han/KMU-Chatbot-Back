package CoBo.Chatbot.Repository;

import CoBo.Chatbot.Data.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
