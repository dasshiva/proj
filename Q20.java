/* 20. Write a program to accept the names of 10 cities in a single dimensional string array
and their STD (Subscribers Trunk Dialling) codes in another single
dimensional integer array. Search for a name of a city input by the user in the list. If
found, display “Search successful” and print the name of the city along with its STD
code, or else display the message “Search Unsuccessful, No such city in the list”. */

import java.util.Scanner;
public class Q20 {
    static void search(String[] city, int[] std, String search) {
        boolean found = false;
        for (int i = 0; i < city.length; i++) {
            if (city[i].equals(search)) {
                System.out.println("Search succesful");
                System.out.println("City: " + city[i] + " STD: " + std[i]);
                found = true;
                break;
            }
        }

        if (!found) 
            System.out.println("Search Unsuccessful, No such city in the list");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details below");
        String[] city = new String[10];
        int[] std = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter city name: ");
            city[i] = sc.next();
            System.out.print("Enter the city's STD: ");
            std[i] = sc.nextInt();
        }
        System.out.print("Enter the city you want to search: ");
        String search = sc.next();
        sc.close();
        search(city, std, search);
    }
}

/* 
 * Output (Run 1):
 * Enter details below
   Enter city name: Delhi
   Enter the city's STD: 11
   Enter city name: Mumbai
   Enter the city's STD: 22
   Enter city name: Kolkata
   Enter the city's STD: 33
   Enter city name: Chennai
   Enter the city's STD: 44
   Enter city name: Hyderabad 
   Enter the city's STD: 40
   Enter city name: Bangalore
   Enter the city's STD: 80
   Enter city name: Pune
   Enter the city's STD: 20
   Enter city name: Ahmedabad
   Enter the city's STD: 79
   Enter city name: Dehradun
   Enter the city's STD: 135
   Enter city name: Patiala
   Enter the city's STD: 175
   Enter the city you want to search: Kolkata
   Search succesful
   City: Kolkata STD: 33

   Output (Run 2):
   Enter details below
   Enter city name: Jaipur
   Enter the city's STD: 141
   Enter city name: Jodhpur
   Enter the city's STD: 291
   Enter city name: Udaipur
   Enter the city's STD: 294
   Enter city name: Kalyan    
   Enter the city's STD: 251
   Enter city name: Vapi
   Enter the city's STD: 260
   Enter city name: Surat
   Enter the city's STD: 261
   Enter city name: Vadodara    
   Enter the city's STD: 265
   Enter city name: Erode
   Enter the city's STD: 424
   Enter city name: Salem 
   Enter the city's STD: 427
   Enter city name: Kollam 
   Enter the city's STD: 474
   Enter the city you want to search: Kolkata
   Search Unsuccessful, No such city in the list
 */
