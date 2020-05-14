/*by Rajasekaran (https://github.com/Raja-18)
examples of palindrome:- 0-9,11,55,121,1331,1234321
*/

import java.util.Scanner;

public class palindrome {
    public static void main(String args[]){
        int n,temp,r,result=0;

        Scanner scan=new Scanner(System.in);
        System.out.print("enter the number: ");
        n=scan.nextInt();
        
        
        temp=n;                                     //temporary variable to chech the resultant
        while(n!=0){
            r=n%10;
            n=n/10;
            result=(result*10)+r;
        }

        
        if(temp==result){
            System.out.println(temp+" is palindrome");
        }
        else{
            System.out.println(temp+" is not a palindrome");
        }
        scan.close();
    }
    
}