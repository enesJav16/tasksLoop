import java.util.Scanner;

public class task4 {
    public static void main(String [] args){
        Scanner scanner1 =new Scanner(System.in);
        int a = scanner1.nextInt();
        int b = scanner1.nextInt();
        while (a!=b){
            System.out.println(a+b);
            int c= scanner1.nextInt();
            int d= scanner1.nextInt();
            a=c;
            b=d;
        }
    }
}
