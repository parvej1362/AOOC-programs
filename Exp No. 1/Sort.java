import java.util.*;

public class Sort {
      public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array: ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter elements of arrays: ");
            for (int i = 0; i < arr.length; i++) {
                  arr[i] = sc.nextInt();
            }
            for (int i = 0; i < arr.length - 1; i++) {
                  for (int j = 0; j < arr.length - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                              // swap
                              int temp = arr[j];
                              arr[j] = arr[j + 1];
                              arr[j + 1] = temp;
                        }
                  }
            }
            for (int i = 0; i < arr.length; i++) {
                  System.out.print(arr[i] + " ");

            }

      }

}