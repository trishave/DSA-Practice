// import java.util.*;


public class Recursion {
//    public static void printNum(int n) {
//     if(n==0)
//     {
//         return;
//     }
//     System.out.println(n);
//     printNum(n-1);
//    }
  
  
//  public static void main(String args[]) {
//         int n=5;
//         printNum(n);}

// 
 //SUM OF N NUMBERS
//  public static int func( int n){
//        if(n==0){
//         return 0 ;
//       }
//        return n +func(n-1);
//  }
// public static void main(String[] args) {
  
//   int n = 4;
//   System.out.println(func(n));
// }

//FACTORIAL OF N NUMBERS
// public static int fact(int n) {
//   if(n==0){
//     return 1;
//   }
//   return n*fact(n-1);
// }

// public static void main(String[] args) {
//   int n=4;
//   System.out.println(fact(n));
// }
 
//reverse an array

//  static void printArray(Integer arr[],int n) {
//   System.out.print("Reversed array is:-  \n");
//   for(int i=0;i<n;i++)
//   {
//     System.out.println(arr[i]+" ");
//   }
// }
// //using library func
//  static void reverseArray(Integer arr[]) {
//   Collections.reverse(Arrays.asList(arr));
// } 

// public static void main(String[] args) {
//   int n=5;
//   Integer arr[]= {5,4,3,2,1};
//   reverseArray(arr);
//   printArray(arr, n);
// }

//Fibonacci num

static int fibo(int n) {
  if(n<=1){
    return n;
  }
  int last= fibo(n-1);
  int slast=fibo(n-2);

  return last+slast;
}

public static void main(String[] args) {
  int n=6;
  System.out.println(fibo(n));
}




}
