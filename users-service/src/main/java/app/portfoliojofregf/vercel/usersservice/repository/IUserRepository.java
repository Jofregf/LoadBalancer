package app.portfoliojofregf.vercel.usersservice.repository;

import app.portfoliojofregf.vercel.usersservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
}
