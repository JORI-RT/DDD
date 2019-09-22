package eight.biz.domain.businessLock;

import eight.biz.repository.BusinessLockRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;


public interface BusinessLocked {
  void lockedCheck(RootBusinessLock rootBusinessLock);
}
