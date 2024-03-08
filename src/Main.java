import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Variables
        int i = 0;
        int j = 0;

        // 1. A loop that counts (i.e. displays the count) up by 1 from 0 to 30
        System.out.println("Numbers 0 - 30, counting up by 1:");
        for (i = 0; i <= 30; i = i + 1) {
            System.out.print(" " + i + " ");
        }
        System.out.println(" ");

        // 2. A loop that counts down by 1 from 30 to 0
        System.out.println("Numbers 30 - 0, counting down by 1:");
        for (i = 30; i >= 0; i = i - 1) {
            System.out.print(" " + i + " ");
        }
        System.out.println(" ");

        // 3. A loop that counts up by 3 from 0 to 18
        System.out.println("Numbers 0 - 18, counting up by 3:");
        for (i = 0; i <= 18; i = i + 3) {
            System.out.print(" " + i + " ");
        }
        System.out.println(" ");

        // 4. A loop that counts down by 2 from 10 to 0
        System.out.println("Numbers 10 - 0, counting down by 2:");
        for (i = 10; i >= 0; i = i - 2) {
            System.out.print(" " + i + " ");
        }
        System.out.println(" ");
        System.out.println("Part B:");
        System.out.println(" ");

        // PART B: Output for loops

        // 5. A nested loop that creates this figure (there are no blank lines)
        System.out.println("Nested loop that creates a triangle:");
        for (i = 0; i < 6; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(" ");

        // 6. A nested loop that creates this figure (there are no blank lines)
        System.out.println("Nested loop that creates an upside-down triangle:");
        for (i = 5; i > 0; i--) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(" ");

        // 7. A nested loop that creates this figure (there are no blank lines)
        System.out.println("Nested loop that creates a 5 x 5 block:");
        for (i = 5; i > 0; i--) {
            for (j = 0; j < i; j = 5) {
                System.out.print("*****");
            }
            System.out.println();
        }
        System.out.println(" ");

        // 8. Recreation of C to F conversion program.

        System.out.println("Recreation of the C to F conversion program:");
        // Variables
        Scanner in = new Scanner(System.in);
        double temperatureC = 0.0;
        double temperatureF = 0.0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("Enter a temperature (Celsius): ");

            if (in.hasNextDouble()) {
                // Success
                temperatureC = in.nextDouble();
                done = true;
                temperatureF = (temperatureC * 9/5) + 32;
                System.out.println("Your temperature in fahrenheit is " + temperatureF);

            } else {
                // Fail
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("Please enter a valid temperature in celsius.");
            }

        } while (!done);


    }
}