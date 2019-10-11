import org.testng.IMethodInstance;
import org.testng.annotations.Test;

import java.util.Arrays;

public class Day {


    @Test
    public void testMethod1() {
        System.out.println("This will be printed");

    }

    @Test
    public void testNumbers() {
        int myNumber = 5;
        double d = 4.5;

        System.out.println(myNumber);
        System.out.println(d);
    }

    @Test
    public void testCharsAndString() {
        char leterG = 'g';
        String s2 = "Who who who who";
        System.out.println("leterG");
        System.out.println(s2);
    }

    @Test
    public void testNumberofCoocies() {
        int numberCoocies = 4;
        String message = "I have " + numberCoocies + " cookies";
        System.out.println(message);


    }

    @Test
    public void testBoolean() {
        boolean b = false;
        System.out.println(b);
    }

    @Test
    public void testConditionals() {
        boolean value1 = true;
        boolean value2 = false;
        System.out.println(!value1);
        System.out.println(!value2);
        System.out.println(value1 || value2);
        System.out.println(value1 && value2);
        System.out.println(value1 == value2);

    }

    @Test
    public void testOperaterIF() {
        int a = 5;

        if (a == 4) {
            System.out.println("Ohhh! So a is 4!");
        } else {
            System.out.println("Ohhh! So it os not 4!");
        }
    }

    @Test
    public void testArrays() {
        int[] arrayofInt = {1, 3, 3, 4, 5, 6, 7, 8, 9, 9};
        arrayofInt[0] = 0;
        String result = Arrays.toString(arrayofInt);
        System.out.println(result);


    }

    @Test
    public void testForLoops() {

        for (int i = 1; i < 11; i++) {
            System.out.println("Count is " + i);

        }
    }

    @Test
    public void testNumbersInArray() {
        int[] arrayOfInt = {1, 3, 3, 4, 5, 6, 7, 8, 9, 9};
        for (int i = 0; i < arrayOfInt.length; i++) {
            System.out.println(arrayOfInt[i]);

        }
    }
}









    