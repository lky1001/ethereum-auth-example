package com.tistory.lky1001.ethereumauthexample.user.controller;

import com.tistory.lky1001.ethereumauthexample.user.model.UserModel;
import com.tistory.lky1001.ethereumauthexample.user.service.UserService;
import com.tistory.lky1001.ethereumauthexample.user.user.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.OK)
    public String signup(@RequestBody UserDTO user) {
        userService.signup(UserDTO user);
        return "SUCCESS";
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UserModel> getUsers() {
        return userService.getUsers();
    }
}
