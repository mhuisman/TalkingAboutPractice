package com.kallisti.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class ComputeStringCombinationsTests {
    @Test
    public void testNullSet() throws Exception {
        String input = null;
        Set<String> output = ComputeStringCombinations.compute(input);
        assertEquals(output.size(), 0);
    }

    @Test
    public void testEmptySet() throws Exception {
        String input = "";
        Set<String> output = ComputeStringCombinations.compute(input);
        assertEquals(output.size(), 1);
    }

    @Test
    public void testSingleCharacter() throws Exception {
        String input = "a";
        Set<String> output = ComputeStringCombinations.compute(input);
        assertEquals(output.size(), 2);
    }
}


