package kr.gamso.entity;

import lombok.*;

<<<<<<< HEAD
=======
import java.time.LocalDateTime;

>>>>>>> upstream/dev
@Getter@ToString
@AllArgsConstructor@NoArgsConstructor@Builder
public class Users {
    private long memberNumber;
    private String id;
    private String email;
    private String pw;
<<<<<<< HEAD
}
=======
    private LocalDateTime signupDate;
}
>>>>>>> upstream/dev
