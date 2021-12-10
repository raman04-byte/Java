import java.util.Scanner;
import java.lang.reflect.Constructor;
import java.util.*;
import java.text.*;
import java.io.*;
import java.math.*;
import java.util.regex.*;  

class Singleton
{
    private Singleton(){};
    public String str;
    private static Singleton instance;
    public static Singleton getSingleInstance()
    {
        if(instance == null)
        {
            return new Singleton();
        }
        return instance;
    }
}