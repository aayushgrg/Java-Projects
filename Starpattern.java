import java.util.Scanner;

public class Starpattern {
public static void main(String a[]) {
    Scanner scan=new Scanner(System.in);
    for(int i=1;i<5;i++){
    for(int t=1;t<=5-i;t++) {
        System.out.print("");
    }
for (int y=1;y<=i;y++) {
    System.out.println("*");
}
        System.out.println();
}
}}
