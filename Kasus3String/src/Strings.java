import java.util.Scanner;

public class Strings {
    //Reads in an array of integer, sorts them,
    //then prints them in sorted order.
    public static void main(String[] args) {
        String[] strList; //Sebelumnya Integer menjadi String
        // Integer termasuk kedalam tipe data comparable,
        // sedangkan int tidak. karena parameternya hanya menerima
        // Comparable[]
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.println("\nHow many strings do you want to sort? ");
        size = scan.nextInt();
        strList = new String[size];

        System.out.println("\nEnter the numbers...");
        for (int i = 0;i<size;i++){
            strList[i] = scan.next();
        }

        Sorting.insertionSort(strList);
        System.out.println("\nYour strings in sorted order...");
        for (int i = 0;i<size;i++){
            System.out.println(strList[i] + " ");
        }
        System.out.println();
    }
}