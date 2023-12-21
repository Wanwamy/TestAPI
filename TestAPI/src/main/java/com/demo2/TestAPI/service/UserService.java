package com.demo2.TestAPI.service;

import com.demo2.TestAPI.admin.model.UserModel;

import java.util.List;

public interface UserService {
    public String createUserModel(UserModel userModel);
    public String updateUserModel(UserModel userModel);
    public String deleteUserModel(String userID);
    public UserModel getUserModel(String userID);
    public List<UserModel> getAllUserModel();
}
