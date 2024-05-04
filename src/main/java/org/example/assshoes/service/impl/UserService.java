package org.example.assshoes.service.impl;

import org.example.assshoes.dto.UserDTO;
import org.example.assshoes.model.User;
import org.example.assshoes.repository.UserRepository;
import org.example.assshoes.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User createUser(UserDTO userDTO) {

        if (userRepository.existsByFullname(userDTO.getFullname())) {
            throw new RuntimeException("User's fullname have already");
        }
        User newUser = User.builder()
                .fullname(userDTO.getFullname())
                .email(userDTO.getEmail())
                .phone_number(userDTO.getPhone_number())
                .password(userDTO.getPassword())
                .address(userDTO.getAddress())
                .date_of_birth(userDTO.getDate_of_birth())
                .activated(userDTO.isActive())
                .role(userDTO.isRole())
                .build();
        return userRepository.save(newUser);
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User updateUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public void deleteUser(Long userID) {

    }

    @Override
    public User login(String fullname, String password) {
        User loginUser = userRepository.findByFullname(fullname);
        if (loginUser != null) {
            if (loginUser.getPassword().equals(password)) {
                return loginUser;
            }
        }
        return null;
    }
}
