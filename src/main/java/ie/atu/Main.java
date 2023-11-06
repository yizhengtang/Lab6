package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
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

    }
}