package org.example;
import java.util.ArrayList;
import java.util.List;

public class Utility {

    public static int getSum(List<Integer> numbers)
    {
        int sum = 0;
        for (int sumOfNumbers : numbers)
        {
            sum += sumOfNumbers;
        }
        return sum;
    }

    public static List<Integer> getOddNumbers(List<Integer> numbers)
    {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int odd : numbers)
        {
            if (odd % 2 != 0)
            {
                oddNumbers.add(odd);
            }
        }
        return oddNumbers;
    }

    public static List<String> convertToStringList(List<Integer> numbers)
    {
        List<String> stringList = new ArrayList<>();
        for (int odd : numbers)
        {
            stringList.add(String.valueOf(odd));
        }
        return stringList;
    }

    public static List<String> doubling(List<String> strings)
    {
        List<String> doubleString = new ArrayList<>();
        for (String string : strings)
        {
            doubleString.add( string + string);
        }
        return doubleString;
    }


        public static void main (String[]args){

    System.out.println("Task 2");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(28);
        numbers.add(2);
        numbers.add(10);
        numbers.add(63);

        List<String> strings = new ArrayList<>();
        strings.add("2i");

        System.out.println("Sum: " + getSum(numbers));
        System.out.println("Odd numbers: " + getOddNumbers(numbers));
        System.out.println("String list: " + convertToStringList(numbers));
        System.out.println("Doubled strings: " + doubling(strings));


    }
}

