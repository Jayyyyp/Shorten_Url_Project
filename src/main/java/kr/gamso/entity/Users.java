package kr.gamso.entity;

import lombok.*;

@Getter@ToString@Setter
@AllArgsConstructor@NoArgsConstructor@Builder
public class Users {
    private long memberNumber;
    private String id;
    private String email;
    private String pw;
}

