package kr.gamso.dto.userDTO;

import lombok.*;

@Getter@Setter@ToString
@AllArgsConstructor@Builder
@NoArgsConstructor
public class FindUserByIdDTO {
    private String id;
    private String email;
    private String pw;
}
