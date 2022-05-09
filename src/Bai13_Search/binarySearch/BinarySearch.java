package Bai13_Search.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] list = new int[100];
        int target = 55;

        for (int i=0; i<list.length; i++)
            list[i] = i;

//        int result = Arrays.binarySearch(list, target);
        int result = binarySearch(list, target);

        if(result == -1){
            System.out.println("Element not found");
        }else
            System.out.println("Element found at "+result);
    }

    private static int binarySearch(int[] list, int target) {
        int left = 0;
        int right = list.length-1;

        while (left<=right){
            int middle = (left+right)/2;

            if(target<list[middle])
                right = middle -1;
            else if(target>list[middle])
                left = middle + 1;
            else
                return middle;
        }
        return -1;
    }

}
