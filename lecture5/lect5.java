package lecture5;

public class lect5 {
    public static void main(String args[]){
        // int n = 4;
        // int m = 5;

        // 2. Print the pattern-------

        // 1. HOLLOW RECTANCGLE
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= m; j++){
        //         if(i==1 || j==1 || i==n || j==m){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // 2. HALF PYRAMID
        // for(int i = 1; i <= n; i++ ){
        //     for(int j = 1; j <=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 3. INVERTED HALF PYRAMID
        // for(int i = n; i>=1; i-- ){
        //     for(int j = 1; j <=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 4. INVERTED HALF PYRAMID (rotated by 180 deg)
        // for(int i =0; i <=n; i++){
        //     // add spaces
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     // add stars
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 5. Floyd's Triangle
        // int n = 5;
        // int num = 1;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i;j++){
        //         System.out.print(num+" ");
        //         num++;
        //     }
        //     System.out.println();
        // }
        // Output:-
        // 1
        // 2 3 
        // 4 5 6 
        // 7 8 9 10 
        // 11 12 13 14 15
        
        // 0-1 TRIANGLE
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i; j++){
                int odd = j+i;
                if(odd%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        // Output:
        // 1 
        // 0  1
        // 1  0  1
        // 0  1  0  1
        // 1  0  1  0  1
    }
}
