package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.LoginData;

public interface LoginDataDAO extends JpaRepository<LoginData,Integer>{

}
