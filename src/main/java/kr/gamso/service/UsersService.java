package kr.gamso.service;

import kr.gamso.dto.DuplicateCheckIdDTO;
import kr.gamso.dto.SaveUserDTO;
import kr.gamso.dto.FindUserDTO;
import kr.gamso.dto.UserInfoDTO;

import java.util.List;

public interface UsersService {
    void insertUser(SaveUserDTO saveUserDTO);

    boolean selectUserId(String id);

    List<FindUserDTO> findAllUsers();

    UserInfoDTO getUserInfoBy(String id);
}
