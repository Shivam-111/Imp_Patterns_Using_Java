import java.util.Scanner;
public class diamond_pattern {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your no: ");
        int n = sc.nextInt();
        //uppar half
        for(int i=0;i<n;i++){
            //Spaces
            for(int j=1;j<n-i-1;j++){        //(n-i-1).....logic for space..
            System.out.print(" "); 
            }
            //Stars 
            for(int j =0;j<2*i+1;j++){         //2*i-(2*i+1).....logic for stars..
                System.out.print("*");
            }  
            System.out.println();
        }
        //lower half
        for(int i=n-2;i>=0;i--){
            //Spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //Stars
            for(int j =0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();  
    } 
}
