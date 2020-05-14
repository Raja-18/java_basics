/*by Rajasekaran (https://github.com/Raja-18)
amstrong numbers examples:- 0-9, 153, 370, 371, 407, 1634, 8208, 9474, 54748

153 =>
1^3 + 5^3 + 3^3  == 153 
*/

import java.util.Scanner;
import java.lang.Math;


public class amstrong_no {
    public static void main(String[] args) {
        int n,result=0,size,d;
        
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the number: ");
        n=scan.nextInt();
        
        int temp=n;                            //temperary variable for comparing the resultant 
        String type=Integer.toString(n);       //converting integer to string to find length
        size=type.length(); 

        
        while(n!=0){
            d=n%10;
            n=n/10;
            result=result+(int) Math.pow(d,size);
        }


        if(temp==result){
            System.out.println(temp+" is an amstrong number");
        }
        else{
            System.out.println(temp+" is not an amstrong number");
        }
        scan.close();
    }
    
}
