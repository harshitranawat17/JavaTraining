package com.demo.blogApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.blogApp.entities.Role;

public interface RoleRepo extends JpaRepository<Role, Integer>{

}
