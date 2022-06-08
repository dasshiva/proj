/* 2. Write a program to accept name and total marks of N number of students in two
single subscript array name[] and totalmarks[ ].
Calculate and print:
(i) The average of the total marks obtained by N Number of students.
[average = (sum of total marks of all the students)/N]
(ii) Deviation of each student’s total marks with the average.
[deviation = total marks of a student – average] */

import java.util.Scanner;
public class Q2 {
    public static double getAvg(int[] marks) {
        double avg = 0.0f;
        int len = marks.length;
        for (int i = 0; i < len; i++) { // calculate sum of all marks
            avg += marks[i];
        }
        return (avg/len); // divide by len and return average 
    }

    public static void getDev(double avg, String[] names, int[] marks) {
        double dev = 0;
        for (int i = 0; i < names.length; i++) {
            dev = marks[i] - avg;
            // the deviations will be printed in the following format
            // Shivam deviation - 30.0
            // assuming Shivam is a student who has deviation 30.0
            System.out.println(names[i] + " deviation - " + dev);
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of inputs : ");
        int len = sc.nextInt();
        String[] name = new String[len];
        int[] totalmarks = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.print("Enter name : ");
            name[i] = sc.next();
            System.out.print("Enter total marks : ");
            totalmarks[i] = sc.nextInt();
        }
        sc.close();
        double  avg = getAvg(totalmarks);
        System.out.println("Average of marks = " + avg);
        getDev(avg, name, totalmarks);
    }

}

/* Output (Run 1) :
Enter number of inputs : 3
Enter name : A
Enter total marks : 300
Enter name : B
Enter total marks : 250
Enter name : C
Enter total marks : 270
Average of marks = 273.3333333333333
A deviation - 26.666666666666686
B deviation - -23.333333333333314
C deviation - -3.3333333333333144

Output (Run 2) :
Enter number of inputs : 4
Enter name : AA
Enter total marks : 100
Enter name : BB
Enter total marks : 80
Enter name : CC
Enter total marks : 90
Enter name : DD
Enter total marks : 81
Average of marks = 87.75
AA deviation - 12.25
BB deviation - -7.75
CC deviation - 2.25
DD deviation - -6.75
*/