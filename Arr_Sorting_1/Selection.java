package Arr_Sorting_1;

public class Selection {
    

    public static void main(String[] args){
        int arr[]={3,2,1,6}; 
         
        for(int i=0; i < arr.length-1; i++){
            int pos = i; //find the min value position
            for(int j=i+1; j< arr.length; j++){//4
                if(arr[j] < arr[pos]){
                    pos = j;
                }
            }
            // swapt
            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }

        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
