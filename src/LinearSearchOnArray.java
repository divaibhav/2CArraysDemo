/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 24-Jul-20
 *  Time: 12:37 PM
 */

import java.util.Scanner;

/*
Looking foe an element with in the array.
 */
public class LinearSearchOnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,13,34,54,53,65,67,78,97};
        System.out.println("enter the element to search");
        int searchElement = sc.nextInt();
        //for loop to iterate over array
        int i;
        for (i = 0; i < arr.length; i++) {
            if(searchElement == arr[i]){
                System.out.println("element found");
                break;
            }

        }
        if(i == arr.length){
            System.out.println("not found by outside loop");
        }
        sc.close();
    }
}
