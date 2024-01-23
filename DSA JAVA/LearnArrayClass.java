import java.util.Arrays;
public class LearnArrayClass {
    public static void main(String args[])
    {
        // int[] num = {1,2,3,4,5,6,7,8,9,10};
        // int index = Arrays.binarySearch(num,4);

        // System.out.println("The index of element 4 in the array is" + index);

        Integer[] num = {10,45,35,8,90,26};
        Arrays.sort(num);       //sort the array


        Arrays.fill(num, 30);

        for(int i : num)
        {
            System.out.print(i+" ");
        }


    }
}
