import java.util.Locale;
import java.util.Scanner;

public class SelectionSortStringArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int size= scan.nextInt();
        String[] elements=new String[size];
        System.out.println("Enter Array Elements:");
        for(int i=0;i<size;i++){
            elements[i]= scan.next();
            elements[i].toLowerCase();
        }
        selectionSort(elements,size);
    }

    private static void selectionSort(String[] elements, int size) {
        int minIndex;
        String minStr;
        for(int i=0;i<size-1;i++){
            minIndex=i;
            minStr=elements[i];
            for(int j=i+1;j<size;j++){
                if(elements[j].compareTo(minStr)<0){
                    minStr=elements[j];
                    minIndex=j;
                }
            }
            if(minIndex!=i) {
                String temp = elements[minIndex];
                elements[minIndex] = elements[i];
                elements[i] = temp;
            }
        }
        System.out.println("Sorted Array:");
        for(int i=0;i<size;i++){
            System.out.println(elements[i]);
        }
    }
}