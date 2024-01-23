import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class LearnMap {
    public static void main(String args[])
    {
        Map<String,Integer> num=new TreeMap<> ();
        num.put("ONE", 1);
        num.put("TWO", 2);
        num.put("THREE", 3);



        num.remove("THREE");       //removes the particular key 
        // if(!num.containsKey("TWO"))
        // {
        //     num.put("TWO,23");
        // }
        //num.putIfAbsent("TWO" , 23);
        System.out.println(num);

        System.out.println(num.containsValue(3)); //the value is present or not

        System.out.println(num.isEmpty());

        //num.put("TWO", 23);

        // for(Map.Entry<String, Integer> e: num.entrySet())
        // {
        //     System.out.println(e); //prints one=1

        //     System.out.println(e.getKey());  //prints one
        //     System.out.println(e.getValue());  //prints 1
        // }
        
        // for(String key:num.keySet())
        // {
        //     System.out.println(key);    //print the keys
        // }
        // for(Integer value: num.values())
        // {
        //     System.out.println(value); //print the values
        // }
        //System.out.println(num);
    }
}
