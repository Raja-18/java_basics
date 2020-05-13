import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int n;
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the number: ");
        n=scan.nextInt();
        int fact=1,i=0;
        while(i<n){
            fact=fact*(n-i);
            i+=1;
        }
        System.out.print(fact+" ");
        scan.close();
    }
    
}