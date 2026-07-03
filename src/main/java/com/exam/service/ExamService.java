package com.exam.service;

import java.util.List;

import com.exam.entity.Exam;

public interface ExamService {

	Exam addExam(Exam exam);

	List<Exam> getAllExams();

	Exam getExamById(Long id);

	Exam updateExam(Long id, Exam exam);

	void deleteExam(Long id);

}