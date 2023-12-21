package com.demo2.TestAPI.repository;


import com.demo2.TestAPI.admin.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminReposiory extends JpaRepository<UserModel, String>  {
}
