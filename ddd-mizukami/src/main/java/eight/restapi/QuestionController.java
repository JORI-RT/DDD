package eight.restapi;

import eight.biz.domain.Question;
import eight.biz.service.QuestionService;
import eight.restapi.dto.QuestionRequestDto;
import eight.restapi.dto.QuestionResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Validated
@RestController
@RequiredArgsConstructor
public class QuestionController {
  private final QuestionService questionService;

  @RequestMapping("/")
  public QuestionResponseDto hogeApi(@Valid QuestionRequestDto requestDto) throws Exception {
    Question question = Question.create(requestDto);


    return new QuestionResponseDto("aiueo");
  }

}
