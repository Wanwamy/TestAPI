package com.demo2.TestAPI.service.impl;

import com.demo2.TestAPI.admin.model.UserModel;
import com.demo2.TestAPI.repository.UserRepository;
import com.demo2.TestAPI.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public String createUserModel(UserModel userModel) {
        userRepository.save(userModel);
        return "created";
    }

    @Override
    public String updateUserModel(UserModel userModel) {
        userRepository.save(userModel);
        return "update";
    }

    @Override
    public String deleteUserModel(String userID) {
        userRepository.deleteById(userID);
        return "deleted";
    }

    @Override
    public UserModel getUserModel(String userID) {
        return userRepository.findById(userID).get();
    }

    @Override
    public List<UserModel> getAllUserModel() {
        return userRepository.findAll();
    }
}
