package rocks.zipcode.io.fundamentals;

import rocks.zipcode.io.arrays.ArrayUtils;

import java.util.Arrays;
import java.util.stream.Stream;

public class BasicStringUtils {
    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(char[] chars) {
        return String.valueOf(chars);
    }

    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(Character[] chars) {
        StringBuilder sb = new StringBuilder();
        Arrays.stream(chars).forEach(s -> sb.append(s));
        return sb.toString();
    }

    /**
     * @param string - string to be manipulated
     * @return identical string with lowercase and uppercase vowels removed
     */
    public static String removeAllVowels(String string) {
        return removeSpecifiedCharacters(string, "aeiou");
    }

    /**
     * @param string             - string to be manipulated
     * @param charactersToRemove - characters to be removed from string
     * @return
     */
    public static String removeSpecifiedCharacters(String string, String charactersToRemove) {
        Character[] charArray = ArrayUtils.box(string.toCharArray());
        Character[] newArray = Stream.of(charArray).filter(c -> !matchesCharactertoRemove(c,charactersToRemove)).toArray(Character[]::new);
        return getString(newArray);
    }

    public static Boolean matchesCharactertoRemove(char letter, String charactersToRemove){
        return String.valueOf(letter).toLowerCase().matches("[" +charactersToRemove.toLowerCase()+"]+");
    }
}
