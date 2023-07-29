//question02
package com.mycompany.arrayoutofboundsexample;
public class ArrayOutOfBoundsExample 
{
    public static void main(String[] args) 
    {
        // Create an array of integers
        int[] numbers = { 10, 20, 30, 40, 50 };

        try 
        {
            // Attempt to access an index that is out of bounds
            int index = 10; // Change this index to see different results
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            // Handle the ArrayIndexOutOfBoundsException
            System.out.println("Error: Invalid index. The array size is " + numbers.length +
                               " and you tried to access index " + e.getMessage());
        }
    }
}
