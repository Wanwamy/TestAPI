package com.demo2.TestAPI.admin.controller;

import com.demo2.TestAPI.admin.model.UserModel;
import com.demo2.TestAPI.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("admin/user")
public class UserController {
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
//chi tiet 1 user
    @GetMapping("{userID}")
    public UserModel getUserModelDetail(@PathVariable("userID") String userID)
    {
        return userService.getUserModel(userID);
    }
// chi tiet tat ca user trong table
    @GetMapping()
    public List<UserModel> getAllUserModelDetail()
    {
        return userService.getAllUserModel();
    }
    @PostMapping
    public String createUserModelDetail(@RequestBody UserModel userModel)
    {
        userService.createUserModel(userModel);
        return "created successfully";
    }
    @PutMapping
    public String updateUserModelDetail(@RequestBody UserModel userModel)
    {
        userService.updateUserModel(userModel);
        return "updated successfully";
    }
    @DeleteMapping("{userID}")
    public String deleteUserModelDetail(@PathVariable("userID") String userID)
    {
        userService.deleteUserModel(userID);
        return "deleted successfully";
    }

}
