package eight.biz.domain.businessLock;

import lombok.Data;

@Data
public class BusinessLock extends RootBusinessLock {
  private int LockStatus;
  private int updateTime;
}
