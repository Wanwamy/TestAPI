package com.demo2.TestAPI.admin.controller;

import com.demo2.TestAPI.admin.model.UserModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin/user")

public class UserController {
    UserModel userModel;

    @GetMapping("{userID}")
    public UserModel getUserModelDetail(String userID)
    {
        return userModel;
    }

    @PostMapping
    public String createUserModelDetail(@RequestBody UserModel userModel)
    {
        this.userModel = userModel;
        return "created successfully";
    }
    @PutMapping
    public String updateUserModelDetail(@RequestBody UserModel userModel)
    {
        this.userModel = userModel;
        return "updated successfully";
    }
    @DeleteMapping("{userID}")
    public String deleteUserModelDetail(@RequestBody UserModel userModel)
    {
        this.userModel = null;
        return "deleted successfully";
    }

}
