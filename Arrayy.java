import java.util.Scanner;

public class Arrayy {

    public static void main(String a[]) {
        Scanner scan = new Scanner(System.in);
        ;
        String[] user = {"amit", "akash", "cherry"};
        String[] pass = {"123", "234", "345"};
        System.out.println("enter your id ");
        String Id = scan.nextLine();
        System.out.println("enter your password");
        String passw = scan.nextLine();
        int i = 0;
       boolean flag=false;
        for (String str : user) {
            if (str.equals(Id)) {
                if (pass[i].equals(passw)) {
                    flag = true;
                }
            }
            i++;
        }
        if(flag){
            System.out.println("succesfully logined");
        }else{
            System.out.println("INCORRECT ID OR PASSWORD!!!");
            }}}

