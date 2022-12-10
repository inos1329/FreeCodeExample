import java.lang.StringBuilder;
import java.util.Arrays;

class Solution {
    static String result;
    static String toCamelCase(String s) {
        String[] words;
        if (s.contains("_")) {
            words = s.split("_");
        } else{
            words = s.split("-");
        }
        String[] newWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            if (i == 0) {
                newWords[i] = words[i];
            } else {
                newWords[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
            }
        }
        return result = String.join("", newWords);
    }
}