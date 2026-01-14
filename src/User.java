import java.util.Random;
import java.util.Scanner;

public class User extends Account {

    Scanner sc = new Scanner(System.in);
    Auth auth = new Auth();
    public User() {
        System.out.println("Are you a new User? Please Register Yourself.");
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        setOwnerName(name);
        System.out.println("Set your 4-digit PIN: ");
        Integer pin  = sc.nextInt();
        setPin(pin);
        String accountNumber = generateAccountNumber();
        setAccountNumber(accountNumber);
        System.out.println("Registration Successful.");

        LoginUser();

    }

    public void LoginUser() {
        System.out.println("Please Enter you Pin: ");
        Integer InputPin = sc.nextInt();
        auth.authentication(this, InputPin);

    }

    public static final String DIGITS = "0123456789";

    public static final Random random = new Random();


    public static String generateAccountNumber(){
        int length = 15;
        StringBuilder sb = new StringBuilder(length);
        for(int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(DIGITS.length());
            sb.append(DIGITS.charAt(randomIndex));
        }
        return sb.toString();
    }
}
