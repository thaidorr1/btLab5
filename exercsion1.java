package learn;
import java.util.Scanner ;
import java.util.Random ;
public class exercsion1 {
    public static void main (String[] args ) {
        Scanner input = new Scanner (System.in) ;
        Random rd = new Random() ;
        int n = rd.nextInt(1, 50) ;
        int quess = 0;
        while (quess != n ) {
            System.out.print("Nhap du doan :");
            quess = input.nextInt();
            if ( n > quess) {
                System.out.println("So cua ban thap hon");
            }
            else if (n < quess) {
                System.out.println("So cua ban cao hon");
            }
            else {
                System.out.println("ban da chon dung ");
            }
        }
    }
}
