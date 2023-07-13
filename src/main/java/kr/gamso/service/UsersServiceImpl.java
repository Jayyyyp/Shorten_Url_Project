package kr.gamso.service;

import kr.gamso.dto.userDTO.FindUserDTO;
import kr.gamso.dto.userDTO.SaveUserDTO;
import kr.gamso.dto.userDTO.UserInfoDTO;
import kr.gamso.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    UserRepository userRepository;

    @Autowired
    public UsersServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public void insertUser(SaveUserDTO saveUserDTO) {
        userRepository.saveUser(saveUserDTO);
    }
    public List<FindUserDTO> findAllUsers() {
        return userRepository.findAllUsers();
    }


    @Override
    public boolean selectUserId(String id) {
        int idCnt = userRepository.selectUserId(id);
        if (idCnt == 0){
            return true;
        }
        return false;
    }
    @Override
    public UserInfoDTO getUserInfoById(String id) {
        return userRepository.getUserInfoById(id);
    }
}

