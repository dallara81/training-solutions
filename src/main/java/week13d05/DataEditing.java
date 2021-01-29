package week13d05;

// Órai feladat - Week 13 Day 05

import java.util.HashSet;
import java.util.Set;

public class DataEditing {

    public int sumOfLetters(String str) {

        Set<Character> characters = new HashSet<>();
        String lowerCaseStr = str.toLowerCase();

        for (Character c : lowerCaseStr.toCharArray()) {
            if (isEnglishLowerCaseChar(c)) {
                characters.add(c);
            }
        }
        return characters.size();
    }

    private boolean isEnglishLowerCaseChar(char c) {
        return (c >= 'a' && c <= 'z');
    }
}