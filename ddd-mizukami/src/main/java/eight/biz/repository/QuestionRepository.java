package eight.biz.repository;

import eight.biz.domain.Question;

import java.util.List;

public interface QuestionRepository {
  List<Question> findQuestions(List<Integer> genre, int size);
}
