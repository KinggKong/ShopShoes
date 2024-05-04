package org.example.assshoes.service;

import org.example.assshoes.dto.UserDTO;
import org.example.assshoes.model.User;

import java.util.List;

public interface IUserService {
    User createUser(UserDTO userDTO) ;

    List<User> getAllUsers();

    User updateUser(UserDTO userDTO);

    void deleteUser(Long userID);

    User login(String fullname, String password);
}
