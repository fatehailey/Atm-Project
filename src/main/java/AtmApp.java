import java.util.Scanner;

public class AtmApp {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            Atm myAtm = new Atm(500, "1234");
            System.out.println("Welcome to Bank of We Can Code IT");
            System.out.println("Please enter your pin");

            for(String userEnteredPin = input.nextLine(); !myAtm.accessAccount(userEnteredPin); userEnteredPin = input.nextLine()) {
                System.out.println("Incorrect pin please try again");
            }

            System.out.println("Please select from the menu below");
            System.out.println("Press 1 to check balance");
            System.out.println("Press 2 to make a deposit");
            System.out.println("Press 3 to make a withdraw");
            System.out.println("Press 4 to exit");

            for(String userChoice = input.nextLine(); !userChoice.equals("4"); userChoice = input.nextLine()) {
                if (userChoice.equals("1")) {
                    System.out.println("You have chosen to check your balance ");
                    System.out.println("Your balance is" + myAtm.getBalance());
                } else {
                    int amountToWithdraw;
                    if (userChoice.equals("2")) {
                        System.out.println("You want to make a deposit");
                        System.out.println("Enter the amount to deposit");
                        input.nextLine();
                        amountToWithdraw = input.nextInt();
                        myAtm.deposit(amountToWithdraw);
                    } else if (userChoice.equals("3")) {
                        System.out.println("You want to make a withdraw");
                        System.out.println("Enter the amount to withdraw");
                        amountToWithdraw = input.nextInt();
                        input.nextLine();
                        myAtm.withdraw(amountToWithdraw);
                    } else {
                        System.out.println("I am sorry I do not understand your request");
                    }
                }

                System.out.println("Please select from the menu below");
                System.out.println("Press 1 to check balance");
                System.out.println("Press 2 to make a deposit");
                System.out.println("Press 3 to make a withdraw");
                System.out.println("Press 4 to exit");
            }

            System.out.println("Thank you with us have a good day!");
        }
    }

}
