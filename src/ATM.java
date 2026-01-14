import java.util.Scanner;

public class ATM {

    public void atm() {

        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);

        while (true) {
            Menu();
            System.out.print("Choose an option: ");
            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice){
                case 1:
                    bank.checkBalance();
                    break;
                case 2:
                    bank.withdraw();
                    break;
                case 3:
                    bank.deposit();
                    break;
                case 4:
                    System.out.println("Thank You, Goodbye.");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public void Menu() {
        System.out.println("1. View Balance");

        System.out.println("2. Withdraw Funds");

        System.out.println("3. Deposit funds");

        System.out.println("4. Exit");
    }

}
