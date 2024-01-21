public class Account {
    public int accountNumber;
    public int accountBalance;
    public String customerName;
    public String email;
    public int phoneNumber;

    public Account(int accountNumber, int accountBalance, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void withdrawal(int amount){
        if(amount > this.accountBalance) {
            System.out.println("Insufficient funds for this withdrawal, your account balance is "+ this.accountBalance);
        } else {

            this.accountBalance -= amount;
        }
    }

    public void deposit(int amount){
        this.accountBalance += amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
