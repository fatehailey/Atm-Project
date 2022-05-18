import java.util.Scanner;

public class Atm {

    private int balance;
    private String pin;

    //getter method
    public int getBalance() {
        return balance;
    }

    //constructor
    public Atm(int balance, String pin) {
        this.balance = balance;
        this.pin = pin;
    }

    //behavioral methods
    public void deposit(int amountToDeposit){
        balance +=amountToDeposit;
    }
    public void withdraw(int amountToWithdraw){
        if(amountToWithdraw <= balance) {
            balance -= amountToWithdraw;
        } else {
            System.out.println("Insufficient funds to make with the withdraw");
        }
    }
    public boolean accessAccount(String pinEntered){
        if(pinEntered.equals(pin)) {
            return true;
        } else{
            return false;
        }
    }

    public static class AtmApp {

        public static void main(String args){
            Scanner input = new Scanner(System.in);
            Atm myAtm = new Atm ( 500, "1234");

            System.out.println("Welcome to Bank of We Can Code IT");
            System.out.println("Please enter your pin");
            String userEnteredPin = input.nextLine();


            while(myAtm.accessAccount(userEnteredPin) == false){
                System.out.println("Incorrect pin please try again");
                userEnteredPin = input.nextLine();
            }
            System.out.println("Please select from the menu below");
            System.out.println("Press 1 to check balance");
            System.out.println("Press 2 to make a deposit");
            System.out.println("Press 3 to make a withdraw");
            System.out.println("Press 4 to exit");
            String userChoice = input.nextLine();

            while(!userChoice.equals("4")){

                if(userChoice.equals("1")){
                    System.out.println("You have chosen to check your balance ");
                    System.out.println("Your balance is" + myAtm.getBalance());
                } else if (userChoice.equals("2")) {
                    System.out.println("You want to make a deposit");
                    System.out.println("Enter the amount to deposit");
                    input.nextLine();
                    int amountToDeposit = input.nextInt();
                    myAtm.deposit(amountToDeposit);
                } else if (userChoice.equals("3")) {
                    System.out.println("You want to make a withdraw");
                    System.out.println("Enter the amount to withdraw");
                    int amountToWithdraw = input.nextInt();
                    input.nextLine();
                    myAtm.withdraw(amountToWithdraw);

                }else {
                    System.out.println("I am sorry I do not understand your request");
                }
                    System.out.println("Please select from the menu below");
                    System.out.println("Press 1 to check balance");
                    System.out.println("Press 2 to make a deposit");
                    System.out.println("Press 3 to make a withdraw");
                    System.out.println("Press 4 to exit");
                    userChoice = input.nextLine();
                }
            System.out.println("Thank you with us have a good day!");
            }
         }

