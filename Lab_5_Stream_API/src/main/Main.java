package main;

import methods.MethodsUsingStreamAPI;

import javax.naming.SizeLimitExceededException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(MethodsUsingStreamAPI.getAverageFromIntegerList(Arrays.asList(1, 2, 3, 4)));
        MethodsUsingStreamAPI.upStrings(Arrays.asList("firStr", "secStr")).stream().forEach(System.out::println);
        MethodsUsingStreamAPI.getSquaresOfUniqueNumbers(Arrays.asList(1, 2, 2, 4, 4, 5, 7, 8, 8)).stream().forEach(System.out::println);
        System.out.println(MethodsUsingStreamAPI.getStringsWithExactFirstSymbol(Arrays.asList("firStr", "secStr", "fakeStr"), 'f'));
        try {
            System.out.println(MethodsUsingStreamAPI.getLastSymbolOfCollection(Arrays.asList(1, 2, 2, 4, 4, 5, 7, 8, 8)));
        } catch (SizeLimitExceededException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println(MethodsUsingStreamAPI.getSumEvenNumbers(new int[]{1, 2, 2, 4, 4, 5, 7, 8, 8}));
        System.out.println(MethodsUsingStreamAPI.getMapFromStringList(Arrays.asList("firStr", "secStr", "testStr")));
    }
}