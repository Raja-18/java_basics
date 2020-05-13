import java.util.Scanner;                            //for Scanner
public class fibonacci {                       // class name should be the file name
    public static void main(String[] args) {   
        int a=1,b=0,c=0;                       // initialising the variables
        Scanner scan=new Scanner(System.in);   //initialising scan as Scanner object
        System.out.print("enter the number: ");
        int n=scan.nextInt();                  //getting integer as input from user
        for(int i=0;i<n;i++){                  // "for loop" for iteration 
            System.out.print(c+" ");       
            c=a+b;
            a=b;
            b=c;
        scan.close()
        }
    }
}
