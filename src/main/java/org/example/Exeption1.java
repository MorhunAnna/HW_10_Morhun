package org.example;

public class Exeption1 {

    public static void main(String[] args) {
        System.out.println("Task 1");

        try
        {
            throw new Exception("Exception");
        }
        catch (Exception exeption)
        {
            System.out.println("Catch exception: " + exeption.getMessage());
        }
        finally
        {
            System.out.println("Finally");
        }
    }
}
