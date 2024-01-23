import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class LearnCollectClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(45);
        list.add(12);
        list.add(40);
        list.add(33);
        list.add(90);
        list.add(21);
        list.add(55);
        list.add(44);

        // System.out.println("min element" + Collections.min(list));  //returns the min elem
        // System.out.println("max element "+ Collections.max(list));  //returns the max elem
        // System.out.println(Collections.frequency(list, 33));      //returns the frequency of any element

        //Collections.sort(list);  //sort the list  (ascending order)
        Collections.sort(list, Comparator.reverseOrder());   //reverses the order
        System.out.println(list);

    }

}
