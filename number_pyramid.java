
// NOTE ::  For Removing Comment just select the commented code anf press Ctrl + /?

// NUMBER PYTRAMID left pyramid
public class number_pyramid {                           
    public static void main (String args[])
    {
        int n=5;
        for(int i= 1;i<=n;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
} 


// // With User-Input  
// import java.util.Scanner;
// public class number_pyramid {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of rows: ");
//         int n = sc.nextInt();  // user input

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// } 



// =============================================================================================
//INVERTED HALF PYRAMID WITH NUMBER
// public class number_pyramid {                           
//     public static void main (String args[])
//     {
//         int n=5;
//         for(int i= n;i>=1;i--)   //small changes here quit change
//         {
//             for(int j = 1;j<=i;j++)
//             {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


// With USer-INput
// import java.util.Scanner;

// public classnumber_pyramid {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of rows: ");
//         int n = sc.nextInt();  // user input

//         for (int i = n; i >= 1; i--) {   // loop starts from n down to 1
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }