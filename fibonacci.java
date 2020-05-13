public class fibonacci {             // class name should be the file name
    public static void main(String[] args) {   
        int a=1,b=0,c=0,n=10;              // initialising the variables 
        for(int i=0;i<n;i++){              // "for loop" for iteration 
            System.out.print(c+" ");       
            c=a+b;
            a=b;
            b=c;
        }
    }
}