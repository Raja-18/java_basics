/*By Rajasekaran(https://github.com/Raja-18)
*/
import java.util.Scanner;
public class sample {
    public static void main(String[] args) {
        int x,y,result,option;
        char cnt;
        Scanner scan=new Scanner(System.in);
        cnt='y';
        do{
            System.out.println("Select an option 1.Add 2.Sub");
            option=scan.nextInt();
            if(option==1){
                System.out.print("Enter two values for x and y: ");
                x=scan.nextInt();
                y=scan.nextInt();
                result=x+y;
                System.out.println("sum is: "+result);
                System.out.print("If you want to continue? ");
                cnt=scan.next().charAt(0);
            }
            if(option==2){
                System.out.print("Enter two values for x and y: ");
                x=scan.nextInt();
                y=scan.nextInt();
                result=x-y;
                System.out.println("difference is: "+result);
                System.out.print("If you want to continue? ");
                cnt=scan.next().charAt(0);
            } 
        }while(cnt=='y' || cnt=='Y');
        scan.close();
    }
}
