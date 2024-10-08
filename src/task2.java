import java.util.Random;

public class task2 {
    public static void main(String []args){
        Random random1 =new Random();
        int b =0;
        int c =0;
        boolean e=false;
        boolean d=false;
        for (int i = 0; i < 20; i++) {
            int a = random1.nextInt(-50,50);
            if (e==false){
                c=a;
                e=true;
            }
            if(c<a){
                c=a;
            }

            if (d==false){
                b=a;
                d=true;
            }
            if(b>a){
                b=a;
            }

            System.out.println(a);
        }System.out.println(b+" "+c);

    }
}
