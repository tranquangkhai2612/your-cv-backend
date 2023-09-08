package com.fpt.yourcv.service;

import com.fpt.yourcv.dto.UserDTO;
import com.fpt.yourcv.entity.User;
import com.fpt.yourcv.repository.UserRepository;
import com.fpt.yourcv.service.implement.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements UserServiceInterface {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserDTO> getUsers(){
        List<User> users = userRepository.findAll();
        List<UserDTO> userDTOs = new ArrayList<>();

        for (User user: users){
            UserDTO userDTO = new UserDTO();
            userDTO.setId(user.getId());
            userDTO.setUsername(user.getUsername());
            userDTO.setEmail(user.getEmail());
            userDTO.setPassword(user.getPassword());
            userDTO.setFirstname(user.getFirstname());
            userDTO.setLastname(user.getLastname());
            userDTO.setDob(user.getDob());
            userDTO.setPhone(user.getPhone());
            userDTO.setAddress(user.getAddress());
            userDTO.setCreatedDate(user.getCreatedDate());
            userDTO.setUpdatedDate(user.getUpdatedDate());

            userDTOs.add(userDTO);
        }

        return userDTOs;
    }
}
