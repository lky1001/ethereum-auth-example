package com.tistory.lky1001.ethereumauthexample.user.service;

import com.tistory.lky1001.ethereumauthexample.user.model.UserModel;
import com.tistory.lky1001.ethereumauthexample.user.user.UserDTO;

import java.util.List;

public interface UserService {

    void signup(UserDTO user);

    List<UserModel> getUsers();
}
