package lecture2;

import java.util.Scanner;

public class loops {
    public static void main(String[] args){
        
        // Qs. Print the sum of First n Natural Numbers.
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // int sum = 0;
        // for(int i = 1; i <= n ; i++){
        //     sum += i;
        // }
        // System.out.println(sum);

        //Qs. Print the table of a number input by the user
        for(int i = 1; i < 11; i++){
            System.out.println(n*i);
            // System.out.println(n*i);
        }
    }
}