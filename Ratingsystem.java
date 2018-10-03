

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ratingsystem {

    public static void main(String a[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. * \n2. ** \n3. *** \n4. **** ");
        int op = scanner.nextInt();

        switch (op) {
            case 1:
                System.out.print("bad");
                       break;
            case 2 :
                System.out.println("ok");
        break;
        }



    }
}