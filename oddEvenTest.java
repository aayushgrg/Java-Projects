import java.util.Scanner;

public class oddEvenTest {
public static void main(String a[]){
    Scanner scan=new Scanner(System.in);
checkeven(5);
    System.out.println(checkeven(30));
}

    public static boolean checkeven(int q) {
       boolean is=false;
        if (q % 2 == 0) {
            is = true;
        }
            return is;


    }
}
