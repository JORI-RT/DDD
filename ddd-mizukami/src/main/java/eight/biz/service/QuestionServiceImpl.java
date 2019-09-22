package eight.biz.service;

import eight.biz.domain.Question;
import eight.biz.repository.QuestionRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Data
public class QuestionServiceImpl implements QuestionService {
  private final QuestionRepository repository;

  private List<Question> questionList;

  @Override
  public List<Question> selectQuestions(List<Integer> genre, int size) {
    return repository.findQuestions(genre, size);
  }


}
