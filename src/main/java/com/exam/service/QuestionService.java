package com.exam.service;

import java.util.List;

import com.exam.entity.Question;

public interface QuestionService {

    Question addQuestion(Question question);

    List<Question> getAllQuestions();

    Question getQuestionById(Long id);

    List<Question> getQuestionsByExamId(Long examId);

    Question updateQuestion(Long id, Question question);

    void deleteQuestion(Long id);

}