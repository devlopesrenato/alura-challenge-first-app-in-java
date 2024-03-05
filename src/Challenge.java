import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        String name = "Renato Lopes";
        String type = "savings";
        double amount = 6149.90;

        System.out.println("***********************");
        System.out.println("\nClient name: " + name);
        System.out.println("Account type: " + type);
        System.out.println("Current balance: " + amount);
        System.out.println("\n***********************");

        String menu = """
                
                *** Select an option ***
                1 - Check balance
                2 - Transfer
                3 - Receive
                4 - Exit
                """;

        Scanner reader = new Scanner(System.in);

        int option = 0;

        while (option != 4){
            System.out.println(menu);
            option = reader.nextInt();

            switch (option){
                case 1:
                    System.out.println("The updated balance is: " + amount);
                    break;

                case 2:
                    System.out.println("Enter the amount to be transferred:");
                    double value = reader.nextDouble();
                    if (value > amount) {
                        System.out.println("Insufficient funds");
                    } else {
                        amount -= value;
                        System.out.println("The updated balance is: " + amount);
                    }
                    break;

                case 3:
                    System.out.println("Enter the amount received:");
                    double receivedValue = reader.nextDouble();
                    amount += receivedValue;
                    System.out.println("The updated balance is: " + amount);
                    break;

                case 4:
                    System.out.println("Leaving...");
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }


}
