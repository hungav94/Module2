import java.util.Scanner;

public class DeleteElementInArray {
    public static void deleteElementInArray(int output, int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (output == arr[i]) {
                index = i;
                break;
            }
        }
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;

    }

    public static void listArray(int[] arr) {
        System.out.print("\nList array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.print("nhap gia tri can xoa: ");
        int output = sc.nextInt();
        listArray(arr);
        deleteElementInArray(output, arr);
        listArray(arr);
    }
}
