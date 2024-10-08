import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task8 {
    public static void main(String []args){
        Scanner scanner1 =new Scanner(System.in);
        Random random1 =new Random();
        int a = scanner1.nextInt();
        int [] b =new int[a];
        for (int i = 0; i < b.length; i++) {
            b[i]= random1.nextInt(1000,9999);
        }
        System.out.println(Arrays.toString(b));

        for (int i = b.length-1; i >= 0 ; i--) {
            System.out.print(b[i]+", ");
        }

    }
}
