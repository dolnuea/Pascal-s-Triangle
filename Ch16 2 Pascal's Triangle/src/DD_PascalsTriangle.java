import java.util.Scanner;

/**
 * @author Dolunay Dagci
 * CISS 111-360
 * Assignment: Ch16 2 Pascal's Triangle
 * Due date: Sunday, March 31, 2019
 * This program takes n input from the user, and forms Pascal's Triangle in n number of rows that the user entered.
 */
public class DD_PascalsTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //create scanner to interact with the user
        System.out.println("How many rows do you want in Pascal's Triangle?"); //ask the user for n --number of rows in the triangle--
        int n = scanner.nextInt(); //the number of rows that will be created in the Pascal's Triangle
        printTriangle(n); //build Pascal's Triangle
    }

    /**
     * @param row rows in Pascal's Triangle
     * @param col columns in Pascal's Triangle
     * @return values in the Pascal's Triangle
     */
    private static int pascalTriangle(int row, int col) {

        if (col == 0 || col == row) return 1; //base case is 0, returns 1
        else
            return pascalTriangle(row - 1, col - 1) + pascalTriangle(row - 1, col); //Recursive formula to create remaining values in Pascal's Triangle.
    }

    /**
     * @param n the input from the user which is the number of rows that will be in Pascal's Triangle
     */
    private static void printTriangle(int n) {

        for (int row = 0; row < n; row++) { //make n number of rows
            for(int spacer = n ; spacer > row ; spacer--) System.out.print(" "); //forms a good looking triangle
            for (int col = 0; col <= row; col++) { //build the triangle by placing the columns which are incremented one by one every row
                System.out.print(pascalTriangle(row, col) + " "); //put the remaining values in Pascal's Triangle into each line/row
            }
            System.out.println(); //pass to a new line after each row
        } }
}
