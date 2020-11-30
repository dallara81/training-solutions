package gyakorloautoboxingunboxing01;

import java.io.*;
import java.util.*;

public class GyakorloAutoboxingUnboxing01 {

    {
        public static int sumOfOddNumber(List<Integer> list)
        {
            int sum = 0;
            for (Integer i : list)
            {
                if(i % 2 != 0)
                    sum += i;
                using intvalue implicitly
                if(i.intValue() % 2 != 0)
                    sum += i.intValue();*/
            }
            return sum;
        }
        public static void main (String[] args)
        {
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < 10; i++)
                list.add(i);
            int sumOdd = sumOfOddNumber(list);
            System.out.println("A páratlan számok összege = " + sumOdd);
        }
    }
}

