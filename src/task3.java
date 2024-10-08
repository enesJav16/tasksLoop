import java.util.Scanner;

public class task3 {
    public static void main(String [] args){
        Scanner  scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        while (a>=0){
            int b = scanner1.nextInt();
            System.out.println(a-b);
            a-=b;
        }
    }
}
