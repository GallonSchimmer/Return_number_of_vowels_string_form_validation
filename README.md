# Return_number_of_vowels_string_form_validation
This method provides a clear and effective way to determine the count of vowels in any string of lower-case letters and spaces.

# Vowel Counter

[CodeWars Kata Link](https://www.codewars.com/kata/54ff3102c1bad923760001f3)

## Problem Statement

The goal is to return the number of vowels in a given string. The vowels considered are `a`, `e`, `i`, `o`, and `u` (but not `y`). The input string will consist only of lower-case letters and/or spaces.

## Solution Concept

The solution is based on iterating over each character in the string, checking if it is a vowel and counting it if true. This method provides a clear and effective way to determine the count of vowels in any string of lower-case letters and spaces.

## Learning Objectives

- Understand basic control structures in Java such as loops and conditionals.
- Gain familiarity with the `switch` statement.
- Manage string operations and character manipulation.
- Enhance debugging and logging practices.

## Practical Applications

This concept can be applied in various fields:

- **Optical Character Recognition (OCR) Systems**: Enhancing the accuracy of converting printed text into digital text by focusing on vowel detection and counts.
- **Data Preprocessing in Machine Learning and Data Analysis**: Cleaning and formatting textual data effectively before feeding it into algorithms to improve model accuracy.
- **Form Validation in Software Development**: Ensuring that user input meets certain criteria, such as checking for the presence of vowels in usernames or passwords.

## Algorithm Details

- **Loop Structure**: The algorithm uses a `for` loop to traverse each character of the string.
- **Conditional Checks**: Inside the loop, a `switch` statement is employed to assess whether the character is one of the five vowels (`a`, `e`, `i`, `o`, `u`).
- **Counting Mechanism**: If a vowel is detected, a counter is incremented to keep track of the total number of vowels.
- **Feedback for Non-Vowels**: Non-vowel characters trigger a console output that indicates the non-vowel character detected, aiding in debugging and providing immediate feedback during development.
- **Efficiency**: The algorithm operates with a time complexity of O(n), where n is the length of the string, making it efficient for its intended use.


### Unit Tests

Unit tests are provided to ensure the functionality of the `Vowels` class under various scenarios, including different string lengths, empty strings, and strings with high vowel counts.

```java
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VowelsTest {
    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
        assertEquals("Nope!", 0, Vowels.getCount(""));
        assertEquals("Nope!", 4, Vowels.getCount("pear tree"));
        assertEquals("Nope!", 13, Vowels.getCount("o a kak ushakov lil vo kashu kakao"));
        assertEquals("Nope!", 168, Vowels.getCount("[Insert a long string with a mix of characters]"));
    }
}

