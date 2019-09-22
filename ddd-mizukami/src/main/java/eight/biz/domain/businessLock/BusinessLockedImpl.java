package eight.biz.domain.businessLock;

import eight.biz.repository.BusinessLockRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BusinessLockedImpl implements BusinessLocked {
  private final BusinessLockRepository repository;
  @Override
  public void lockedCheck(RootBusinessLock rootBusinessLock) {
    repository.findByQuestionId(rootBusinessLock.questionId);

    // なんやかんや
    throw new RuntimeException();
  }
}
