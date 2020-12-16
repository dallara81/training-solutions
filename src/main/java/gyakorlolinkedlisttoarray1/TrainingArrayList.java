package gyakorlolinkedlisttoarray1;
// How to convert linked list to array in java?

import java.util.ArrayList;

public class TrainingArrayList
{
    public static void main(String arg[])
    {
        ArrayList<String> listOfNames = new ArrayList<String>();
        listOfNames.add("JAVA");
        listOfNames.add("GOAL");
        listOfNames.add("LEARNING");
        listOfNames.add("WEBSITE");

        ArrayList<Integer> listOfNumber = new ArrayList<Integer>();
        listOfNumber.add(123);
        listOfNumber.add(456);
        listOfNumber.add(789);

        // It returning array of Object type
        Object[] namesArray =  listOfNames.toArray();
        System.out.println("String Array:");
        for(Object obj : namesArray)
            System.out.println(obj);

        // It returning array of Object type
        Object[] numberArray =  listOfNumber.toArray();
        System.out.println("Integer Array:");
        for(Object obj : numberArray)
            System.out.println(obj);
    }
}
