package Bai3_Array;

public class IsMinInArray2 {
    public static void main(String[] args) {
        int [] array = {5,4,2,-5};
        int index = minValue(array);
        System.out.println("The smallest element of array is "+array[index]+" at "+index+" index");
    }

    public static int minValue (int[] array){
        int index =0;
        for (int i=1; i<array.length; i++){
            if(array[i]<array[index]){
                index = i;
            }
        }
        return index;
    }

}
