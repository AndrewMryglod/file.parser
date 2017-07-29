package helpers;

import com.sun.istack.internal.NotNull;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class FileHelper {
    public HashMap<String, Integer> getWordsFromFile(@NotNull String fileName) {
        HashMap<String, Integer> words = new HashMap<String, Integer>();
        try {
            File fr = new File(fileName);
            Scanner sc = new Scanner(fr);
            while (sc.hasNext()) {
                String word = sc.next();
                word = removeCharacters(word);
                if (words.containsKey(word)) {
                    int count = words.get(word);
                    count++;
                    words.put(word, count);
                } else {
                    words.put(word, 1);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return words;
    }

    private String removeCharacters(String str) {
        str = str.replace(",", "");
        str = str.replace(".", "");
        str = str.toLowerCase();
        return str;
    }
}
