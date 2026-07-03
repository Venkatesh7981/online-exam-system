package com.exam.service;

import java.util.List;

import com.exam.entity.Result;

public interface ResultService {

    Result addResult(Result result);

    List<Result> getAllResults();

    Result getResultById(Long id);

    Result updateResult(Long id, Result result);

    void deleteResult(Long id);
}