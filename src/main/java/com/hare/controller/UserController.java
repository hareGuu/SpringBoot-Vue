package com.hare.controller;

import com.hare.model.User;
import com.hare.utils.TokenUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) throws JsonProcessingException {
        String token = TokenUtil.sign(new User(username, password));
        HashMap<String, Object> hs = new HashMap<>();
        hs.put("token", token);
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(hs);
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ResponseBody
    public String test(@RequestBody Map<String, Object> para) throws JsonProcessingException {
        HashMap<String, Object> hs = new HashMap<>();
        hs.put("data", "data");
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(hs);
    }
}
