import java.util.Scanner;
public class insertionSort {
    public static void main(String[] args) {
        int size,i,j,temp;
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Array Size :");
        size=sc.nextInt();
        int arr[] = new int[50];
        
        System.out.println("Enter Array Elements : ");
        for(i=0;i<size;i++)
            arr[i]= sc.nextInt();
         
            for(i=1;i<size;i++)
            {
                temp=arr[i];
                for(j=(i-1);j>=0 && arr[j]>temp;j--)
                arr[j+1]=arr[j]; 
                arr[j+1]=temp;


            }
            System.out.println("The Sorted Array is: ");
            for(i=0;i<size;i++)
            System.out.println(arr[i]+ " ");



    }
}
