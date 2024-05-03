package com.hum.chatapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class UserDto {
    private Long id;


    @JsonProperty("user_name")
    private String userName;

    @JsonProperty("password")
    private String password;

    @JsonProperty("role_id")
    private Long roleId;

    @JsonProperty("full_name")
    private String fullName;


}