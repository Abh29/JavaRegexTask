# JavaRegexTask
    - using regexes in java to solve some basic propblems, as a part of java training in ITIS

## Task 1
    - Write a regular expression for the date and time between March 6, 1237 12: 00 and February 27, 1978 21: 35 in the format MM/DD/YYYY HH:MM
## Task 2
    - Write a regular expression for a real number with a period.
    - Approach: 0, -6, -0.5, +2, 0,0(64),
    - Not suitable: -0, 001, 0,(35)00, -3,750

## Task 3
    - The input is an array of strings, each string is a binary code. The correct code is a string that consists of either only zeros,
        or only ones, or zeros and ones alternate in it
    - For example, 010101, 11, 00, 101 - correct codes, 0110, 001, 11101-incorrect.
    - Write a solution using regular expressions that outputs line numbers that represent the correct code (use matches)

## Task 4
    - Generate random positive integers. Print the first 10 generated numbers that have a group of 2 even digits at least twice.
    - Stop the generator and print the total number of generated numbers. Check with a regular expression. DON't use mathematical
        operations to analyze numbers. (there are two ways to do this: using matches and using find).