package com.fpt.yourcv.service.implement;

import com.fpt.yourcv.dto.UserDTO;
import com.fpt.yourcv.entity.User;

import java.util.List;

public interface UserServiceInterface {
    List<UserDTO> getUsers();
}
