package methods;

import javax.naming.SizeLimitExceededException;
import java.util.*;
import java.util.stream.Collectors;

public class MethodsUsingStreamAPI {

    public static float getAverageFromIntegerList(List<Integer> list) {
        return (float) list.stream().reduce(0, (elem1, elem2) -> elem1 + elem2)
                / list.stream().count();
    }

    public static List<String> upStrings(List<String> list) {
        return list.stream().map((str) -> {
            str = str.toUpperCase();
            str = "_new_" + str;
            return str;
        }).toList();
    }

    public static List<Integer> getSquaresOfUniqueNumbers(List<Integer> list) {
        return list.stream().filter((elem) -> list.stream().filter((num) -> num == elem).count() == 1)
                .map((elem) -> elem * elem).toList();
    }

    public static List<String> getStringsWithExactFirstSymbol(Collection<String> strings, char firstSymbol) {
        return strings.stream().filter((str) -> str.charAt(0) == firstSymbol)
                .sorted((str1, str2) -> str1.compareTo(str2)).toList();
    }

    public static <T> T getLastSymbolOfCollection(Collection<T> collection) throws SizeLimitExceededException {
        if (collection.isEmpty()) {
            throw new SizeLimitExceededException("Length of the collection must be > 0");
        }
        return collection.stream().skip(collection.size() - 1).findFirst().get();
    }

    public static int getSumEvenNumbers(int[] array) {
        return Arrays.stream(array).filter((num) -> num % 2 == 0).reduce(0, (num1, num2) -> num1 + num2);
    }

    public static Map<Character, String> getMapFromStringList(List<String> list) {
        return list.stream().collect(Collectors.toMap((str) -> str.charAt(0), str -> str));
    }

}