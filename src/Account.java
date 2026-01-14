public class Account {
    private String accountNumber;
    private double balance;
    private String ownerName;
    private Integer pin;
    java.util.Scanner sc = new java.util.Scanner(System.in);

    public Integer getPin(){
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}


