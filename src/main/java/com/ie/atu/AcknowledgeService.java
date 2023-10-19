package com.ie.atu;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class AcknowledgeService {

    public String ackMessage(UserDetails user){
        String message = "Thank you" + user.getName() + " your request has been received";
        return message;
    }

}
