import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class LearnSet {
    public static void main(String args[])
    {    
        //Set<Integer> set=new HashSet<>();
        //Set<Integer> set=new LinkedHashSet<>();   //linkedhashset is same as hash set 
        
        Set<Integer> set= new TreeSet<>(); //sorted set
        
        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);
        set.add(32);   //doesnt allow same elem twice 
        System.out.println(set);

        set.remove(54);
        System.out.println(set);

        System.out.println(set.contains(21)); //true //returns boolean value

        System.out.println(set.isEmpty());

        System.out.println(set.size()); //4

        set.clear();       //clears the set []
        System.out.println(set);
        

        
    }
}
