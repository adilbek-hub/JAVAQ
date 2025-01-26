package com.example.quize_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {

    @Autowired
    private QuizQuestionRepository repository;

    @GetMapping("/questions")
    public List<QuizQuestion> getAllQuestions() {
        return repository.findAll();
    }

    @PostMapping("/add")
    public QuizQuestion addQuestion(@RequestBody QuizQuestion question) {
        return repository.save(question);
    }
}
