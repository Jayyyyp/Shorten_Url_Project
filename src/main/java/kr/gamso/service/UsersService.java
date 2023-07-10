package kr.gamso.service;

<<<<<<< HEAD
import kr.gamso.dto.DuplicateCheckIdDTO;
import kr.gamso.dto.SaveUserDTO;

public interface UsersService {
    void InsertUser(SaveUserDTO saveUserDTO);
    void duplicateCheckId(DuplicateCheckIdDTO duplicateCheckIdDTO);

=======
import kr.gamso.dto.FindUserDTO;
import kr.gamso.dto.SaveUserDTO;

import java.util.List;

public interface UsersService {
    List<FindUserDTO> findAllUsers();
    void insertUser(SaveUserDTO saveUserDTO);

    boolean selectUserId(String id);
>>>>>>> upstream/dev
}
