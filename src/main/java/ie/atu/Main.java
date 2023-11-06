package ie.atu;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int []anArray;
        int i , num = 100, counter = 0;

        anArray = new int [10];

        for (i = 0; i < 10; i ++)
        {
            anArray[i] = num;
            num+=100;
        }

        method(anArray, counter);

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

    static void method(int [] anArray, int counter)
    {
        for (int value: anArray)
        {
            System.out.println("Element at index " + counter + ": " + value);
            counter++;
        }
    }
}