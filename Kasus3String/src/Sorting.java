//Demonstates the selection sort and insertion sort algorithms

//Fix 1, implement comparable
public class Sorting {

    //Selection sort
    public static void selectionSort(Comparable[] list) {
        //Deklarasi variabel min bertipe integer
        int min;
        //Deklarasi variabel temp bertipe Integer
        Comparable temp;

        for (int index = 0; index < list.length - 1; index++) {
            //Min di assign nilai index
            min = index;
            //scan di assign index+1. selama scan belum mencapai panjang dari Integer list, scan++
            for (int scan = index+1;scan < list.length;scan++){
                //jika Integer list index scan(1++) lebih dari Integer list index min(0)
                if(list[scan].compareTo(list[min])<0){
                    min = scan;
                }
            }
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    public static void insertionSort(Comparable[] list) {
        //Cara kerja :
        //selama index kedua lebih besar dari index sebelumnya, tukar.
        //selama index ketiga lebih besar dari index dibawahnya, tukar.
        //dst sampai index terakhir.

        //di dapat Integer array list yang mana bisa diterima Comparable.
        for(int index = 1;index< list.length;index++){
            //index yaitu 1 (index setelahnya) di assign pada variabel key.
            Comparable key = list[index];
            //indexnya yaitu 1 di assign pada position.
            int position = index;

            //Shift larger values to the right
            //Selama posisi masih lebih dari 1 dan Integer list
            //index 1 dibandingkan Integer list index 0 nilainya lebih besar
            while (position > 0&&key.compareTo(list[position-1])>1){
                list[position] = list[position-1];
                position--;
            }
            list[position] = key;
        }
    }
}
