package com.erichgamma.api.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erichgamma.api.enums.Messenger;

import io.micrometer.common.lang.NonNull;
import lombok.RequiredArgsConstructor;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;
    
    @RequestMapping(path = "/api/users/login")
    public Map<String, ?> login(@RequestBody Map<String, ?> reqMap){
        Map<String, String> resMap = new HashMap<>();
        String username = (String)reqMap.get("username"), pw = (String)reqMap.get("pw");
        System.out.println("Request : " + username + ", " + pw);
        resMap.put("username", username);
        resMap.put("pw", pw);
        resMap.put("login", "success");
        return resMap;
    }

    @RequestMapping(path = "/api/users/join")
    public Map<String, ?> join(@RequestBody Map<String, ?> reqMap){
        Map<String, Messenger> resMap = new HashMap<>();
        resMap.put("message", 
        userRepository.findById(
            userRepository.save(User.builder()
            .username((String)reqMap.get("username"))
            .password((String)reqMap.get("password"))
            .name((String)reqMap.get("name"))
            .phone((String)reqMap.get("phone"))
            .job((String)reqMap.get("job"))
            .height(Double.parseDouble((String)reqMap.get("height")))
            .weight(Double.parseDouble((String)reqMap.get("weight"))).build())
        .getId())
        .isPresent()
        ? Messenger.SUCCESS 
        : Messenger.FAIL);
        return resMap;
    }
}
