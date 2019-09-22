package eight.biz.domain;

import eight.biz.domain.businessLock.BusinessLock;
import eight.biz.domain.businessLock.BusinessLocked;
import eight.biz.domain.businessLock.BusinessLockedImpl;
import eight.biz.domain.businessLock.RootBusinessLock;
import eight.restapi.dto.QuestionRequestDto;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@RequiredArgsConstructor
public class Question implements BusinessLocked {
  private final BusinessLockedImpl businessLocked;


  /**
   * ID.
   */
  private int id;
  /**
   * 問題文.
   */
  private String questionSentence;

  /**
   * ジャンル.
   */
  private int genre;

  /**
   * 複数選択可能か.
   */
  private boolean multi;

  /**
   * 答え.
   */
  private int answer;

  /**
   * 製作日.
   */
  private LocalDateTime createTime;




  public static Question create(QuestionRequestDto paramRequest) {
    return null;
  }

  @Override
  public void lockedCheck(RootBusinessLock rootBusinessLock) {
    businessLocked.lockedCheck(rootBusinessLock);
  }

}
