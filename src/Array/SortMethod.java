package Array;

import java.util.Arrays;

public class SortMethod {

    public void CollectionSort(){

    }
    public static void main(String[] args) {
        int arr[] = {11,23,3,8,77,543,0,11};
        System.out.println("orignal array is : " + Arrays.toString(arr));
//        System.out.println("sorted array is : " + Arrays.toString(Arrays.sort(arr))); // you can not do like this.

//        Arrays.sort(arr);
//        System.out.println("sorted array without parameters: " +  Arrays.toString(arr));


        // Sort subarray from index 1 to 4, i.e.,
        // only sort subarray {23,3,8,77} and
        // keep other elements as it is.

        Arrays.sort(arr, 1, 5);
        System.out.println("sorted array with parameters: " +  Arrays.toString(arr));

    }
}


