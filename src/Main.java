import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // PSEUDO CODE (outline as single-line comments)
        // Declare variables: choice (String), trash (String)
        // Display a menu: D = Democrat, R = Republican, I = Independent
        // Prompt user to enter first letter
        // Read the entire line as a String
        // If choice equals "D" or "d":
        //      Output "You get a Democratic Donkey."
        // Else if choice equals "R" or "r":
        //      Output "You get a Republican Elephant."
        // Else if choice equals "I" or "i":
        //      Output "You get an Independent Person."
        // Else:
        //      Output "You get an Other."

        Scanner in = new Scanner(System.in);

        System.out.println("Party Affiliation Menu:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.print("Enter your choice (D, R, or I): ");

        String choice = in.nextLine(); // safe for any input (String)

        // normalize input (trim spaces)
        choice = choice.trim();

        if (choice.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (choice.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (choice.equalsIgnoreCase("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get an Other.");
        }


    }
}