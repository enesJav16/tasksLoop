import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner1 =new Scanner(System.in);
        int a = scanner1.nextInt();
        int a1=a;

        int count =1;
        while (a/10!=0){
            count++;
            a/=10;
        }

        double f= Math.pow(10,count);
        System.out.println(f);


    }
}
//        long b=0;
//        long c=0;
//        while (a>0){
//            b=a%10;
//            if (b%2==0){
//                System.out.print(b+" ");
//            }
//            a/=10;
//        }
//        System.out.println(" ");
//        while (a1>0){
//            c=a1%10;
//            if(c%2!=0){
//                System.out.print(c+" ");
//            }
//            a1/=10;
//        }