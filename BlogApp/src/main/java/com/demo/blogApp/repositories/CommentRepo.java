package com.demo.blogApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.blogApp.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
