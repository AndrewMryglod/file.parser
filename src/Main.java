
import helpers.FileHelper;
import helpers.MapHelper;

import java.util.*;

public class Main {
    private static String fileName;
    private static int numberOfElements;

    public static void main(String[] args) {
        MapHelper mapHelper = new MapHelper();
        FileHelper fileHelper = new FileHelper();

        dataEntry();
        Map<String, Integer> words = fileHelper.getWordsFromFile(fileName);
        Map<String, Integer> sortedMap = mapHelper.sortByValue(words);
        mapHelper.printByNumber(sortedMap, numberOfElements);
    }

    private static void dataEntry(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please set file name:");
        fileName = in.next();
        System.out.println("Please set number of elements:");
        numberOfElements = in.nextInt();
    }
}