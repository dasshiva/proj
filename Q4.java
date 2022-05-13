/*4. Write a program to input integer elements into an array of size 20 and perform the
following operations:
(i) Display largest number from the array.
(ii) Display smallest number from the array.
(iii) Display sum of all the elements of the array. */

import java.util.Scanner;
public class Q4 {
    public static int getLargest (int[] arr) {
        int a, largest = 0;
        for (a = 0; a < arr.length; a++) {
            if (arr[a] > largest)
            largest = arr[a];
        }
        return largest;
    }
    public static int getSmallest (int[] arr) {
        int b, smallest = arr[0]; // assume the first element is smallest
        for (b = 0; b < arr.length; b++) {
            if (arr[b] <= smallest)
            smallest = arr[b];
        }
        return smallest;
    }

    public static int getSum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            System.out.print("Enter number : ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Largest element : " + getLargest(arr));
        System.out.println("Smallest element : " + getSmallest(arr));
        System.out.println("Sum of all elements : " + getSum(arr));
    }
}

/* Output (Run 1) :
Enter number : 92828
Enter number : 29291
Enter number : 93492
Enter number : 28742  
Enter number : 23433
Enter number : 37427
Enter number : 27429
Enter number : 29842 
Enter number : 29933
Enter number : 87722
Enter number : 29382  
Enter number : 23984 
Enter number : 47736 
Enter number : 32378
Enter number : 30234
Enter number : 29842
Enter number : 29348
Enter number : 48722
Enter number : 29384
Enter number : 28742
Largest element : 93492
Smallest element : 23433
Sum of all elements : 809891

Output (Run 2) :
Enter number : 82919
Enter number : 29928 
Enter number : 91882
Enter number : 92882
Enter number : 13422
Enter number : 90123
Enter number : 29482 
Enter number : 90823
Enter number : 99812
Enter number : 67342
Enter number : 82732
Enter number : 45321
Enter number : 82738
Enter number : 28374
Enter number : 23742 
Enter number : 29874 
Enter number : 27472
Enter number : 22848
Enter number : 28742
Enter number : 28724
Largest element : 99812
Smallest element : 13422
Sum of all elements : 1089182
*/