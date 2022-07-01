import java.util.Scanner;

public class SelectionSortStringArr_Alt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int size = scan.nextInt();
        String[] elements = new String[size];
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < size; i++) {
            elements[i] = scan.next();
            elements[i].toLowerCase();
        }
        selectionSort(elements, size);
    }

    private static void selectionSort(String[] elements, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (elements[i].compareTo(elements[j]) > 0) {
                    String temp = elements[j];
                    elements[j] = elements[i];
                    elements[i] = temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        for (int k = 0; k < size; k++) {
            System.out.println(elements[k]);
        }
    }
}