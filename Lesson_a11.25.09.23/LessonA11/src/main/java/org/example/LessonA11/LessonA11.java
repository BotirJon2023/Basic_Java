package org.example.LessonA11;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LessonA11 {

    private static boolean isPalindrome(String word) {
        List<Character> characterList = new ArrayList<>();

        int counter = 0;
        int wordLength = word.length();

        for (int i = 0; i < wordLength; i++) {
            characterList.add(word.charAt(i));
        }

        ListIterator<Character> iterator = characterList.listIterator();
        ListIterator<Character> prevIterator = characterList.listIterator(characterList.size());

        while (iterator.hasNext() && prevIterator.hasPrevious()) {
            if (iterator.next() != prevIterator.previous()) {
                return false;
            }

            counter++;
            if (counter > wordLength / 2) {
                return true;
            }
        }

        return true;
    }

}
