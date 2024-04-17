package com.zainahme.websocket.chat;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ChatMessage {

    private MessageType type;
    private String content;
    private String sender;
    private LocalDateTime timestamp;

}
