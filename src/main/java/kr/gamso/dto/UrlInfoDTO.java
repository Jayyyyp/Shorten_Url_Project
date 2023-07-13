package kr.gamso.dto;


import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UrlInfoDTO {
    private int memberNumber;
    private String originalUrl;
    private String shortenUrl;
    private LocalDateTime shortenDate;
}
