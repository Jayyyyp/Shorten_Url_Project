package kr.gamso.repository;

import kr.gamso.dto.FindUserByIdDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UsersRepositoryTest {

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
    }
}
