package Arr_Sorting_1;

public class Bubble {
    public static void main(String[] args){

        int arr[] = {1,-2,3,4};

        for(int i=0; i< arr.length-1; i++){
            boolean isTrue = false;

            for(int j=0; j< arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isTrue = true;
                }
            }
            
            if(!isTrue){
                System.out.println("It's Working...");
                break;
            }
        }
        for(int k=0; k < arr.length; k++){
            System.out.println(arr[k]);
        }
    }
}
