package com.example.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.shopping.model.users.User;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long>{
	Optional<User> findByUsername(String username);
}
