import java.util.Scanner;

public class task7 {
    public static void main(String [] args){
        Scanner scanner1 =new Scanner(System.in);
        int a = scanner1.nextInt();
        while (a>0){
            System.out.print(a%10);
            a/=10;
        }
    }
}
