package BankSystem;

class AccountHolder {
    protected int accountNumber;
    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "AccountHolder{" +
                "accountNumber=" + accountNumber +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailID='" + emailID + '\'' +
                '}';
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    private String name;
    private String phoneNumber;
    protected String emailID;

}

class BankAccount {
    protected int savings;
    protected int currentBalance;
    private AccountHolder accountHolder;


    public void display() {
        System.out.println("BankAccount " +
                "\nsavings=" + savings +
                ",\n currentBalance=" + currentBalance +
                ",\n accountHolder=" + accountHolder.toString() +
                ",\n accountStatus=" + accountStatus);    }

    public int getSavings() {
        return savings;
    }

    public void setSavings(int savings) {
        this.savings = savings;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public AccountHolder getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(AccountHolder accountHolder) {
        this.accountHolder = accountHolder;
    }

    public boolean isAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(boolean accountStatus) {
        this.accountStatus = accountStatus;
    }

    private boolean accountStatus;

}

public class MainApplication {
    public static void main(String[] args) {

        AccountHolder accountHolder = new AccountHolder();
        accountHolder.setAccountNumber(123);
        accountHolder.setEmailID("abc@133");
        accountHolder.setName("Hojn");
        accountHolder.setPhoneNumber("234567890");


        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountHolder(accountHolder);
        bankAccount.setAccountStatus(true);
        bankAccount.setSavings(0);
        bankAccount.setCurrentBalance(10000);

        bankAccount.display();

    }

}
