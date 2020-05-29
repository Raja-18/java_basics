/*by Rajasekaran (https://github.com/Raja-18)
this program takes integers as arguments in command prompt and prints the sum 
*/



public class sum_integers_cmd{
    public static void main(String[] args){
        int a,b,sum;
        a=Integer.parseInt(args[0]);  //converts string to integer (normal explisit type cast will not work on args)
        b=Integer.parseInt(args[1]);  //converts string to integer
        sum=a+b;
        System.out.println("The sum of "+a+" and "+b+" is "+sum);
    }
}