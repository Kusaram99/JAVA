package Arr_Sorting_1;

public class Insertion {
    

    public static void main(String[] args){
        int arr[]={3,2,1,6,2};// 5 

        // Asume that first element is sorted and compare with key 2nd element
        for(int step = 1; step < arr.length; step++){
            int key = arr[step];
            int j= step -1 ;

            while(j>=0 && key < arr[j]){ 
                // swapt
                arr[j+1] = arr[j]; // 1- 2,3,1,6,2}, 2- 1,2,3,6,2}, 3- , 4- 1,2,2,3,6} = {1,2,2,3,6}
                j--; // 3-1= 2, 2-1=1
            }
            arr[j+1] = key;
        }
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
