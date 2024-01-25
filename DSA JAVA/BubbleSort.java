import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        int size,i,j,temp;
        int arr[] = new int[50];
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Array Size :");
        size=sc.nextInt();
        
        System.out.println("Enter Array Elements : ");
        for(i=0;i<size;i++)
            arr[i]= sc.nextInt();
        for(i=0;i<(size-1);i++){
            for(j=0;j<size-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array : \n");
        for(i=0;i<size;i++)
        System.out.println(arr[i] + " ");
}
}
