import java.util.*;

public class MinimalJumper {
    public static int avoidObstacles(int[] inputArray) {
        int jump = 1;
        boolean fail = true;
        while(fail) {
            jump++;
            fail = false;
            for(int i=0; i<inputArray.length; i++)
                if(inputArray[i]%jump==0) {
                    fail = true;
                    break;
                }
        }
        return jump;
    }

    public static int avoidObstacles_my(int[] inputArray) {
        int result = 0, max = 0;
        boolean found = false;
        final Set<Integer> setOfDivisors = new TreeSet<>();
        for (int i = 0; i < inputArray.length; ++i) {
            setOfDivisors.add(inputArray[i]);
            if (inputArray[i] >= max)
                max = inputArray[i];
            for (int j = 2; j < inputArray[i]; ++j)
                if (inputArray[i] % j == 0)
                    setOfDivisors.add(j);
        }
        for (int i = 2; i < max; ++i) {
            if (!setOfDivisors.contains(i)) {
                result = i;
                found = true;
                break;
            }
        }
        return found ? result : max + 1;
    }
}
