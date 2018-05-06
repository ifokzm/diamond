package com.ml.diamond.controller;

import com.ml.diamond.entity.User;
import com.ml.diamond.utils.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/user")
public class UserController {


    @PostMapping(value = "login")
    @ResponseBody
    public ResponseEntity<User> login() {
        User user = new User();
        user.setUsername("admin");
        user.setUrl("index.html");

        return new ResponseEntity<>(user).success();
 }


}
