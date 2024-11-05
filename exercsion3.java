package learn;
import java.util.Scanner ;
public class exercsion3 {
    public static void main (String [] args ) {
        Scanner input = new Scanner (System.in) ;
        int n = input.nextInt() ;
        System.out.println("Bang cuu chuong " + n );
        for(int i = 1; i <= 10 ;i++ ) {
            System.out.println(n + "*" + i + "=" + n * i);
        }
    }
}
