package lecture7;

import java.util.*;

public class function {

    // 1. Fraction--------
    // public static void fraction(int n){
    // int fraction=1;
    // for(int i=n; i>=1; i--){
    // fraction = fraction * i;
    // }
    // System.out.println(fraction);
    // }

    // 2. Check N number even or not-------
    // public static void evenOrNot(int num) {
    //     boolean flag = false;
    //     for (int i = 2; i <= num / 2; ++i) {
    //         if (num % i == 0) {
    //             flag = true;
    //             break;
    //         }
    //     }
    //     if (num == 0)
    //         System.out.println(num + " is neither a prime nor a composite number");
    //     else if (!flag)
    //         System.out.println(num + " is a prime number");
    //     else
    //         System.out.println(num + " is not a prime number");
    // }

    // 3. Fibonacci series
    public static void fibonacci(int N){
        int num1=0, num2=1;
        // int counter=0;
        // while (counter <= N) {
        //     // Print the number
        //     System.out.print(num1 + " ");
        //     // Swap
        //     int num3 = num2 + num1;
        //     num1 = num2;
        //     num2 = num3;
        //     counter = counter + 1;
        // }
        for(int i=0; i<=N; i++){
            System.out.print(num1+" ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // // fraction();
        fibonacci(num);
    }
}
