package rocks.zipcode.io.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author leon on 24/01/2019.
 */
public class ArrayUtils {
    /**
     * @param start - value to begin counting
     * @param end   - value to stop counting
     * @return array of all integers between `start` and `stop`
     */
    public static Integer[] getRange( Integer start, Integer end) {
        Integer[] arr = new Integer[10];
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (arr.length == count) arr = Arrays.copyOf(arr, count * 2);
            arr[count++] = i;
        }
        arr = Arrays.copyOfRange(arr, 0, count);
        Integer[] numbers = arr;
        return numbers;
    }

    /**
     * @param array - array to be unboxed
     * @return array with identical contents in primitive-array form
     */
    public static char[] unbox(Character[] array) {
        char [] newArray = new char[array.length];
        for(int i = 0; i< array.length; i++){
            newArray[i] = array[i];

        }
        return newArray;
    }

    /**
     * @param array - array to be boxed
     * @return array with identical contents in nonprimitive-array form
     */
    public static Character[] box(char[] array) {
        Character [] newArray = new Character[array.length];
        for (int i = 0; i < array.length ; i++) {
            newArray[i]= array[i];
        }
        return newArray;
    }
}
