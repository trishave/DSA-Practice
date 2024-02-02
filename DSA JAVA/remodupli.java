import java.util.*;
public class remodupli {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int removeDuplicates(int[] arr) {
        //A HashSet is created to store unique elements. HashSet automatically eliminates duplicates.
        HashSet < Integer > set = new HashSet < > ();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        //This is an enhanced for loop, also known as a for-each loop. It iterates over each element (x) in the set.

        for (int x: set) {
            arr[j++] = x;
        }
        return k;
    }
}





