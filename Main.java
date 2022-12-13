import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, passWord;
        Scanner mec = new Scanner(System.in);
        int right = 3;
        int select;
        int balance = 1500;

        System.out.print("Enter Your Username: ");
        userName = mec.nextLine();
        System.out.print("Enter Your Password: ");
        passWord = mec.nextLine();

        if (userName.equals("mstfclk1919") && passWord.equals("13579")) {
            System.out.println("Hello, Welcome to MEC Bank!");
            do {
                System.out.println("1-Deposit the Money\n" +
                        "2-Withdraw  the Money\n" +
                        "3-Your Balance\n" +
                        "4-Exit");
                System.out.print("Please select the action you want to do: ");
                select = mec.nextInt();
                switch (select) {

                    case (1):
                        System.out.print("Money Amount: ");
                        int price = mec.nextInt();
                        balance += price;
                        break;
                    case (2):
                        System.out.print("Money Amount: ");
                        int price2 = mec.nextInt();
                        if (price2 > balance) {
                            System.out.print("Insufficient Balance!");
                        } else {
                            balance -= price2;
                        }
                        break;
                    case (3):
                        System.out.println("Your Balance: " + balance);
                        break;
                    case (4):
                        System.out.println("Successfully logged out. See you again.");
                        break;
                }
            } while (select != 4);

        } else {

            right--;
            System.out.println("You entered an incorrect username or password. Try again!");
            if (right == 0) {
                System.out.println("Your account has been blocked. Please contact your bank.");
            } else {
                System.out.println("Your remaining right: " + right);
            }
        }
    }
}