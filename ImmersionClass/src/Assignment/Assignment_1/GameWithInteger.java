package Assignment.Assignment_1;

import java.util.Scanner;

public class GameWithInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            if(n % 3 != 0){
                System.out.println("First");
            }
            else{
                System.out.println("Second");
            }

            t--;
        }
    }
}
