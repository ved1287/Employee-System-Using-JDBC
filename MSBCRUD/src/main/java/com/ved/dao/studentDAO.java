package com.ved.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ved.bean.Student;
@Repository
public interface studentDAO extends JpaRepository<Student, Integer> {

}

