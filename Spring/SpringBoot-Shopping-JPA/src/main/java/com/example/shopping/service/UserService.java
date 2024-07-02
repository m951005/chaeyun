package com.example.shopping.service;

import lombok.RequiredArgsConstructor;
import com.example.shopping.model.users.User;
import com.example.shopping.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    // 회원가입
    @Transactional
    public void register(User user) {
        userRepository.save(user);
    }

    public User findUser(String username) {
        Optional<User> findUser = userRepository.findByUsername(username);
        return findUser.orElse(null);
    }

}
