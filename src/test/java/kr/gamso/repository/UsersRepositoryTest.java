package kr.gamso.repository;

<<<<<<< HEAD
<<<<<<< HEAD
import kr.gamso.dto.FindUserByIdDTO;
=======
import kr.gamso.dto.FindUserDTO;
import kr.gamso.dto.SaveUserDTO;
import org.junit.jupiter.api.DisplayName;
>>>>>>> upstream/dev
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

<<<<<<< HEAD
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
=======
import kr.gamso.dto.SaveUserDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;
>>>>>>> c39f4a66f36498ebd49f3e2ea61c04ca7dadc285

@SpringBootTest
public class UsersRepositoryTest {

<<<<<<< HEAD
    @Autowired
    UsersRepository usersRepository;

    @Test
    @Transactional
    public void findPwByIdTest(){
        String id = "asd";
        String pw = "1234";
        String email = "hjk@naver.com";

        FindUserByIdDTO user = usersRepository.findUserById(id);

        assertThat(user.getEmail()).isEqualTo(email);
=======
=======
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class UsersRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Test
    @Transactional
    @DisplayName("전체 회원 리스트")
    public void findAllUsersTest(){
        List<FindUserDTO> userDTOList = userRepository.findAllUsers();

        assertEquals(3, userDTOList.size());
    }

>>>>>>> upstream/dev
    @Test
    @Transactional
    @DisplayName("user 회원가입 테스트")
    public void saveUserTest(){
        String id = "wsr";
        String email = "wqe@naver.com";
        String pw = "1231asd2";

        SaveUserDTO saveUserDTO = SaveUserDTO.builder()
                .id(id)
                .email(email)
                .pw(pw)
                .build();

<<<<<<< HEAD
        // assertEquals();
>>>>>>> c39f4a66f36498ebd49f3e2ea61c04ca7dadc285
=======
        userRepository.saveUser(saveUserDTO);
        List<FindUserDTO> userDTOList = userRepository.findAllUsers();
        assertEquals(4, userDTOList.size());
    }

    @Test
    @Transactional
    @DisplayName("중복 id 확인")
    public void selectUserIDTest(){
        String id = "asd";

       int cnt = userRepository.selectUserId(id);

       assertEquals(1, cnt);
>>>>>>> upstream/dev
    }
}
