//import java.util.Scanner;
//import java.util.Random;
public class center {
    public static void main(String[] args) 
    {
        tuna tunaObj = new tuna();
        System.out.println(tunaObj.toMilitary());
        tunaObj.setTime(6, 60, 24);
        System.out.println(tunaObj.toMilitary());
        tunaObj.setTime(14, 25, 60);
        System.out.println(tunaObj.toPublic());
        tunaObj.setTime(1, 25, 60);
        System.out.println(tunaObj.toPublic());
    }
}
