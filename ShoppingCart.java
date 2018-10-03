import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {

public static void main(String a[]) {
    Scanner scan = new Scanner(System.in);
    List<String> item = new ArrayList<>();
    List<Integer> price = new ArrayList<>();
    List<String> cart = new ArrayList<>();

    item.add("coffee");
    item.add("tea");
    item.add("BEER");
    price.add(10);
    price.add(20);
    price.add(30);
    System.out.println("The SNacky Point,  Welcomes You..");
    for (String d : item) {
        System.out.println(d + "\t" + price.get(item.indexOf(d)));
    }
    do {
        System.out.println("enter ur choice");
        switch (scan.nextInt()) {
            case 1:
                cart.add(item.get(0));
                break;
            case 2:
                cart.add(item.get(1));
                break;
            case 3:
                cart.add(item.get(2));
                break;
            default:
                System.out.println("oooppps...!!!");
        }

        System.out.println("Do u want add more Y/N");
    } while (scan.next().charAt(0) == 'y');


    //now the billin part is heere
    int  sum=0;
    for (String g:cart) {
        sum += price.get(item.indexOf(g));
        System.out.println(g+"\t"+price.get(item.indexOf(g)));
    }
    System.out.println("--------------------------------");
    System.out.println("Your Total Invoice Amount is  "+sum );
    System.out.println("--------------------------------");

}}