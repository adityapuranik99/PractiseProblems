package Arrays;
import java.util.Scanner;

class tilingProblem{
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++){
            int n = scanner.nextInt();
            System.out.println(noOfWays(n));
        }
    }

    public static int noOfWays(int n){
        if (n <= 3)
            return 1;
        return noOfWays(n-1) + noOfWays(n-4);
    }
}