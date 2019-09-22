package eight.biz.domain.businessLock;

import lombok.Data;

@Data
public abstract class RootBusinessLock {
  int questionId;
  int updateUserId;
  int version;
}

