package com.demo2.TestAPI.repository;


import com.demo2.TestAPI.admin.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, String>  {
}
