package learn;
import java.util.Scanner ;
public class exercsion4 {
    public static void main (String[] args ) {
        Scanner input = new Scanner (System.in) ;
        System.out.print("Nhap n : ");
        int n = input.nextInt() ;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");  
            }
            System.out.println();
        }
    }
}
