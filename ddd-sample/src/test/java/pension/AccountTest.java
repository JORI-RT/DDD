package pension;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class AccountTest {
    @Nested
    class CreateAccount {
        AccountRepository accountRepository;

        @BeforeEach
        void setUp() {
            accountRepository = new AccountRepository();
        }

        @DisplayName("正常系")
        @Test
        void createAccount() {
            // arrange
            Company companyA = new Company("A");
            Contractor takaki = new Contractor("takaki", companyA);
            AccountFactory accountFactory = new AccountFactory(accountRepository);
            // act
            Account account = accountFactory.createAccount(takaki);
            // assert
            assertThat(account.getContractor().getName()).isEqualTo("takaki");
            assertThat(account.getContractor().getCompany().getName()).isEqualTo("A");
        }

        @DisplayName("すでに口座を持っている契約者が口座を作ろうとした場合エラー")
        @Test
        void newMembership_Error01() {
            // arrange
            Company companyA = new Company("A");
            Contractor takaki = new Contractor("takaki", companyA);
            AccountFactory accountFactory = new AccountFactory(accountRepository);
            // act
            Account acount = accountFactory.createAccount(takaki);

            // assert
            assertThatThrownBy(
                    () -> accountFactory.createAccount(takaki))
                    .isInstanceOf(DuplicateAccountException.class);
        }
    }

    @Nested
    class buyStock{// TODO 金融商品を買うという表現をもっといい単語で表したい

        @DisplayName("銘柄Aを買ったら、口座にAが入る、最終取引日が買った日になる")
        @Test
        void name() {

        }
    }

    @Nested
    class changeCompany{
        @DisplayName("6月")
        @Test
        void changeCompany01() {

        }
    }
}