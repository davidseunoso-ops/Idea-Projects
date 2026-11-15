import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    public void testThatTheAccountWasCreated() {
        Account account = new Account();
        Assertions.assertEquals( 0, account.getBalance());
    }

    @Test
    public void testThat5kHasBeenDepositedToTheAccount() {
        Account account = new Account();
        Assertions.assertEquals(0, account.getBalance());

        account.deposit(10_000);
        Assertions.assertEquals(10_000, account.getBalance());

    }

    @Test
    public void testThatMoneyCanBeWithdrawnFromTheAccount() {
        Account account = new Account();

        account.deposit(10_000);
        account.withdraw(5_000);
        
        Assertions.assertEquals(5_000, account.getBalance());
    }
}
