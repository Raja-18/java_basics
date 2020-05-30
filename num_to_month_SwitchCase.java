class em{
    int a;
    int b;
    static int c=4;
    public em(){
        a=1;
        b=2;
    }
    public void show(){
        System.out.println(a+" "+b+" "+c);
    }

}

public class summa{
    public static void main(String[] args) {
        em x=new em();
        em y=new em();

        x.show();
        y.show();

    }
}
