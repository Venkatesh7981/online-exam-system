package com.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {

}
