import java.util.Scanner;

public class Bank extends Account{

    double amount;

    double currentAmount;

    Scanner sc = new Scanner(System.in);

    public void checkBalance(){
        System.out.println("Your current Bank Balance:" + " " + getBalance());
    }

    public void deposit(){
        System.out.println("Enter the Amount You want to Deposit: ");
        amount = sc.nextDouble();
        currentAmount = amount + getBalance();
        setBalance(currentAmount);
        System.out.println("Deposit Successful.");
    }

    public void withdraw() {
        System.out.println("Enter the amount you want to withdraw: ");
        amount = sc.nextDouble();
        if(getBalance() == 0 || getBalance() < amount) {
            System.out.println("Insufficient Balance.");
            return;
        } else {
            System.out.println("Withdraw Successful.");
            currentAmount = getBalance() - amount;
            setBalance(currentAmount);
        }
    }


}
