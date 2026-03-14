import java.util.Scanner;

public class reverse_triangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            //print spaces
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            // print stars
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            // print spaces
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}