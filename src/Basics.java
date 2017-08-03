import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Basics {
    public static void main (String... args) throws IOException {
        int choice;
        System.out.println("Overview of basics programming.");
        System.out.println("1. Loops");
        System.out.print("Enter your choice => ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        choice = Integer.parseInt(br.readLine());

        switch (choice) {
            case 1: Loops.createDesign();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
