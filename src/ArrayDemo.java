/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 24-Jul-20
 *  Time: 12:06 PM
 */

import java.util.Scanner;

/*
Declare, create/ initialize and process the array (print)
 */
public class ArrayDemo {
    public static void main(String[] args) {
        //declaration
        int[] arr;
        //create or initialize, this array will initialize to default values
        arr = new int[5];
        // print to check default values
        System.out.println("Default values");
        for (int i = 0; i < arr.length ; i++){
            System.out.print(arr[i]);
            System.out.print(", ");
        }
        // initialize with custom values
        arr[0] = 200;
        arr[1] = 500;
        arr[2] = 300;
        arr[3] = 900;
        arr[4] = 700;
        System.out.println();
        System.out.println("Printing custom values");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]);
            System.out.print(", ");
        }
        System.out.println();

        //user input by scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 5 integer values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //printing user input
        System.out.println("printing user input");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(", ");
        }
        System.out.println();

        int[] brr = {10,20,30,40,50};
        int[] crr = new int[]{12,23,34,45,56,67,78};

        int[] krr = new int[0];
        int[] prr = arr;
        prr[0] = 1000;

        //printing user input
        System.out.println("printing arr");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(", ");
        }
        System.out.println();



    }
}
