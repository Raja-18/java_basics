/*By Rajasekaran(https://github.com/Raja-18)
*/
import java.util.Scanner;
public class sample {
    public static void main(String[] args) {  
        char x;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the character: ");
        x=scan.next().charAt(0);
        if(x>='a' && x<='z') {
            System.out.println(x+"->"+Character.toUpperCase(x));
        }
        if(x>='A' && x<='Z') {
            System.out.println(x+"->"+Character.toLowerCase(x));
        }
        scan.close();
    }
}
