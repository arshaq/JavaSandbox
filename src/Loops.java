import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops {
    public static void main(String... args) throws IOException {

        int max;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of max stars: ");
        max = Integer.parseInt(br.readLine());

        for (int i = 1; i< 2*max; i++) {
            if (i <= max) {
                if(max%2!=0) {
                    if (i % 2 == 0)
                        System.out.print(" ");
                } else {
                    if (i % 2 != 0)
                        System.out.print(" ");
                }
                for (int j = (max-i)/2; j > 0; j-- )
                    System.out.print("  ");
                for (int k = i; k > 0; k--)
                    System.out.print("* ");
            } else {
                if(max%2!=0) {
                    if (i % 2 == 0)
                        System.out.print(" ");
                } else {
                    if (i % 2 != 0)
                        System.out.print(" ");
                }
                for (int j = (max-((2*max)-i))/2; j > 0; j-- )
                    System.out.print("  ");
                for (int k = ((2*max)-i); k > 0; k--)
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
