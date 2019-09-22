package eight.biz.domain.businessLock;

import eight.biz.repository.BusinessLockRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BusinessNotLockedImpl implements BusinessNotLocked {
  private final BusinessLockRepository repository;

  @Override
  public void notLockedCheck(RootBusinessLock rootBusinessLock) {
    repository.findByQuestionId(rootBusinessLock.questionId);

    // なんやかんや
    throw new RuntimeException();

  }
}
