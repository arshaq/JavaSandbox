public class Loops {
    public static void main(String... args) {

        int max = 5;


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
