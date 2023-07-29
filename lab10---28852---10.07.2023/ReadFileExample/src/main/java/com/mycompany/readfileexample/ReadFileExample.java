//question 03
package com.mycompany.readfileexample;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileExample 
{
    public static void main(String[] args) 
    {
        String fileName = "non_existent_file.txt"; // Replace with the actual file name or path
        
        try 
        {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("Error: The file '" + fileName + "' could not be found.");
            // You can also use e.printStackTrace() to print the full stack trace.
        }
    }
}
