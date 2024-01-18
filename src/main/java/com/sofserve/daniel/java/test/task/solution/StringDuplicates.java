package com.sofserve.daniel.java.test.task.solution;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashSet;
import java.util.Set;

@Service
public class StringDuplicates {

    private static final String EMPTY_STRING = "";

    public String removeDuplicates(String input) {

        if (!StringUtils.hasText(input)) {
            return EMPTY_STRING;
        }

        StringBuilder cleanInput = new StringBuilder();
        Set<Character> inputChars = new HashSet<>();
        for (Character c : input.toCharArray()) {
            if (inputChars.add(c)) {
                cleanInput.append(c);
            }
        }
        return cleanInput.toString();
    }
}
