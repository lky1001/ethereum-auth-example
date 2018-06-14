package com.tistory.lky1001.ethereumauthexample.user.service;

import com.tistory.lky1001.ethereumauthexample.user.model.UserModel;
import com.tistory.lky1001.ethereumauthexample.user.repository.UserRepository;
import com.tistory.lky1001.ethereumauthexample.user.user.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional("transactionManager")
    @Override
    public void signup(UserDTO user) {
        UserModel userModel = new UserModel();

        userModel.setAddress("aaaa");
        userModel.setEmail("bbbb");
        userModel.setNickname("ccc");

        userRepository.save(userModel);
        logger.debug("id : {}", userModel.getId());
    }

    @Override
    public List<UserModel> getUsers() {
        return userRepository.findAll();
    }
}
