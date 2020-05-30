/*By Rajasekaran(https://github.com/Raja-18)
*/
public class sample {
    public static void main(String[] args) {
        int x;
        if(args.length==0){
            System.out.println("Please enter an integer number");
            System.exit(0);                                       //terminates the program 
        }
        x=Integer.parseInt(args[0]);
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
