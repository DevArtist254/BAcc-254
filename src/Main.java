import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean app = true;

        do{

            try {
                int accountNumber; int accountBalance; String customerName; String email; int phoneNumber;
                Scanner sc = new Scanner(System.in);

                System.out.println("Welcome to uBank, Kindly enter the details to become a member");

                System.out.println("Tell us your name");
                customerName = sc.nextLine();

                System.out.println("Tell us your email");
                email = sc.nextLine();

                System.out.println("Give us your phone number");
                phoneNumber = Integer.parseInt(sc.nextLine());

                System.out.println("Give us your account number");
                accountNumber = Integer.parseInt(sc.nextLine());

                System.out.println("Deposit your first funds");
                accountBalance = Integer.parseInt(sc.nextLine());

                Account newAc = new Account(accountNumber,accountBalance,customerName, email, phoneNumber);

                System.out.println("Thank you here are your details");
                System.out.println(newAc);

                app = false;
            }catch (NullPointerException e){
                app = false;
            }

        }while (app);
    }
}