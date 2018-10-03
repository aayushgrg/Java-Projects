import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LISTSWAPPING {
    public static void main(String a[]) {

        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        System.out.println("Before \n"+list);
        System.out.println(list1);
        list.addAll(list1);

        int size=list1.size();
        list1.clear();
        list1.addAll(list.subList(0,list.size()-size));
        list=list.subList(list.size()-size,list.size());
        System.out.println("After \n"+list);
        System.out.println(list1);



    }
}



