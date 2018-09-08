import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimef {
public static void main(String a[]){

    DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime dt=LocalDateTime.now();
    System.out.println(dtf.format(dt));

}
}
