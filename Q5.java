/* 5. Write a program to input and store roll numbers, names and marks in 3 subjects of n
number students in five single dimensional array and display the remark */
import java.util.Scanner;

public class Q5 {
    public static void grade(int sub1, int sub2, int sub3) {
        double avg = (sub1 + sub2 + sub3)/3;
        if (avg < 40) { 
            System.out.println("POOR"); 
        }
        else if (avg >= 40 && avg < 60) {
            System.out.println("PASS");
        }
        else if (avg >= 60 && avg < 75) {
            System.out.println("FIRST CLASS");
        }
        else if (avg >= 75 && avg < 84) {
            System.out.println("DISTINCTION");
        }
        else  System.out.println("EXCELLENT");
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Number of students that will be provided : ");
       int n = sc.nextInt();
       String[] names = new String[n];
       int[] rollNo = new int[n];
       int[] sub1 = new int[n];
       int[] sub2 = new int[n];
       int[] sub3 = new int[n];

       // This loop stores the information of a student in the same index in each array
       // For example, let us assume a student Shivam having roll number 24 and getting marks
       // 100, 90 and 89 in the 3 subjects respectively.
       // Then this loop will store this information in : (assuming he is the 1st student whose data the user is giving)
       // names[0] = Shivam
       // rollNo[0] = 24
       // sub1[0] = 100
       // sub2[0] = 90
       // sub3[0] = 89 
       // This means if we now access index 0 of each of the arrays we will get info about Shivam
       for (int i = 0; i < n; i++) {
           System.out.print("Enter name : ");
           names[i] = sc.next();
           System.out.print("Enter roll number: ");
           rollNo[i] =  sc.nextInt();
           System.out.print("Subject 1 marks: ");
           sub1[i] = sc.nextInt();
           System.out.print("Subject 2 marks: ");
           sub2[i] = sc.nextInt();
           System.out.print("Subject 3 marks: ");
           sub3[i] = sc.nextInt();
           if (sub1[i] > 100 || sub2[i] > 100 || sub3[i] > 100) { // The maximum marks in the subject are 100)
               System.out.println("Marks in no subject can be more than 100!");
               System.exit(0);
           }
       }
       sc.close();
       // relying on the behaviour described above, at index i of each of the arrays, we will
       // always get the marks of a particular student
       for (int i = 0; i < names.length; i++) {
           System.out.println("Name" + "\t" + "Roll number" + "\t" + "Remark");
           System.out.print(names[i] + "\t" + rollNo[i] + "\t");
           grade(sub1[i], sub2[i], sub3[i]);
       }
   } 
}

/* Output (Run 1) :
Number of students that will be provided : 3  
Enter name : A
Enter roll number: 23
Subject 1 marks: 100
Subject 2 marks: 98
Subject 3 marks: 78
Enter name : B
Enter roll number: 12
Subject 1 marks: 89
Subject 2 marks: 71
Subject 3 marks: 90
Enter name : C
Enter roll number: 10 
Subject 1 marks: 91
Subject 2 marks: 90
Subject 3 marks: 98
Name    Roll number     Remark
  A         23         EXCELLENT
Name    Roll number     Remark
  B         12         DISTINCTION
Name    Roll number     Remark
  C         10         EXCELLENT

Output (Run 2):
Number of students that will be provided : 2
Enter name : AA
Enter roll number: 1
Subject 1 marks: 89
Subject 2 marks: 45
Subject 3 marks: 40
Enter name : BB
Enter roll number: 2
Subject 1 marks: 70
Subject 2 marks: 65
Subject 3 marks: 60
Name    Roll number     Remark
 AA         1            PASS
Name    Roll number     Remark
 BB         2         FIRST CLASS
*/
