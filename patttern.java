import java.util.*;
public class design{
    // Function to demonstrate pattern
    public static void printPattern(int n)
    {
        int i, j;
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                // printing column values upto the row
                // value.
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}
