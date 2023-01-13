package balancedWordsCounter;

import java.util.HashMap;
import java.util.Map;

public class BalancedWordsCounter {
    public int count(String input) {
        if (input == null || !isOnlyLetters(input)) {
            throw new RuntimeException("Input is incorrect");
        }
        return getSubstringBalancedWords(input);
    }
    private int getSubstringBalancedWords(String words) {
        int result = 0;
        if (words.length() == 0 || words.length() == 1) {
            return words.length();
        }
        for (int i = 0; i < words.length(); i++) {
            String selectedWord = words.substring(0, i + 1);
            if (isBalancedWord(selectedWord)) result++;
        }
        result += getSubstringBalancedWords(words.substring(1));
        return result;
    }

    private boolean isBalancedWord(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (char character : word.toCharArray()) {
            map.put(character, map.getOrDefault(character, 0) + 1);
        }
        return map.values().stream().distinct().count() <= 1;
    }

    private boolean isOnlyLetters(String word) {
        for (char character : word.toCharArray()) {
            if (!Character.isLetter(character)) {
                return false;
            }
        }
        return true;
    }

}
