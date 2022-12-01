package lecture11;

import java.util.*;

// 2D array Example
public class towDarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        // rows
        for (int i = 0; i < rows; i++) {
            // columns
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // find x matrix value
        int x = sc.nextInt();
        // String matchOrNot;
        for(int i=0; i<rows; i++){
            // columns
            for(int j=0; j<cols;j++){
                if(numbers[i][j]==x){
                    // isFind = true;
                    System.out.println("x vlaues is find Row index: "+ i+" Column index: "+j);
                    System.out.println(numbers[i][j]);
                }
            }
        }
    }
}
