package com.sofserve.daniel.java.test.task.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class StringDuplicatesTest {

    private StringDuplicates stringDuplicates;

    @BeforeEach
    void setup(){
        stringDuplicates = new StringDuplicates();
    }

    @ParameterizedTest
    @MethodSource("stringsExamplesForTest")
    void testRemoveDuplicates(String input, String expected) {
        assertEquals (expected, stringDuplicates.removeDuplicates(input));
    }

    private static Stream<Arguments> stringsExamplesForTest() {
        return Stream.of(
                Arguments.of("aabbcc", "abc"),
                Arguments.of("abcd", "abcd"),
                Arguments.of("aaaa", "a"),
                Arguments.of("111222333", "123"),
                Arguments.of("", ""),
                Arguments.of(null, ""),
                Arguments.of("STRING WITH SPACES", "STRING WHPACE"),
                Arguments.of("aa11!!@@", "a1!@")
        );
    }


}
