package kr.gamso.service;

import kr.gamso.dto.FindUserDTO;
import kr.gamso.dto.SaveUserDTO;
import kr.gamso.dto.UrlInfoDTO;
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
        userRepository.saveUser(saveUserDTO);
    }

    @Override
    public boolean selectUserId(String id) {
        int count = userRepository.selectUserId(id);
        return count > 0;
    }

    @Override
    public List<FindUserDTO> findAllUsers() {
        return userRepository.findAllUsers();
    }

    @Override
    public UserInfoDTO getUserInfoById(String id) {
        return userRepository.getUserInfoById(id);
    }

    @Override
    public List<UrlInfoDTO> getUrlInfoByMemberNumber(long memberNumber) {
        return userRepository.getUrlInfoByMemberNumber(memberNumber);
    }

}

