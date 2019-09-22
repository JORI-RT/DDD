package eight.biz.repository;


import eight.biz.domain.businessLock.BusinessLock;

public interface BusinessLockRepository {
    BusinessLock findByQuestionId(int id);

}
