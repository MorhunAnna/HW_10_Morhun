package org.example;

public class Exeption2 {
public static void main(String[] args) {
    try {
        f();
    }
    catch (Exception ex)
    {
        System.out.println(ex.getMessage());
    }
}

    public static void g() throws Exception
    {

        throw new Exception();
    }

public static void f()
{
    try
    {
        g();
    }
    catch (Exception exeption)
    {
        throw new RuntimeException(exeption);
    }
}
}
