/*by Rajasekaran (https://github.com/Raja-18)
example of prime numbers:2,19,563,100003,999999937
*/

import java.lang.Math;
import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        int n,sq,i=2,temp=0;

        Scanner scan=new Scanner(System.in);
        System.out.print("enter the number: ");
        n=scan.nextInt();

        sq=(int) Math.sqrt(n);
        while(i<=sq){
            if(n%i==0){
                System.out.println(n+" is not a prime number");
                temp=1;                                             //temp variable to check prime after the loop
                break;
            }
            i+=1;
        }
        if(temp==0){
            System.out.println(n+" is a prime number");
        }

        scan.close();
    }
    
}