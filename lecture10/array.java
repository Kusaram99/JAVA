
package lecture10;

import java.util.*;

public class array {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for(int i=0; i<size; i++){
            numbers[i]= sc.nextInt();
        }

        boolean isAcceding = true;
        for(int i=0; i<numbers.length-1; i++){
            if(numbers[i] > numbers[i+1]){
                isAcceding = false;
                break;
            }
        }

        if(isAcceding){
            System.out.println("The array is sorted in ascending order");
        }else{
            System.out.println("The array is not sorted in ascending order");
        }


    }
}
