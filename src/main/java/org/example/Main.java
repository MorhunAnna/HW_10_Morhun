package org.example;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
System.out.println("Task 1");
        List <String> arrayList = new ArrayList <>();
arrayList.add("pencil");
        arrayList.add("book");
        arrayList.add("textbook");
        arrayList.add("pen");
        arrayList.add("laptop");

        System.out.println("\n For: ");
        for (int i=0; i<arrayList.size(); i++)
        {
            System.out.println(arrayList.get(i));
        }

        System.out.println("\n For-each: ");
        for (String letters: arrayList)
        {
            System.out.println(letters);
        }

        System.out.println("\n While: ");
        int b = 0;
        while (b<arrayList.size())
        {
            System.out.println(arrayList.get(b));
            b++;
        }

        System.out.println("\n Iterator: ");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}