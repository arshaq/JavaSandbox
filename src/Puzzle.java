public class Puzzle {
    public static void main(String args[]) {
        long start = System.nanoTime();
        boolean found = false;
        for(int c=1; c<10 && !found; c++)
            for (int a=1; a<10 && !found; a++)
                for (int r=1; r<10 && !found; r++) {
                    int sum = 100*c+10*a+r + 10*c+a + c;
                    if(sum == 100*a+10*r+c) {
                       System.out.println("The solution is " + sum);
                       found = true;
                       break;
                    }
                }
        System.out.println("Time taken : " + (System.nanoTime() - start));
    }
}
