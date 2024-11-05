package learn;
import java.util.Scanner ;
public class exercsion2 {
    public static void main (String [] args ) {
        Scanner input = new Scanner (System.in) ;
        System.out.print("Nhap n : "); 
        long n = input.nextLong() ;
        fibonacci(n) ;
    }
    public static long fibonacci (long n) {
        if (n== 1) {
            System.out.print("0");
        }
        else {
            System.out.print("0 1 ");
            long fn1 = 1 , fn2 = 0 , fn ;
            for(int i= 2 ; i < n ;i++) {
                fn = fn1 + fn2 ;
                System.out.print(fn + " ") ;
                fn2 = fn1 ;
                fn1 = fn ;
            }
        }
        return 0;
    } 
}