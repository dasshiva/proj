/* 16. A tech number has even number of digits. If the number is split in two equal halves,
then the square of sum of these halves is equal to the number itself. Write a program to
generate and print all four digits tech numbers.
Example
Consider the number : 3025
Square of sum of the halves of 3025=(30+25)2= (55)2
=3025 is a tech number. */

public class Q16 {
    static boolean isTech(int number) {
        boolean ret = false;
        int part1 = number / 100, part2 = number % 100;
        if ((part1 + part2) * (part1 + part2) == number) 
            ret = true;
        return ret;
    }

    public static void main(String[] args) {
        System.out.println("The 4-digit tech numbers are: ");
        for (int i = 1000; i <= 9999; i++) {
            if (isTech(i))
               System.out.println(i);
        }
    }
}

/* Output:
The 4-digit tech numbers are: 
2025
3025
9801
*/