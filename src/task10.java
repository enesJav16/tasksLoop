import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task10 {
    public static void main(String []args){
        Scanner scanner1 =new Scanner(System.in);
        Random random1 =new Random();
        int a = scanner1.nextInt();
        int []b=new int[a];
        for (int i = 0; i < b.length; i++) {
            b[i]= random1.nextInt(10,99 );
        }
        System.out.println(Arrays.toString(b));

        for (int i = 0; i < b.length; i++) {
            if(b[i]%2==0){
                System.out.print(b[i]+" ");
            }
        }
        System.out.println("");
        for (int i = 0; i < b.length; i++) {
            if(b[i]%2!=0){
                System.out.print(b[i]+" ");
            }
        }

}}
