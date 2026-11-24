public class Account {

        private int balance;
        private String pin;

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

        public void setPin(String pin) {
            this.pin = pin;
        }

        public boolean validatePin(String pin) {
            return this.pin.equals(pin);
        }

        public void changePin(String oldPin, String newPin) {
            if (validatePin(oldPin)) {
                this.pin = newPin;
            }
        }

        public String getPin() {
            return pin;
        }
    }
