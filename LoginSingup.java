import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class LoginSingup {

    public static void main(String a[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        ;
        System.out.println("press 1. for register \n 2. for login");
int choice=scan.nextInt();

if(choice==1) {
    System.out.println("mention ur id & password u want to create");
    String want = scan.next();

    File id = new File("C:\\Users\\neelansh\\Desktop\\database.txt");
    FileOutputStream fou = new FileOutputStream(id, true);

    String save = (want + "\r\n");
    fou.write(save.getBytes());
    fou.close();
}else{
 /*  System.out.println("enter your id ");
    String Id = scan.nextLine();
        System.out.println("enter your password");
        String passw = scan.nextLine();
    int i = 0;
    boolean flag=false;
    for (String str : user) {
        /// if (str.equals(Id)) {
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



*/
}}}

        //System.out.println("enter your id ");
        ///String Id = scan.nextLine();
        /*System.out.println("enter your password");
        String passw = scan.nextLine();
        int i = 0;
        boolean flag=false;
        for (String str : user) {
           /// if (str.equals(Id)) {
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
*/

