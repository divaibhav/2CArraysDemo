/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 25-Jul-20
 *  Time: 12:14 PM
 */
import java.util.Arrays;
public class ArraysFunctions {
    public static void main(String[] args) {
        int[] arr = {101,20,13,410};
        String str = Arrays.toString(arr);
        System.out.println(str);
        /*System.out.print("[");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]);
            if(i != arr.length - 1 ) {
                System.out.print(", ");
            }
        }
        System.out.print("]");*/
        //to print an array
        /*System.out.println(Arrays.toString(arr));
        int size = 4;
        int[] brr = Arrays.copyOf(arr, arr.length);
        System.out.println("brr");
        System.out.println(Arrays.toString(brr));

        int[] crr = Arrays.copyOf(arr, 10);
        System.out.println("crr");
        System.out.println(Arrays.toString(crr));

        int[] drr = Arrays.copyOf(arr, 2);
        System.out.println("drr");
        System.out.println(Arrays.toString(drr));

        String[] srr = {"vaiibhav" , "diwan", "ramesh"};
        String[] krr = Arrays.copyOf(srr,3);
        System.out.println("krr");
        System.out.println(Arrays.toString(krr));
        */
        // copyOfRange
        int[] brr = Arrays.copyOfRange(arr, 2 , 5);
        System.out.println(Arrays.toString(brr));
        int[] crr = Arrays.copyOf(arr, 10);
        System.out.println("crr unsorted");
        System.out.println(Arrays.toString(crr));
        Arrays.sort(crr);
        System.out.println("sorted");
        System.out.println(Arrays.toString(crr));
    }
}
