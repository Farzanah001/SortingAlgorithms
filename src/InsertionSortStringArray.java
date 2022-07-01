import java.util.Scanner;

public class InsertionSortStringArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Array Size:");
        int size= scan.nextInt();
        String[] array=new String[size];
        System.out.println("Enter the Array Elements:");
        for(int i=0;i<size;i++){
            array[i]= scan.next();
        }
        insertionSort(array,size);
    }

    private static void insertionSort(String[] array, int size) {
        for(int i=1;i<size;i++){
            String extract=array[i];
            int j=i-1;
            while(j>=0 && array[j].compareTo(extract)>0){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=extract;
        }
        System.out.println("Sorted Array:");
        for(int i=0;i<size;i++){
            System.out.println(array[i]);
        }
    }
}
