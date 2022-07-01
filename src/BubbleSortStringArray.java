import java.util.Scanner;

public class BubbleSortStringArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter Array Size: ");
        int n=s.nextInt();
        String arr[]=new String[n];
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=s.next();
        }
        bubbleSort(arr,n);
    }

    private static void bubbleSort(String[] arr, int n) {
        boolean sorted=false;
        int lastIndex=arr.length-1;
        while(!sorted) {
            sorted=true;
            for (int i = 0; i < lastIndex; i++) {
                if (arr[i].compareTo(arr[i + 1])>0) {
                    swap(arr, i, i+1);
                    sorted = false;
                }
            }
            lastIndex--;
        }
        System.out.println("Sorted Array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void swap(String[] arr, int i, int i1) {

        String temp=arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;
        }
    }
