package lecture6;

public class Ad_Loops {
    public static void main(String args[]) {

        // PART-2
        // 1. BETTERFLY PETTERNS
        // int n = 4;
        // upper part
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }

        // int space = 2 * (n - i);
        // for (int j = 1; j <= space; j++) {
        // System.out.print(" ");
        // }

        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // // down part
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }

        // int space = 2 * (n - i);
        // for (int j = 1; j <= space; j++) {
        // System.out.print(" ");
        // }

        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // Output:
        // * *
        // ** **
        // *** ***
        // ********
        // ********
        // *** ***
        // ** **
        // * *

        // SOLID RHOMBUS
        // int n = 5;
        // for(int i=1; i<=n; i++){
        // //Space
        // for(int j=1; j<= n-i; j++){
        // System.out.print(" ");
        // }
        // // Start
        // for(int j=1; j<=n; j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // Output:
        // *****
        // *****
        // *****
        // *****
        // *****

        // PYRAMID NUMBER
        // int n = 5;
        // for(int i=1; i<=n; i++){
        // //Spaces
        // for(int j=1; j<= n-i; j++){
        // System.out.print(" ");
        // }
        // //number
        // for(int j=1; j<=i; j++){
        // System.out.print(i+" ");
        // }
        // System.out.println();
        // }
        // Output:
        // 1
        // 2 2
        // 3 3 3
        // 4 4 4 4
        // 5 5 5 5 5

        // PALINDROME PATTERN
        // int n=5;
        // for(int i=1;i<=n; i++){
        // // spaces
        // for(int j=1;j<=n-i; j++){
        // System.out.print(" ");
        // }
        // // first part
        // for(int j=i; j>=1; j--){
        // System.out.print(j);
        // }
        // // second part
        // for(int j=2; j<=i; j++){
        // System.out.print(j);
        // }
        // System.out.println();
        // }
        // Output:
        // 1
        // 212
        // 32123
        // 4321234
        // 543212345

        // DIAMOND PATTERN
        // int n=4;
        // for(int i=1; i<=n; i++){
        // // sapces
        // for(int j=1; j<= n-i; j++){
        // System.out.print(" ");
        // }
        // // numbers
        // for(int j=1; j <= 2*i-1; j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // 180 deg rotate
        // for(int i=n; i>=1; i--){
        // // sapces
        // for(int j=1; j<= n-i; j++){
        // System.out.print(" ");
        // }
        // // numbers
        // for(int j=1; j <= 2*i-1; j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        int row = 3;
        int col = 3;
        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || i == 2 || j == 1) {
                    arr[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        // Output:
        // 1 1 1
        // 0 1 0
        // 1 1 1
    }
}
