import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    public void testThatTheAccountWasCreated() {
        Account account = new Account();
        Assertions.assertEquals(0, account.getBalance());
    }

    @Test
    public void testThatMoneyCanBeDepositedToTheAccount() {
        Account account = new Account();
        Assertions.assertEquals(0, account.getBalance());

        account.deposit(10_000);
        Assertions.assertEquals(10_000, account.getBalance());
    }

    @Test
    public void testThatMoneyCanBeDepositedMultipleTimes() {
        Account account = new Account();

        account.deposit(5_000);
        account.deposit(10_000);
        account.deposit(15_000);

        Assertions.assertEquals(30_000, account.getBalance());
    }

    @Test
    public void testThatMoneyCanBeWithdrawnFromTheAccount() {
        Account account = new Account();

        account.deposit(10_000);
        account.withdraw(5_000);

        Assertions.assertEquals(5_000, account.getBalance());
    }

    @Test
    public void testThatMoneyCanBeWithdrawnMultipleTimes() {
        Account account = new Account();

        account.deposit(20_000);
        account.withdraw(5_000);
        account.withdraw(5_000);

        Assertions.assertEquals(10_000, account.getBalance());
    }

    @Test
    public void testThatTheEntireBalanceCanBeWithdrawn() {
        Account account = new Account();

        account.deposit(10_000);
        account.withdraw(10_000);

        Assertions.assertEquals(0, account.getBalance());
    }

    @Test
    public void testThatBalanceRemainsZeroWhenZeroIsDeposited() {
        Account account = new Account();

        account.deposit(0);

        Assertions.assertEquals(0, account.getBalance());
    }

    @Test
    public void testThatBalanceRemainsTheSameWhenZeroIsWithdrawn() {
        Account account = new Account();

        account.deposit(10_000);
        account.withdraw(0);

        Assertions.assertEquals(10_000, account.getBalance());
    }

    @Test
    public void testThatBalanceIsCorrectAfterMultipleTransactions() {
        Account account = new Account();

        account.deposit(50_000);
        account.withdraw(10_000);
        account.deposit(20_000);
        account.withdraw(5_000);

        Assertions.assertEquals(55_000, account.getBalance());
    }

    @Test
    public void testThatAccountBalanceDoesNotBecomeNegativeWhenMoreThanTheBalanceIsWithdrawn() {
        Account account = new Account();

        account.deposit(10_000);
        account.withdraw(15_000);

        Assertions.assertEquals(10_000, account.getBalance());
    }

    @Test
    public void testThatPinCanBeSet() {
        Account account = new Account();

        account.setPin("1234");

        Assertions.assertEquals("1234", account.getPin());
    }

    @Test
    public void testThatCorrectPinCanBeValidated() {
        Account account = new Account();

        account.setPin("1234");

        Assertions.assertTrue(account.validatePin("1234"));
    }

    @Test
    public void testThatIncorrectPinCannotBeValidated() {
        Account account = new Account();

        account.setPin("1234");

        Assertions.assertFalse(account.validatePin("5678"));
    }

    @Test
    public void testThatPinCanBeChanged() {
        Account account = new Account();

        account.setPin("1234");
        account.changePin("1234", "5678");

        Assertions.assertEquals("5678", account.getPin());
    }

    @Test
    public void testThatOldPinCannotBeUsedAfterPinHasBeenChanged() {
        Account account = new Account();

        account.setPin("1234");
        account.changePin("1234", "5678");

        Assertions.assertFalse(account.validatePin("1234"));
    }

    @Test
    public void testThatPinCannotBeChangedWithIncorrectOldPin() {
        Account account = new Account();

        account.setPin("1234");
        account.changePin("9999", "5678");

        Assertions.assertEquals("1234", account.getPin());
    }
}
