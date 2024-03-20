package com.erichgamma.api.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erichgamma.api.enums.Messenger;

import lombok.RequiredArgsConstructor;

@RestController
@CrossOrigin(origins = "http://localhost:3000/login")
@RequiredArgsConstructor
public class UserController {
    private final UserService userservice;
    
    // public Messenger join(Scanner scan) {
    //     System.out.println("[INPUT] ID PW Name Phone Job Height Weight");
    //     return userService.join(User.builder()
    //             .username(scan.next())
    //             .password(scan.next())
    //             .name(scan.next())
    //             .phone(scan.next())
    //             .job(scan.next())
    //             .height(Double.parseDouble(scan.next()))
    //             .weight(Double.parseDouble(scan.next()))
    //             .build());
    // }

    // public Messenger login(Scanner scan) {
    //     System.out.println("[INPUT] ID PW");
    //     return userService.login(User.builder()
    //             .username(scan.next())
    //             .password(scan.next())
    //             .build());
    // }
}
