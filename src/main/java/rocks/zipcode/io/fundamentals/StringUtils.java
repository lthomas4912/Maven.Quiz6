package rocks.zipcode.io.fundamentals;


import java.util.Collection;

/**
 * @author leon on 10/01/2019.
 */
public class StringUtils {
    /**
     * @param string - string to be evaluated
     * @return collection containing all permutations of casing of this string
     */
    public static Collection<String> getAllCasings(String string) {
        // get length of string
        // get range of length
        // get power-set of range

        // for every set in power-set
        // uppercase indices of string using set
        return null;
    }

    /**
     * @param string  - string to be evaluated
     * @param indices - indices to be evaluated
     * @return near-identical string whose characters at specified indices are capitalized
     */
    public static String upperCaseIndices(String string, Integer... indices) {
        String result = "";
        char cap = Character.toUpperCase(string.charAt(indices.length));

        return cap + string.substring(1);
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param valueToBeInserted     - value to insert into string
     * @param index                 - string-index at which to insert value into string
     * @return near-identical string with `valueToBeInserted` inserted at `index`
     */
    public static String insertAtIndex(String stringToBeManipulated, String valueToBeInserted, Integer index) {
        String result = new String();
        for (int i = 0; i < stringToBeManipulated.length(); i++) {
            result += stringToBeManipulated.charAt(i);
            if (i == index) {
                result += valueToBeInserted;
            }
        }
        return result;
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param replacementValue      - value to insert at `index`
     * @param index                 - position of string to be manipulated
     * @return near-identical string with character at `index` replaced with `replacementValue`
     */
    public static String replaceAtIndex(String stringToBeManipulated, Character replacementValue, Integer index) {
        String result = "";
        for (int i = 0; i < stringToBeManipulated.length(); i++) {
            result += (stringToBeManipulated.charAt(i));
            if (i == index) {
                i = replacementValue;
                result+= i;
                System.out.println(result);
            }
        }
        return result;
    }
}

