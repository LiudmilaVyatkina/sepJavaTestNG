import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Day2 {

    @Test
    public void testPrintEvenNumbers() {
        for (int i = 1; i <= 10; i++){
            if ( i % 2 ==0) System.out.println(i);
        }
    }

    @Test
    public void testPrintElement1() {
        int[] intArray = {0, 10, 20, 30, 40, 50};
        for (int num : intArray) {

        System.out.println("Enhanced for loop i = " + num);
    }
        
    }

    @Test
    public void testCharElementPrint() {
        int i = 0;
        while (i < 7) {
            System.out.println("While loop: i = " + i++);
        }

    }



    @Test
    public void testTwoNumbersInArray() {
        int[] array = {1,2,3,4};
        swap(array, 1, 2);
        System.out.println(Arrays.toString(array));

    }
    @Test
    public void testBreakingInArray() {
        int[] array = {1,2,3,4};
        swap(array, 5, 5);
        System.out.println(Arrays.toString(array));

    }

    private void swap(int[] array, int indexL, int indexR) {
        int temp = array [indexL];
        array [indexL] = array [indexR];
      array [indexR]  = temp;

    }

    @Test
    public void testTwoNumberinArray2() {
        int[] array = {5,6,8,7};
        swap(array, 2, 3);
        System.out.println(Arrays.toString(array));

    }

    @Test
    public void testTwoNumberInArray3() {
        int[] array = {5,6,8,9,10,15};
        swap(array, 1,2);
        System.out.println(Arrays.toString(array));

    }

    @Test
    public void testCountLetters() {
        String input = "I would like to go to the city";
        int result = 0;
        for (char eachChar : input.toCharArray()){
            if (eachChar== 't') result++;

        }
        System.out.println(result);
    }


    @Test
    public void testClassObects() {
        Actor actor1 = new Actor();
        Actor actor2 = new Actor("Arnold", "Scwarzneger",45, "male");
        Actor actor3 = new Actor("Anna", "Hatetui", 36, "female");

        actor2.act();
        actor2.play();
        actor2.retire();

        actor3.act();
        actor3.play();
        actor3.retire();


    }

    @Test
    public void testArrays() {
        int[] array = {1,2,3,4,5,6,7};
        ArrayList <Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(1);
        arrayList.add(2);
        System.out.println(arrayList.size());
        arrayList.remove( 1);

        System.out.println(arrayList.size());

    }
}
