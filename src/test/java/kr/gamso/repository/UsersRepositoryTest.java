package kr.gamso.repository;

<<<<<<< HEAD
import kr.gamso.dto.FindUserByIdDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

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

        // assertEquals();
>>>>>>> c39f4a66f36498ebd49f3e2ea61c04ca7dadc285
    }
}
