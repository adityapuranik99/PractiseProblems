package Arrays;
import java.util.Scanner;

class friendsPairing{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t>0){
            int n = scanner.nextInt();
            System.out.println(countFriendsPairing(n));
            t--;
        }
    }

    public static int countFriendsPairing(int n){
        if (n <= 1)
            return 1;
        return countFriendsPairing(n-1) + (n-1)*countFriendsPairing(n-2);
    }
}