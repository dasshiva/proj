/* 18. Write a program to input 10 numbers into an integer array and interchange the
consecutive elements in it. That is, interchange a[0] with a[1], a[2] with a[3], a[4] with
a[5]..... */

import java.util.Scanner;
public class Q18 {
    static void swapper(int[] arr) {
        // This loop starts from index 0 till the index equal to the length of the array - 2.
        // For example, if arr has 3 elements then, this array will loop till index 1 (i.e it will
        // only loop over the first 2 elements). This is essential because if the loop were to go
        // on till the last element then the attempt to swap the last element will cause us to
        // exceed the array's bounds, thereby raising an exception. 
        // Thus, arr.length - 2 has been used here. See Run 2 of the output for a demonstration
        for (int i = 0; i <= arr.length - 2; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of array elements: ");
        int sz = sc.nextInt();
        int[] arr = new int[sz];
        for (int i = 0; i < sz; i ++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        swapper(arr);
        System.out.println("The swapped array is : ");
        System.out.print("[ ");
        for (int i = 0; i < sz; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print(" ]");
    }
}

/* Output (Run 1):
Enter number of array elements: 10
Enter element: 9
Enter element: 12
Enter element: 3
Enter element: 7
Enter element: 89
Enter element: 34
Enter element: 15
Enter element: 16
Enter element: 67
Enter element: 25
The swapped array is : 
[ 12 9 7 3 34 89 16 15 25 67 ]

Output (Run 2):
Enter number of array elements: 3
Enter element: 80
Enter element: 101
Enter element: 34
The swapped array is : 
[ 101 80 34  ]
*/