public class checkSort {
    public static int isSorted(int n,int []a) {
        for(int i=0;i<n-1;i++)
        {
            if(a[i]>a[i+1]){
                 return 0 ;  }
        }
        return 1;
    }
    public static void main(String[] args) {
        int [] arr={10,2,3,40,5};
        int result=isSorted(arr.length,arr);

        if(result==1){
            System.out.println("The array is Sorted. ");
        }
        else{
            System.out.println("The array is not sorted.");
        }
    }
}
