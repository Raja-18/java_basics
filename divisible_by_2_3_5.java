/*By Rajasekaran(https://github.com/Raja-18)
*/
public class sample {
    public static void main(String[] args) {
        int x=2,r=0;
        int[] arr=new int[5];
        while(r<5){
            if((x%2==0) && (x%3==0) && (x%5==0)){
                arr[r]=x;
                r++;
            }
            x++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
