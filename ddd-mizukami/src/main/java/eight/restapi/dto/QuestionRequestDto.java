package eight.restapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class QuestionRequestDto {
  @NotNull
  private String piyo;
}
