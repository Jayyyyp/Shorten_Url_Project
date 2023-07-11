package kr.gamso.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter@Setter@ToString
@AllArgsConstructor@NoArgsConstructor@Builder
public class UserInfoDTO {
    private long memberNumber;
    private String id;
    private String email;
    private String pw;
    private LocalDateTime signupDate;
}
