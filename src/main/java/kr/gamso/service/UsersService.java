package kr.gamso.service;

import kr.gamso.dto.*;

import java.util.List;

public interface UsersService {
    void insertUser(SaveUserDTO saveUserDTO);

    boolean selectUserId(String id);

    List<FindUserDTO> findAllUsers();

    UserInfoDTO getUserInfoById(String id);

}
