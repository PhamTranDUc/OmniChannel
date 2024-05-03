package com.hum.chatapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginDto {
    @JsonProperty("user_name")
    private String userName;

    @JsonProperty("password")
    private String password;
}