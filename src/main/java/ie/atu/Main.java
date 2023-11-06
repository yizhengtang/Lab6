package ie.atu;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int []anArray;
        int i, num = 100;

        anArray = new int [10];

        for (i = 0; i < 10; i ++)
        {
            anArray[i] = num;
            num+=100;
        }

        for (i = 0; i < 10 ; i ++)
        {
            System.out.println("Element in index " + i + ": " + anArray[i]);
        }

        try
        {
            System.out.println("Please enter element in index 10: ");
            anArray[10] = scan.nextInt();
        }

        catch (ArrayIndexOutOfBoundsException a)
        {
            System.out.println("Error, exceeding the array.");
        }

    }
}