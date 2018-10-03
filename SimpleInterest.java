import java.util.Scanner;

public class SimpleInterest {
public static void main(String a[]){

    float p,r,t;

    Scanner scan=new Scanner(System.in);
    System.out.println("enter the value of principal");
    p=scan.nextFloat();
    System.out.println("Enter the value of rate");
    r=scan.nextFloat();
    System.out.println("enter the of value of time");
    t=scan.nextFloat();
    Float sum=(p*r*t)/100;
    System.out.println(sum);
}




}
