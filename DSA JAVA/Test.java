import java.util.Arrays;


class Test {
    public static int[] getSecondOrderElements(int n, int[] a) {
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && a[j - 1] > a[j]) {
                int temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
                j--;
            }
        }

        int[] b = {a[n - 2], a[1]};
        return b;
    }

    public static void main(String args[]) {
        int[] arr = {100, 20, 4, 68, 7, 45};
        int n = arr.length;

        int[] result = getSecondOrderElements(n, arr);

        System.out.println("Second smallest is " + result[1]);
        System.out.println("Second largest is " + result[0]);
    }
}



