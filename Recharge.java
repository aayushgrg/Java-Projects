import java.util.Scanner;
public class Recharge {

    public static void main(String[] args) {
        System.out.println("\f");
         Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of Recharge : ");
        float RcAmnt= input.nextInt();
        float AmntDone=RcAmnt-((RcAmnt*2)/100);
        System.out.println("\nThe Recharge of "+AmntDone +" rs is done..!!");


    }}
