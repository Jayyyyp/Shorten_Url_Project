package kr.gamso.repository;


import kr.gamso.dto.userDTO.FindUserByIdDTO;
import kr.gamso.dto.userDTO.FindUserDTO;
import kr.gamso.dto.userDTO.SaveUserDTO;
import kr.gamso.dto.userDTO.UserInfoDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserRepository {
    List<FindUserDTO> findAllUsers();

    void saveUser(SaveUserDTO saveUsersDTO);

    FindUserByIdDTO findUserById(String id);

    int selectUserId(String id);

    void saveUser();

    UserInfoDTO getUserInfoById(String id);

}
