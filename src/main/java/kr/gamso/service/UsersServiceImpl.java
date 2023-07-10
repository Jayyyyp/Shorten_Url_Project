package kr.gamso.service;

import kr.gamso.dto.FindUserDTO;
import kr.gamso.dto.SaveUserDTO;
import kr.gamso.dto.UserInfoDTO;
import kr.gamso.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    UserRepository userRepository;

    @Autowired
    public UsersServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void insertUser(SaveUserDTO saveUserDTO) {
        userRepository.saveUser();
    }

    @Override
    public boolean selectUserId(String id) {
        return false;
    }

    @Override
    public List<FindUserDTO> findAllUsers() {
        return null;
    }

    @Override
    public UserInfoDTO getUserInfoBy(String id) {
        return null;
    }
}

