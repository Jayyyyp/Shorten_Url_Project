package kr.gamso.service;
import kr.gamso.dto.userDTO.SaveUserDTO;
import kr.gamso.dto.userDTO.FindUserDTO;
import kr.gamso.dto.userDTO.UserInfoDTO;


import java.util.List;

public interface UsersService {
    void insertUser(SaveUserDTO saveUserDTO);

    List<FindUserDTO> findAllUsers();

    UserInfoDTO getUserInfoById(String id);

    int selectUserId(String id);

}
