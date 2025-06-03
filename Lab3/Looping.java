package Lab3;
import java.util.Scanner;
public class Looping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the elements : ");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("For Loop: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("While Loop: ");
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i]+" ");
            i++;
        }
        System.out.println();
        System.out.println("Do-While Loop: ");
        int j = 0;
        do {
            System.out.print(arr[j]+" ");
            j++;
        } while (j < arr.length);
        System.out.println();
        System.out.println("For-Each Loop: ");
        for (int num : arr) {
            System.out.print(num+" ");
        }

        sc.close();
    }
}
