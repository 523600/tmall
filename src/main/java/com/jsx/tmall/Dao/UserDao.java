package com.jsx.tmall.Dao;

import com.jsx.tmall.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long> {
}
