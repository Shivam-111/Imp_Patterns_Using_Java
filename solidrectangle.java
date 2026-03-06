// for uncomment just click (Ctrl + ?) keys
// select the programme and press the keys 

// public class solidrectangle {
//     public static void main (String args[])
//     {
//         int r=4;
//         int c=5;
//         for (int i =1;i<=r;i++){
//             for (int j=1;j<=c;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }



// With user input

import java.util.Scanner;

public class solidrectangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        // Printing solid rectangle
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}