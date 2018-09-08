import jdk.nashorn.internal.runtime.linker.BoundCallable;

import java.util.Random;
import java.util.Scanner;

public class Rndm {

    public static void main(String a[]) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int y = random.nextInt( 100  );

        System.out.println(y);


    }
}
