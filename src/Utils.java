import java.util.Scanner;

public class Utils {

    public static int getIntInput() {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;

        while (true) {
            System.out.print("Mata in ett heltal: ");
            try {
                userInput = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Mata in ett giltigt heltal!");
            }

        }
        return userInput;
    }

}
