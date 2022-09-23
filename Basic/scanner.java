package Basic;
import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        System.out.println("Taking input for user");
         Scanner sc = new Scanner(System.in) ;
            System.out.println("Enter 1 number");
            int a = sc.nextInt();
            System.out.println("Enter 2 number");
            int b = sc.nextInt();
            int c = a+b;
            System.out.println("The sum of Two number are " +c);
        
    }
}
