// public class half_pyramid {
//     public static void main(String[] args) {
//         // Outer Loop
//         int row = 4;
//         for(int i =1;i<row;i++){

//             // Inner Loop
//             for(int j =1;j<row;j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
    
// }


// With User Input
import java.util.Scanner;
public class half_pyramid {
    public static void main(String[] args) {

        // User Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Rows: ");
        int row = sc.nextInt();

        // Outer Loop
        for(int i=1;i<row;i++){

            // Inner Loop
            for(int j=1;j<row;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}

