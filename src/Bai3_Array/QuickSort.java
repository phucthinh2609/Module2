package Bai3_Array;
import java.util.Arrays;

public class QuickSort {
    static void quickSort(int[] array, int L, int R){
        //Dkien dung
        if (L >= R) return;
        //B1: Chon khoa
        int key = array[(L+R)/2];
        //B2: Phan bo lai mang theo khoa
        int k = partition(array, L, R, key);
//        System.out.println("L= "+L+ " R= " + R+ " key= "+key+" k= "+k);
//        System.out.println(Arrays.toString(Arrays.copyOfRange(array,L,R+1)));
//        System.out.println("=====================");
        //B3: Chia doi mang => Lap lai
        quickSort(array, L, k-1);
        quickSort(array, k, R);
    }
    //Return pivot (chot)  value
    //partition: Phan bo lai mang (vach ngan)
    static int partition(int[] array, int L, int R, int key){
        int iL = L;
        int iR = R;
        while (iL <= iR){
            //Voi iL, di tim phan tu >= key de doi cho
            while(array[iL] < key) iL++;
            //Voi iR, di tim phan tu <= key de doi cho
            while (array[iR] > key) iR--;
            //Doi cho 2 phan tu
            if(iL<=iR){
                int temp = array[iL];
                array[iL] = array[iR];
                array[iR] = temp;
                iL++; iR--;
            }
        }
        return iL;
    }

    public static void main(String[] args) {
        int[] array = {6,7,8,5,4};
//        System.out.println("First");
//        System.out.println(Arrays.toString(array));
//        System.out.println("=====================");
        quickSort(array,0, array.length-1);
        System.out.println("Last");
        System.out.println(Arrays.toString(array));
    }
}
