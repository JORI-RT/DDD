package eight.biz.service;

import eight.biz.domain.Question;

import java.util.List;

public interface QuestionService {
  List<Question> selectQuestions(List<Integer> genre, int size);
}
