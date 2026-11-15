public class Account {

    private int balance;

        public void withdraw(int amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            }
            else {
                System.out.println("Insufficient Balance.");
            }
        }

        public void deposit(int amount) {
            balance += amount;
        }

        public int getBalance() {
            return balance;
        }
    }




