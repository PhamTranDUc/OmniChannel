package com.hum.chatapp.facebook;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter @Setter
public class BoxChat {
    private String id;
    private String senderId;
    private String userName;
    private String recipientId;
    private String namePage;
    private String lastMessage;
}
