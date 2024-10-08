import java.util.Arrays;
import java.util.Random;

public class task1 {
    public static void main(String [] args){
        Random random1 = new Random();
        boolean b=true;
        int c=0;
        for (int i = 0; i < 20; i++) {
            int a = random1.nextInt(1,99);
            if(b==true){
                c=a;
                b=false;
            }
            if (a%c==0){
                System.out.println(a);
            }
        }
    }
}
