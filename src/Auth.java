public class Auth {

    public void authentication(Account account, Integer InputPin){
        Integer actualPin = account.getPin();
        if(InputPin.equals(actualPin)){
            System.out.println("Welcome " + account.getOwnerName());
            System.out.println("Your Account Number is: " + account.getAccountNumber());
            ATM atm = new ATM();
            atm.atm();
        } else {
            System.out.println("Access Denied");
        }
    }
}
