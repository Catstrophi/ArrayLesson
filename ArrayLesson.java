import java.util.Arrays;

public class ArrayLesson {
    public static void main(String[] args) {
        /*
         Unlike Python, Arrays in Java do not
         support multiple data types, and cannot change length, but their
         values can be modified
        */

        int[] arr = {-14, 12,  9, -99, 42};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println();

        /*
         int[] arr2 = new int[size];
         When initializing in this way, and array of length size will
         be created and populated with 0.0, or null values depending
         on the data type.
         To print an array, we must call Arrays.toString(varName).
         or else it will print the hash code.
        */

        int[] arr2 = new int[5];
        System.out.println(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println();

        /*
         Setting an array equal to another array only gives the original
         a new namespace. It does NOT create a new array, and any
         changes made to the new array will be reflected in the old
         array.
                arr2 = arr;
                System.out.println(Arrays.toString(arr2));
        */

        int[] arr3;
        arr3 = new int[] {-14, 12,  9, -99, 42};
        System.out.println(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println();

        int[] arr4 = new int[5];
        arr4 = Arrays.copyOf(arr3, 5);
        System.out.println(arr4);
        System.out.println(Arrays.toString(arr4));
        System.out.println();

        System.out.println(Arrays.toString(getMaxIdk(arr4)));

        /*
         for(int i = 1; i<arr.length; i++){
             System.out.println(arr[i] + " ");
         }

         Enhanced for loops, only works with array and arrayLists
         take on te following syntax:
            for(dataType name: arrayName)
            where the data type is the type of each individual cell
        The tradeoff is that you don't have access to individual
        index numbers; only the numbers


         for(int val: arr){
             System.out.println(val);
         }
        */

    }
    public static int[] getMaxIdk(int[] arr){
        int maxVal = arr[0];
        int idx = 0;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]> maxVal){
                maxVal = arr[i];
                idx = i;
            }
        }
        return new int[] {idx, maxVal};
    }


}
